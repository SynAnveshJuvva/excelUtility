package com.excel.utility;


import java.math.BigDecimal;
import java.util.Date;

public class PayPeriodHours {
	
	public Date periodBegin;
	public Date periodEnd;
	public BigDecimal numberOfHours;
	public Date getPeriodBegin() {
		return periodBegin;
	}
	public void setPeriodBegin(Date periodBegin) {
		this.periodBegin = periodBegin;
	}
	public Date getPeriodEnd() {
		return periodEnd;
	}
	public void setPeriodEnd(Date periodEnd) {
		this.periodEnd = periodEnd;
	}
	public BigDecimal getNumberOfHours() {
		return numberOfHours;
	}
	public void setNumberOfHours(BigDecimal numberOfHours) {
		this.numberOfHours = numberOfHours;
	}
	@Override
	public String toString() {
		return "PayPeriodHours [periodBegin=" + periodBegin + ", periodEnd=" + periodEnd + ", numberOfHours="
				+ numberOfHours + "]";
	}

}
