package com.excel.utility;


import java.math.BigDecimal;

public class OutSrc {
	
	public BigDecimal outsrcI;
	public Integer serviceTypeCode;

	public BigDecimal getOutsrcI() {
		return outsrcI;
	}
	public void setOutsrcI(BigDecimal outsrcI) {
		this.outsrcI = outsrcI;
	}
	public Integer getServiceTypeCode() {
		return serviceTypeCode;
	}
	public void setServiceTypeCode(Integer serviceTypeCode) {
		this.serviceTypeCode = serviceTypeCode;
	}
	@Override
	public String toString() {
		return "OutSrc [outsrcI=" + outsrcI + ", serviceTypeCode=" + serviceTypeCode + "]";
	}

}
