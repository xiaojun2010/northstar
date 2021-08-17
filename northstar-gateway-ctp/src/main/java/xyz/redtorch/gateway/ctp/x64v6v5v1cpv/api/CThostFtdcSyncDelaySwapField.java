/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1cpv.api;

public class CThostFtdcSyncDelaySwapField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDelaySwapField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDelaySwapField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcSyncDelaySwapField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDelaySwapSeqNo(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_DelaySwapSeqNo_set(swigCPtr, this, value);
  }

  public String getDelaySwapSeqNo() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_DelaySwapSeqNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_InvestorID_get(swigCPtr, this);
  }

  public void setFromCurrencyID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_FromCurrencyID_set(swigCPtr, this, value);
  }

  public String getFromCurrencyID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_FromCurrencyID_get(swigCPtr, this);
  }

  public void setFromAmount(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_FromAmount_set(swigCPtr, this, value);
  }

  public double getFromAmount() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_FromAmount_get(swigCPtr, this);
  }

  public void setFromFrozenSwap(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_FromFrozenSwap_set(swigCPtr, this, value);
  }

  public double getFromFrozenSwap() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_FromFrozenSwap_get(swigCPtr, this);
  }

  public void setFromRemainSwap(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_FromRemainSwap_set(swigCPtr, this, value);
  }

  public double getFromRemainSwap() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_FromRemainSwap_get(swigCPtr, this);
  }

  public void setToCurrencyID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_ToCurrencyID_set(swigCPtr, this, value);
  }

  public String getToCurrencyID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_ToCurrencyID_get(swigCPtr, this);
  }

  public void setToAmount(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_ToAmount_set(swigCPtr, this, value);
  }

  public double getToAmount() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_ToAmount_get(swigCPtr, this);
  }

  public void setIsManualSwap(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_IsManualSwap_set(swigCPtr, this, value);
  }

  public int getIsManualSwap() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_IsManualSwap_get(swigCPtr, this);
  }

  public void setIsAllRemainSetZero(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_IsAllRemainSetZero_set(swigCPtr, this, value);
  }

  public int getIsAllRemainSetZero() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcSyncDelaySwapField_IsAllRemainSetZero_get(swigCPtr, this);
  }

  public CThostFtdcSyncDelaySwapField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcSyncDelaySwapField(), true);
  }

}
