/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1cpv.api;

public class CThostFtdcInputForQuoteField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInputForQuoteField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputForQuoteField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcInputForQuoteField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_reserve1_get(swigCPtr, this);
  }

  public void setForQuoteRef(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_ForQuoteRef_set(swigCPtr, this, value);
  }

  public String getForQuoteRef() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_ForQuoteRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_UserID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_InvestUnitID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_reserve2_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_MacAddress_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_InstrumentID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInputForQuoteField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputForQuoteField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcInputForQuoteField(), true);
  }

}
