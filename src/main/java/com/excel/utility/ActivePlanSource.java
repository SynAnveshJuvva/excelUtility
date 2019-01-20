package com.excel.utility;

import java.math.BigDecimal;

public class ActivePlanSource {
	public BigDecimal sourceId;
	public String sourceName;
	public Integer masterSourceTypeCode;
	
	public BigDecimal getSourceId() {
		return sourceId;
	}
	public void setSourceId(BigDecimal sourceId) {
		this.sourceId = sourceId;
	}
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	public Integer getMasterSourceTypeCode() {
		return masterSourceTypeCode;
	}
	public void setMasterSourceTypeCode(Integer masterSourceTypeCode) {
		this.masterSourceTypeCode = masterSourceTypeCode;
	}
	@Override
	public String toString() {
		return "ActivePlanSource [sourceId=" + sourceId + ", sourceName=" + sourceName + ", masterSourceTypeCode="
				+ masterSourceTypeCode + "]";
	}
	
	
}
