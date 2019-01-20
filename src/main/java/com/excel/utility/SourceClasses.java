package com.excel.utility;

import java.math.BigDecimal;

public class SourceClasses {
	
	public BigDecimal SourceId;
	public BigDecimal classId;
	public BigDecimal exclusionC;
	
	public BigDecimal getSourceId() {
		return SourceId;
	}
	public void setSourceId(BigDecimal sourceId) {
		SourceId = sourceId;
	}
	public BigDecimal getClassId() {
		return classId;
	}
	public void setClassId(BigDecimal classId) {
		this.classId = classId;
	}
	public BigDecimal getExclusionC() {
		return exclusionC;
	}
	public void setExclusionC(BigDecimal exclusionC) {
		this.exclusionC = exclusionC;
	}
	@Override
	public String toString() {
		return "SourceClass [SourceId=" + SourceId + ", classId=" + classId + ", exclusionC=" + exclusionC + "]";
	}
	
}
