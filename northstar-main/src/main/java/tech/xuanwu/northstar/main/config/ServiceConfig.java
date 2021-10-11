package tech.xuanwu.northstar.main.config;

import java.util.concurrent.ConcurrentMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import tech.xuanwu.northstar.common.event.InternalEventBus;
import tech.xuanwu.northstar.common.model.ContractManager;
import tech.xuanwu.northstar.domain.GatewayAndConnectionManager;
import tech.xuanwu.northstar.domain.account.TradeDayAccount;
import tech.xuanwu.northstar.engine.broadcast.SocketIOMessageEngine;
import tech.xuanwu.northstar.engine.event.FastEventEngine;
import tech.xuanwu.northstar.gateway.sim.trade.SimMarket;
import tech.xuanwu.northstar.main.manager.ModuleManager;
import tech.xuanwu.northstar.main.persistence.GatewayRepository;
import tech.xuanwu.northstar.main.persistence.MarketDataRepository;
import tech.xuanwu.northstar.main.persistence.ModuleRepository;
import tech.xuanwu.northstar.main.service.AccountService;
import tech.xuanwu.northstar.main.service.DataSyncService;
import tech.xuanwu.northstar.main.service.GatewayService;
import tech.xuanwu.northstar.main.service.ModuleService;
import tech.xuanwu.northstar.main.service.SMSTradeService;

@DependsOn({
	"internalDispatcher",
	"broadcastEventDispatcher",
	"pluginDispatcher",
	"strategyDispatcher",
	"accountEventHandler",
	"contractEventHandler",
	"connectionEventHandler",
	"tradeEventHandler",
	"ctpGatewayFactory",
	"simGatewayFactory",
	"ctpSimGatewayFactory"
	})
@Configuration
public class ServiceConfig {

	@Bean
	public AccountService accountService(ConcurrentMap<String, TradeDayAccount> accountMap) {
		return new AccountService(accountMap);
	}
	
	@Bean
	public GatewayService gatewayService(GatewayAndConnectionManager gatewayConnMgr, GatewayRepository gatewayRepo,
			MarketDataRepository mdRepo, ModuleRepository moduleRepo, InternalEventBus eventBus, SimMarket simMarket) {
		return new GatewayService(gatewayConnMgr, gatewayRepo, mdRepo, moduleRepo, eventBus, simMarket);
	}
	
	@Bean
	public DataSyncService dataSyncService(ContractManager contractMgr, SocketIOMessageEngine msgEngine, MarketDataRepository mdRepo,
			ConcurrentMap<String, TradeDayAccount> accountMap) {
		return new DataSyncService(contractMgr, msgEngine, mdRepo, accountMap);
	}
	
	@Bean
	public ModuleService moduleService(ApplicationContext ctx, ModuleRepository moduleRepo, MarketDataRepository mdRepo,
			ModuleManager mdlMgr, GatewayAndConnectionManager gatewayConnMgr, ContractManager contractMgr) {
		return new ModuleService(ctx, moduleRepo, mdRepo, mdlMgr, gatewayConnMgr, contractMgr);
	}
	
	@Bean
	public SMSTradeService smsTradeService(FastEventEngine feEngine) {
		return new SMSTradeService(feEngine);
	}
}