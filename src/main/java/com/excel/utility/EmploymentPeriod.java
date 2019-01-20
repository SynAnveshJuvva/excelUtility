package com.excel.utility;


import java.util.Date;

public class EmploymentPeriod {
	
	public Date employmentPeriodBegin;
	public Date employmentPeriodEnd;
	
	public Date getEmploymentPeriodBegin() {
		return employmentPeriodBegin;
	}
	public void setEmploymentPeriodBegin(Date employmentPeriodBegin) {
		this.employmentPeriodBegin = employmentPeriodBegin;
	}
	public Date getEmploymentPeriodEnd() {
		return employmentPeriodEnd;
	}
	public void setEmploymentPeriodEnd(Date employmentPeriodEnd) {
		this.employmentPeriodEnd = employmentPeriodEnd;
	}
	@Override
	public String toString() {
		return "EmploymentPeriod [employmentPeriodBegin=" + employmentPeriodBegin + ", employmentPeriodEnd="
				+ employmentPeriodEnd + "]";
	}
	
}
