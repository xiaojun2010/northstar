/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1cpv.api;

public class CThostFtdcVerifyFuturePasswordAndCustInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcVerifyFuturePasswordAndCustInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcVerifyFuturePasswordAndCustInfoField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcVerifyFuturePasswordAndCustInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCustomerName(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CustType_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_Password_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CurrencyID_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcVerifyFuturePasswordAndCustInfoField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcVerifyFuturePasswordAndCustInfoField(), true);
  }

}
