package com.excel.utility;

import java.math.BigDecimal;

public class PlanEligibility {

	public BigDecimal planEligibilityId;
	public Integer computationPeriodC;
	public String elecTrfrAllowC;
	public String rolloverContributionCode;
	public String ignoreHoursCode;
	public BigDecimal getPlanEligibilityId() {
		return planEligibilityId;
	}
	public void setPlanEligibilityId(BigDecimal planEligibilityId) {
		this.planEligibilityId = planEligibilityId;
	}
	public Integer getComputationPeriodC() {
		return computationPeriodC;
	}
	public void setComputationPeriodC(Integer computationPeriodC) {
		this.computationPeriodC = computationPeriodC;
	}
	public String getElecTrfrAllowC() {
		return elecTrfrAllowC;
	}
	public void setElecTrfrAllowC(String elecTrfrAllowC) {
		this.elecTrfrAllowC = elecTrfrAllowC;
	}
	public String getRolloverContributionCode() {
		return rolloverContributionCode;
	}
	public void setRolloverContributionCode(String rolloverContributionCode) {
		this.rolloverContributionCode = rolloverContributionCode;
	}
	public String getIgnoreHoursCode() {
		return ignoreHoursCode;
	}
	public void setIgnoreHoursCode(String ignoreHoursCode) {
		this.ignoreHoursCode = ignoreHoursCode;
	}
	@Override
	public String toString() {
		return "PlanEligibilty [planEligibilityId=" + planEligibilityId + ", computationPeriodC=" + computationPeriodC
				+ ", elecTrfrAllowC=" + elecTrfrAllowC + ", rolloverContributionCode=" + rolloverContributionCode
				+ ", ignoreHoursCode=" + ignoreHoursCode + "]";
	}
	
}
