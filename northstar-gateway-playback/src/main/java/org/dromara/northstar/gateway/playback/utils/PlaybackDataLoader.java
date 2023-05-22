package org.dromara.northstar.gateway.playback.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

import org.dromara.northstar.common.constant.ChannelType;
import org.dromara.northstar.common.utils.MarketDataLoadingUtils;
import org.dromara.northstar.gateway.playback.PlaybackDataServiceManager;

import lombok.extern.slf4j.Slf4j;
import xyz.redtorch.pb.CoreField.BarField;
import xyz.redtorch.pb.CoreField.ContractField;

@Slf4j
public class PlaybackDataLoader {

	private PlaybackDataServiceManager dsMgr;
	
	private String gatewayId;
	
	private MarketDataLoadingUtils utils = new MarketDataLoadingUtils();
	
	public PlaybackDataLoader(String playbackGatewayId, PlaybackDataServiceManager dsMgr) {
		this.dsMgr = dsMgr;
		this.gatewayId = playbackGatewayId;
	}
	
	public List<BarField> loadMinuteData(LocalDateTime fromStartDateTime, ContractField contract){
		if(log.isTraceEnabled()) {
			log.trace("正在读取 [{}] 至 {} 一周内的1分钟K线回放数据", contract.getName(), fromStartDateTime);
		}
		LocalDate queryStart;
		LocalDate queryEnd;
		long fromStartTimestamp = fromStartDateTime.toInstant(ZoneOffset.ofHours(8)).toEpochMilli();
		if(fromStartDateTime.toLocalDate().getDayOfWeek().getValue() >= 5) {
			queryStart = utils.getFridayOfThisWeek(fromStartDateTime.toLocalDate());
			queryEnd = queryStart.plusWeeks(1);
		} else {
			queryEnd = utils.getFridayOfThisWeek(fromStartDateTime.toLocalDate());
			queryStart = queryEnd.minusWeeks(1);
		}
		return enhanceData(dsMgr.getMinutelyData(contract, queryStart, queryEnd)
				.stream()
				.filter(bar -> bar.getActionTimestamp() >= fromStartTimestamp)
				.toList(), contract.getUnifiedSymbol());
	}
	
	public List<BarField> loadMinuteDataRaw(LocalDate startDate, LocalDate endDate, ContractField contract){
		if(log.isTraceEnabled()) {
			log.trace("正在读取 [{}] {} 至 {} 的1分钟K线回放数据", contract.getName(), startDate, endDate);
		}
		return enhanceData(dsMgr.getMinutelyData(contract, startDate, endDate), contract.getUnifiedSymbol());
	}
	
	public List<BarField> loadTradeDayDataRaw(LocalDate startDate, LocalDate endDate, ContractField contract){
		if(log.isTraceEnabled()) {
			log.trace("正在读取 [{}] {} 至 {} 的日K线回放数据", contract.getName(), startDate, endDate);
		}
		return enhanceData(dsMgr.getMinutelyData(contract, startDate, endDate), contract.getUnifiedSymbol());
	}
	
	private List<BarField> enhanceData(List<BarField> list, String unifiedSymbol) {
		List<BarField> results = new ArrayList<>(list.size());
		for(int i=0; i<list.size(); i++) {
			double openInterestDelta = 0;
			if(i > 0) {
				openInterestDelta = list.get(i).getOpenInterest() - list.get(i - 1).getOpenInterest();
			}
			results.add(list.get(i).toBuilder()
					.setGatewayId(gatewayId)
					.setChannelType(ChannelType.PLAYBACK.toString())
					.setOpenInterestDelta(openInterestDelta)
					.build());
		}
		if(results.isEmpty()) {
			log.warn("当前查询时间 [{}] 合约数据为空", unifiedSymbol);
		}
		return results;
	}
}
