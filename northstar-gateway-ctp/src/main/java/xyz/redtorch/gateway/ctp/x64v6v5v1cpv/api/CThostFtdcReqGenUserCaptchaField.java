/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1cpv.api;

public class CThostFtdcReqGenUserCaptchaField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqGenUserCaptchaField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqGenUserCaptchaField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcReqGenUserCaptchaField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqGenUserCaptchaField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqGenUserCaptchaField_TradingDay_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqGenUserCaptchaField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqGenUserCaptchaField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcReqGenUserCaptchaField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcReqGenUserCaptchaField_UserID_get(swigCPtr, this);
  }

  public CThostFtdcReqGenUserCaptchaField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcReqGenUserCaptchaField(), true);
  }

}
