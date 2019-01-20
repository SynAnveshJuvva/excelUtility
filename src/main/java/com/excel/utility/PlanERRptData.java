package com.excel.utility;

import java.math.BigDecimal;

public class PlanERRptData {
	
	public BigDecimal enrlProvGrpI;
	public String statC;
	public BigDecimal sourceI;
	public BigDecimal employerMatchPercent;
	public BigDecimal getEnrlProvGrpI() {
		return enrlProvGrpI;
	}
	public void setEnrlProvGrpI(BigDecimal enrlProvGrpI) {
		this.enrlProvGrpI = enrlProvGrpI;
	}
	public String getStatC() {
		return statC;
	}
	public void setStatC(String statC) {
		this.statC = statC;
	}
	public BigDecimal getSourceI() {
		return sourceI;
	}
	public void setSourceI(BigDecimal sourceI) {
		this.sourceI = sourceI;
	}
	public BigDecimal getEmployerMatchPercent() {
		return employerMatchPercent;
	}
	public void setEmployerMatchPercent(BigDecimal employerMatchPercent) {
		this.employerMatchPercent = employerMatchPercent;
	}
	@Override
	public String toString() {
		return "PlanERRptData [enrlProvGrpI=" + enrlProvGrpI + ", statC=" + statC + ", sourceI=" + sourceI
				+ ", employerMatchPercent=" + employerMatchPercent + "]";
	}

}
