package tech.xuanwu.northstar.manager;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import tech.xuanwu.northstar.common.event.AbstractEventHandler;
import tech.xuanwu.northstar.common.event.NorthstarEvent;
import tech.xuanwu.northstar.common.event.NorthstarEventType;
import tech.xuanwu.northstar.strategy.common.constants.ModuleState;
import tech.xuanwu.northstar.strategy.common.model.ModulePerformance;
import tech.xuanwu.northstar.strategy.common.model.StrategyModule;
import xyz.redtorch.pb.CoreField.AccountField;
import xyz.redtorch.pb.CoreField.BarField;
import xyz.redtorch.pb.CoreField.OrderField;
import xyz.redtorch.pb.CoreField.TickField;
import xyz.redtorch.pb.CoreField.TradeField;

/**
 * 用于管理与缓存模组对象
 * @author KevinHuangwl
 *
 */
public class ModuleManager extends AbstractEventHandler {
	
	private ConcurrentHashMap<String, StrategyModule> moduleMap = new ConcurrentHashMap<>(50);

	private Set<NorthstarEventType> eventSet = new HashSet<>() {
		private static final long serialVersionUID = 1L;

		{
			add(NorthstarEventType.ACCOUNT);
			add(NorthstarEventType.TRADE);
			add(NorthstarEventType.ORDER);
			add(NorthstarEventType.TICK);
			add(NorthstarEventType.IDX_TICK);
			add(NorthstarEventType.BAR);
		}
	};
	
	
	public void addModule(StrategyModule module) {
		moduleMap.put(module.getName(), module);
	}
	
	public void removeModule(String name) {
		if(moduleMap.get(name).getState() != ModuleState.EMPTY) {
			throw new IllegalStateException("模组并非处于空仓状态，不允许移除");
		}
		moduleMap.remove(name);
	}
	
	public ModulePerformance getModulePerformance(String name) {
		return moduleMap.get(name).getPerformance();
	}
	
	public void toggleState(String name) {
		moduleMap.get(name).toggleRunningState();
	}
	
	public void onTick(TickField tick) {
		moduleMap.values().forEach(m -> m.onTick(tick));
	}
	
	public void onBar(BarField bar) {
		moduleMap.values().forEach(m -> m.onBar(bar));
	}
	
	public void onOrder(OrderField order) {
		moduleMap.values().forEach(m -> m.onOrder(order));
	}
	
	public void onTrade(TradeField trade) {
		moduleMap.values().forEach(m -> m.onTrade(trade));
	}
	
	public void onAccount(AccountField account) {
		moduleMap.values().forEach(m -> m.onAccount(account));
	}

	@Override
	public boolean canHandle(NorthstarEventType eventType) {
		return eventSet.contains(eventType);
	}

	@Override
	protected void doHandle(NorthstarEvent e) {
		switch(e.getEvent()){
		case TICK:
		case IDX_TICK:
			onTick((TickField) e.getData());
			break;
		case BAR:
			onBar((BarField) e.getData());
			break;
		case ORDER:
			onOrder((OrderField) e.getData());
			break;
		case TRADE:
			onTrade((TradeField) e.getData());
			break;
		case ACCOUNT:
			onAccount((AccountField) e.getData());
			break;
		default:
			throw new IllegalStateException("未定义该事件-[" + e.getEvent() + "] 的处理方案");
		}
	}
	
}
