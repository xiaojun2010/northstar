/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1cpv.api;

public class CThostFtdcSecAgentTradeInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSecAgentTradeInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSecAgentTradeInfoField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcSecAgentTradeInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSecAgentTradeInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSecAgentTradeInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerSecAgentID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSecAgentTradeInfoField_BrokerSecAgentID_set(swigCPtr, this, value);
  }

  public String getBrokerSecAgentID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSecAgentTradeInfoField_BrokerSecAgentID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSecAgentTradeInfoField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSecAgentTradeInfoField_InvestorID_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSecAgentTradeInfoField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSecAgentTradeInfoField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcSecAgentTradeInfoField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcSecAgentTradeInfoField(), true);
  }

}
