package tech.xuanwu.northstar.persistance.po;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import xyz.redtorch.pb.CoreField.BarField;

@Data
@Document
public class Bar implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7607828493777049884L;
	private String unifiedSymbol;
	private String gatewayId;
	private String tradingDay;
	private String actionDay;
	private String actionTime;
	private long actionTimestamp;
	private double openPrice;
	private double highPrice;
	private double lowPrice;
	private double closePrice;
	private double openInterest;
	private double openInterestDelta;
	private long volume;
	private long volumeDelta;
	private double turnover;
	private double turnoverDelta;
	private long numTrades;
	private long numTradesDelta;
	private double preOpenInterest;
	private double preClosePrice;
	private double preSettlePrice;
	
	private List<Tick> minTicks;
	
	public static Bar convertFrom(BarField bar) {
		Bar po = new Bar();
		BeanUtils.copyProperties(bar.toBuilder(), po);
		return po;
	}
	
	public BarField convertTo() {
		BarField.Builder bb = BarField.newBuilder();
		BeanUtils.copyProperties(this, bb);
		return bb.build();
	}
}
