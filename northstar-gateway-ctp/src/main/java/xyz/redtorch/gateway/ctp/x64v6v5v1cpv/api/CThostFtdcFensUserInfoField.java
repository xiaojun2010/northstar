/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1cpv.api;

public class CThostFtdcFensUserInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcFensUserInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcFensUserInfoField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcFensUserInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcFensUserInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcFensUserInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcFensUserInfoField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcFensUserInfoField_UserID_get(swigCPtr, this);
  }

  public void setLoginMode(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcFensUserInfoField_LoginMode_set(swigCPtr, this, value);
  }

  public char getLoginMode() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcFensUserInfoField_LoginMode_get(swigCPtr, this);
  }

  public CThostFtdcFensUserInfoField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcFensUserInfoField(), true);
  }

}
