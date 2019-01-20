package com.excel.utility;


import java.math.BigDecimal;

public class PlanClass {

	public BigDecimal classId;
	public Integer classTypeCode;
	public String className;
	public String classCode;
	public Boolean isExcluded;
	public BigDecimal getClassId() {
		return classId;
	}
	public void setClassId(BigDecimal classId) {
		this.classId = classId;
	}
	public Integer getClassTypeCode() {
		return classTypeCode;
	}
	public void setClassTypeCode(Integer classTypeCode) {
		this.classTypeCode = classTypeCode;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public Boolean getIsExcluded() {
		return isExcluded;
	}
	public void setIsExcluded(Boolean isExcluded) {
		this.isExcluded = isExcluded;
	}
	@Override
	public String toString() {
		return "PlanClass [classId=" + classId + ", classTypeCode=" + classTypeCode + ", className=" + className
				+ ", classCode=" + classCode + ", isExcluded=" + isExcluded + "]";
	}
	
}
