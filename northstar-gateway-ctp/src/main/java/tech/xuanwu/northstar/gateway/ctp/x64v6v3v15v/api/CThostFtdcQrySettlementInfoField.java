/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v15v.api;

public class CThostFtdcQrySettlementInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQrySettlementInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQrySettlementInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v3v15x64apiJNI.delete_CThostFtdcQrySettlementInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcQrySettlementInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcQrySettlementInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcQrySettlementInfoField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcQrySettlementInfoField_InvestorID_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcQrySettlementInfoField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v15x64apiJNI.CThostFtdcQrySettlementInfoField_TradingDay_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcQrySettlementInfoField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcQrySettlementInfoField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcQrySettlementInfoField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcQrySettlementInfoField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcQrySettlementInfoField() {
    this(jctpv6v3v15x64apiJNI.new_CThostFtdcQrySettlementInfoField(), true);
  }

}