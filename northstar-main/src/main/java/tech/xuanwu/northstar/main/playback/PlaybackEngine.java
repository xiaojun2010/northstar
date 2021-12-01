package tech.xuanwu.northstar.main.playback;

import java.util.Map;
import java.util.PriorityQueue;

import lombok.extern.slf4j.Slf4j;
import tech.xuanwu.northstar.common.event.NorthstarEvent;
import tech.xuanwu.northstar.common.event.NorthstarEventType;
import tech.xuanwu.northstar.domain.strategy.SandboxModuleManager;
import tech.xuanwu.northstar.gateway.sim.trade.SimMarket;
import tech.xuanwu.northstar.main.playback.PlaybackTask.DataType;
import xyz.redtorch.pb.CoreField.BarField;
import xyz.redtorch.pb.CoreField.TickField;

/**
 * 回测引擎负责把原始的历史行情数据按时间规则重放来模拟真实行情
 * @author KevinHuangwl
 *
 */
@Slf4j
public class PlaybackEngine {
	
	private SimMarket simMarket;
	
	private SandboxModuleManager moduleMgr;
	
	public PlaybackEngine(SimMarket simMarket, SandboxModuleManager moduleMgr) {
		this.simMarket = simMarket;
		this.moduleMgr = moduleMgr;
	}

	@SuppressWarnings("unchecked")
	public void play(PlaybackTask task) {
		log.info("################# 开始回测 #################");
		
		while(!task.isDone()) {
			Map<DataType, PriorityQueue<?>> batchDataMap = task.nextBatchData();
			PriorityQueue<TickField> tickQ = (PriorityQueue<TickField>) batchDataMap.get(DataType.TICK);
			PriorityQueue<BarField> barQ = (PriorityQueue<BarField>) batchDataMap.get(DataType.BAR);
			
			while(!barQ.isEmpty()) {
				BarField bar = barQ.poll();
				log.info("开始回放数据：{} {} {}", bar.getUnifiedSymbol(), bar.getActionDay(), bar.getActionTime());
				while(!tickQ.isEmpty() && tickQ.peek().getActionTimestamp() < bar.getActionTimestamp() + 60000) {					
					TickField tick = tickQ.poll();
					simMarket.onTick(tick);
					moduleMgr.onEvent(new NorthstarEvent(NorthstarEventType.TICK, tick));
				}
				moduleMgr.onEvent(new NorthstarEvent(NorthstarEventType.BAR, bar));
			}
		}
		log.info("################# 回测结束 #################");
	}
	
	
	
}
