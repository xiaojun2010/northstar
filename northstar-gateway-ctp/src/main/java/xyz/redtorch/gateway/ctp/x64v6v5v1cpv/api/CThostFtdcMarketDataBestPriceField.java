/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1cpv.api;

public class CThostFtdcMarketDataBestPriceField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataBestPriceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataBestPriceField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcMarketDataBestPriceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBidPrice1(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcMarketDataBestPriceField_BidPrice1_set(swigCPtr, this, value);
  }

  public double getBidPrice1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcMarketDataBestPriceField_BidPrice1_get(swigCPtr, this);
  }

  public void setBidVolume1(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcMarketDataBestPriceField_BidVolume1_set(swigCPtr, this, value);
  }

  public int getBidVolume1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcMarketDataBestPriceField_BidVolume1_get(swigCPtr, this);
  }

  public void setAskPrice1(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcMarketDataBestPriceField_AskPrice1_set(swigCPtr, this, value);
  }

  public double getAskPrice1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcMarketDataBestPriceField_AskPrice1_get(swigCPtr, this);
  }

  public void setAskVolume1(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcMarketDataBestPriceField_AskVolume1_set(swigCPtr, this, value);
  }

  public int getAskVolume1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcMarketDataBestPriceField_AskVolume1_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataBestPriceField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcMarketDataBestPriceField(), true);
  }

}
