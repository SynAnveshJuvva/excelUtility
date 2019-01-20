package com.excel.utility;

import java.math.BigDecimal;
import java.util.Date;

public class EligKitSourceRule {

	public BigDecimal SourceId;
	public String kitNumber;
	public Integer statusCode;
	public Date effectiveDate;
	public Integer mailCode;
	public BigDecimal leadTime;
	public BigDecimal percentHoursRequired;
	public String podCode;
	@Override
	public String toString() {
		return "EligKitSourceRule [SourceId=" + SourceId + ", kitNumber=" + kitNumber + ", statusCode=" + statusCode
				+ ", effectiveDate=" + effectiveDate + ", mailCode=" + mailCode + ", leadTime=" + leadTime
				+ ", percentHoursRequired=" + percentHoursRequired + ", podCode=" + podCode + ", mailSourceCode="
				+ mailSourceCode + ", rehireTermPerCode=" + rehireTermPerCode + "]";
	}
	public Integer mailSourceCode;
	public Integer rehireTermPerCode;
	public BigDecimal getSourceId() {
		return SourceId;
	}
	public void setSourceId(BigDecimal sourceId) {
		SourceId = sourceId;
	}
	public String getKitNumber() {
		return kitNumber;
	}
	public void setKitNumber(String kitNumber) {
		this.kitNumber = kitNumber;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Integer getMailCode() {
		return mailCode;
	}
	public void setMailCode(Integer mailCode) {
		this.mailCode = mailCode;
	}
	public BigDecimal getLeadTime() {
		return leadTime;
	}
	public void setLeadTime(BigDecimal leadTime) {
		this.leadTime = leadTime;
	}
	public BigDecimal getPercentHoursRequired() {
		return percentHoursRequired;
	}
	public void setPercentHoursRequired(BigDecimal percentHoursRequired) {
		this.percentHoursRequired = percentHoursRequired;
	}
	public String getPodCode() {
		return podCode;
	}
	public void setPodCode(String podCode) {
		this.podCode = podCode;
	}
	public Integer getMailSourceCode() {
		return mailSourceCode;
	}
	public void setMailSourceCode(Integer mailSourceCode) {
		this.mailSourceCode = mailSourceCode;
	}
	public Integer getRehireTermPerCode() {
		return rehireTermPerCode;
	}
	public void setRehireTermPerCode(Integer rehireTermPerCode) {
		this.rehireTermPerCode = rehireTermPerCode;
	}
}
