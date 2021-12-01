package tech.xuanwu.northstar.strategy.cta.module.signal;

import java.util.concurrent.ThreadLocalRandom;

import lombok.extern.slf4j.Slf4j;
import tech.xuanwu.northstar.strategy.api.AbstractSignalPolicy;
import tech.xuanwu.northstar.strategy.api.SignalPolicy;
import tech.xuanwu.northstar.strategy.api.annotation.Setting;
import tech.xuanwu.northstar.strategy.api.annotation.StrategicComponent;
import tech.xuanwu.northstar.strategy.api.constant.ModuleState;
import tech.xuanwu.northstar.strategy.api.constant.Signal;
import tech.xuanwu.northstar.strategy.api.event.ModuleEvent;
import tech.xuanwu.northstar.strategy.api.event.ModuleEventType;
import tech.xuanwu.northstar.strategy.api.model.DynamicParams;
import tech.xuanwu.northstar.strategy.cta.module.constant.Naming;
import xyz.redtorch.pb.CoreField.BarField;
import xyz.redtorch.pb.CoreField.TickField;

/**
 * 本示例用于展示写一个策略的必要元素
 * 注意：定义完一个类后，需要注册成spring bean。因为项目依赖了spring bean机制来管理，而不是直接的类扫描
 * 
 * ## 风险提示：该策略仅作技术分享，据此交易，风险自担 ##
 * @author KevinHuangwl
 *
 */
@Slf4j
@StrategicComponent(Naming.SAMPLE_SIGNAL_POLICY)	// 该注解是用于给策略命名用的
public class SampleSignalPolicy extends AbstractSignalPolicy
	implements SignalPolicy //	所有的策略都应该是DynamicParamsAware的实现类
{
	private int actionInterval;
	
	private long nextActionTime = -1;
	
	/**
	 * 获取策略的动态参数对象
	 */
	@Override
	public DynamicParams getDynamicParams() {
		return new InitParams();
	}

	/**
	 * 策略的所有参数初始化逻辑
	 */
	@Override
	public void initWithParams(DynamicParams params) {
		InitParams initParams = (InitParams) params;
		this.bindedUnifiedSymbol = initParams.bindedUnifiedSymbol;
		this.actionInterval = initParams.actionInterval;
	}
	
	/**
	 * 定义该策略的参数，类名必须为InitParams，必须继承DynamicParams，必须是个static类
	 * @author KevinHuangwl
	 */
	public static class InitParams extends DynamicParams{
		
		@Setting(value="绑定合约", order=10)	// Label注解用于定义属性的元信息
		private String bindedUnifiedSymbol;		// 属性可以为任意多个，当元素为多个时order值用于控制前端的显示顺序
		
		@Setting(value="操作间隔", order=20, unit="秒")	// 可以声明单位
		private int actionInterval;
		
	}
	
	/**
	 * 策略逻辑驱动入口
	 * 每个TICK触发
	 */
	@Override
	public void onTick(TickField tick) {
		log.info("策略每个TICK触发: {}", tick.getActionTime());
		long now = tick.getActionTimestamp();
		//初始状态下，等待10秒才开始交易
		if(nextActionTime < 0) {
			nextActionTime = now + 10000;
		}
		if(now > nextActionTime) {
			nextActionTime = now + actionInterval * 1000;
			if(currentState == ModuleState.EMPTY) {
				boolean flag = ThreadLocalRandom.current().nextBoolean();
				moduleEventBus.post(new ModuleEvent<>(ModuleEventType.SIGNAL_CREATED, flag ? Signal.SELL_OPEN : Signal.BUY_OPEN));
			}
			if(currentState == ModuleState.HOLDING_LONG) {	
				moduleEventBus.post(new ModuleEvent<>(ModuleEventType.SIGNAL_CREATED, Signal.SELL_CLOSE));
			}
			if(currentState == ModuleState.HOLDING_SHORT) {			
				moduleEventBus.post(new ModuleEvent<>(ModuleEventType.SIGNAL_CREATED, Signal.BUY_CLOSE));
			}
		}
	}

	/**
	 * 策略逻辑驱动入口
	 * 每分钟触发
	 */
	@Override
	public void onBar(BarField bar) {
		log.info("策略每分钟触发");
	}

	@Override
	public String name() {
		return Naming.SAMPLE_SIGNAL_POLICY;
	}
	
}
