package com.excel.utility;


import java.math.BigDecimal;

public class PartEnrlXref {

	public BigDecimal enrlProvGrpI;
	public BigDecimal partEnrlI;
	public BigDecimal personI;
	public String caseNo;
	public String socSecNo;
	public BigDecimal getEnrlProvGrpI() {
		return enrlProvGrpI;
	}
	public void setEnrlProvGrpI(BigDecimal enrlProvGrpI) {
		this.enrlProvGrpI = enrlProvGrpI;
	}
	public BigDecimal getPartEnrlI() {
		return partEnrlI;
	}
	public void setPartEnrlI(BigDecimal partEnrlI) {
		this.partEnrlI = partEnrlI;
	}
	public BigDecimal getPersonI() {
		return personI;
	}
	public void setPersonI(BigDecimal personI) {
		this.personI = personI;
	}
	public String getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}
	public String getSocSecNo() {
		return socSecNo;
	}
	public void setSocSecNo(String socSecNo) {
		this.socSecNo = socSecNo;
	}
	@Override
	public String toString() {
		return "PartEnrlXref [enrlProvGrpI=" + enrlProvGrpI + ", partEnrlI=" + partEnrlI + ", personI=" + personI
				+ ", caseNo=" + caseNo + ", socSecNo=" + socSecNo + "]";
	}

}
