package com.excel.utility;


import java.math.BigDecimal;
import java.util.Date;

public class EligSourceRule {
	
	public Date effectiveDate;
	public BigDecimal SourceId;
	public Integer rehireTrackingCode;
	public Integer edsHireCode;
	public Integer eligibilityPreTaxReductionCode;
	public Integer ageCalculationCode;
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	@Override
	public String toString() {
		return "EligSourceRule [effectiveDate=" + effectiveDate + ", sourceId=" + SourceId + ", rehireTrackingCode="
				+ rehireTrackingCode + ", edsHireCode=" + edsHireCode + ", eligibilityPreTaxReductionCode="
				+ eligibilityPreTaxReductionCode + ", ageCalculationCode=" + ageCalculationCode + "]";
	}
	public BigDecimal getSourceId() {
		return SourceId;
	}
	public void setSourceId(BigDecimal sourceId) {
		SourceId = sourceId;
	}
	public Integer getRehireTrackingCode() {
		return rehireTrackingCode;
	}
	public void setRehireTrackingCode(Integer rehireTrackingCode) {
		this.rehireTrackingCode = rehireTrackingCode;
	}
	public Integer getEdsHireCode() {
		return edsHireCode;
	}
	public void setEdsHireCode(Integer edsHireCode) {
		this.edsHireCode = edsHireCode;
	}
	public Integer getEligibilityPreTaxReductionCode() {
		return eligibilityPreTaxReductionCode;
	}
	public void setEligibilityPreTaxReductionCode(Integer eligibilityPreTaxReductionCode) {
		this.eligibilityPreTaxReductionCode = eligibilityPreTaxReductionCode;
	}
	public Integer getAgeCalculationCode() {
		return ageCalculationCode;
	}
	public void setAgeCalculationCode(Integer ageCalculationCode) {
		this.ageCalculationCode = ageCalculationCode;
	}


}
