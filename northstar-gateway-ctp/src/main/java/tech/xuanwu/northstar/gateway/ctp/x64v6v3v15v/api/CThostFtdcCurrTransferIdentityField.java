/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v15v.api;

public class CThostFtdcCurrTransferIdentityField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCurrTransferIdentityField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCurrTransferIdentityField obj) {
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
        jctpv6v3v15x64apiJNI.delete_CThostFtdcCurrTransferIdentityField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIdentityID(int value) {
    jctpv6v3v15x64apiJNI.CThostFtdcCurrTransferIdentityField_IdentityID_set(swigCPtr, this, value);
  }

  public int getIdentityID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcCurrTransferIdentityField_IdentityID_get(swigCPtr, this);
  }

  public CThostFtdcCurrTransferIdentityField() {
    this(jctpv6v3v15x64apiJNI.new_CThostFtdcCurrTransferIdentityField(), true);
  }

}