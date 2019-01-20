package com.excel.utility;


import java.math.BigDecimal;
import java.util.Date;

public class Employee {
	
	public String eligiblityProcessStatusCode;
	public String participantStatusCode;
	public String altParticipantStatusCode;
	public BigDecimal classId; 
	public Integer expectedYearOfServiceCode;
	public String employeeDivisionNumber;
	public String autoEnrlInclExclC;
	public Integer excludeErSrc;
	public Date hireDate;
	public Date rehireDate;
	public Date terminationDate;
	public Date planEntryDate;
	public Date dateOfBirth;
	public String getEligiblityProcessStatusCode() {
		return eligiblityProcessStatusCode;
	}
	public void setEligiblityProcessStatusCode(String eligiblityProcessStatusCode) {
		this.eligiblityProcessStatusCode = eligiblityProcessStatusCode;
	}
	public String getParticipantStatusCode() {
		return participantStatusCode;
	}
	public void setParticipantStatusCode(String participantStatusCode) {
		this.participantStatusCode = participantStatusCode;
	}
	public String getAltParticipantStatusCode() {
		return altParticipantStatusCode;
	}
	public void setAltParticipantStatusCode(String altParticipantStatusCode) {
		this.altParticipantStatusCode = altParticipantStatusCode;
	}
	public BigDecimal getClassId() {
		return classId;
	}
	public void setClassId(BigDecimal classId) {
		this.classId = classId;
	}
	public Integer getExpectedYearOfServiceCode() {
		return expectedYearOfServiceCode;
	}
	public void setExpectedYearOfServiceCode(Integer expectedYearOfServiceCode) {
		this.expectedYearOfServiceCode = expectedYearOfServiceCode;
	}
	public String getEmployeeDivisionNumber() {
		return employeeDivisionNumber;
	}
	public void setEmployeeDivisionNumber(String employeeDivisionNumber) {
		this.employeeDivisionNumber = employeeDivisionNumber;
	}
	public String getAutoEnrlInclExclC() {
		return autoEnrlInclExclC;
	}
	public void setAutoEnrlInclExclC(String autoEnrlInclExclC) {
		this.autoEnrlInclExclC = autoEnrlInclExclC;
	}
	public Integer getExcludeErSrc() {
		return excludeErSrc;
	}
	public void setExcludeErSrc(Integer excludeErSrc) {
		this.excludeErSrc = excludeErSrc;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Date getRehireDate() {
		return rehireDate;
	}
	public void setRehireDate(Date rehireDate) {
		this.rehireDate = rehireDate;
	}
	public Date getTerminationDate() {
		return terminationDate;
	}
	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}
	public Date getPlanEntryDate() {
		return planEntryDate;
	}
	public void setPlanEntryDate(Date planEntryDate) {
		this.planEntryDate = planEntryDate;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Employee [eligiblityProcessStatusCode=" + eligiblityProcessStatusCode + ", participantStatusCode="
				+ participantStatusCode + ", altParticipantStatusCode=" + altParticipantStatusCode + ", classId="
				+ classId + ", expectedYearOfServiceCode=" + expectedYearOfServiceCode + ", employeeDivisionNumber="
				+ employeeDivisionNumber + ", autoEnrlInclExclC=" + autoEnrlInclExclC + ", excludeErSrc=" + excludeErSrc
				+ ", hireDate=" + hireDate + ", rehireDate=" + rehireDate + ", terminationDate=" + terminationDate
				+ ", planEntryDate=" + planEntryDate + ", dateOfBirth=" + dateOfBirth + "]";
	}

}
