package com.excel.utility;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class PlanContext {
	
	public String TestData;
	public Date EffectiveDate;
	public String accountNo;
	public BigDecimal enrlProvGrpI;
	public Boolean isPlanUnion;
	public String divisionRecordKeepingTypeCode;
	public Boolean mercerNonUnionPlan;
	public Boolean isMercerPlan;
	public Integer planYearMMDD;
	public Integer ppaNoticeWaitPeriod;
	public List<OutSrc> outsrcService;
	public Map<BigDecimal,EligKitSourceRule> eligibilityKitSourceRules;
	public Map<BigDecimal,EligSourceRule> eligibilitySourceRules;
	public List<ActivePlanSource> activePlanSource;
	public String personalQueueForAccount;
	public Map<BigDecimal,PlanEligibility> planEligibility;
	public List<PlanClass> planClasses;
	public Map<BigDecimal,SourceClasses> sourceClasses;
	public Map<BigDecimal,PlanERRptData> planERRptData;
	public BigDecimal classId;
	public BigDecimal sourceId;
	public Integer allianceCode;
	public String outsrcDeferralDate;
	public Integer autoEnrollC;
	public List<String> ssn;
	public List<PartEnrlXref> partEnrlXref;
	public List<Employee> employee;
	public String participantName;
	public String firstName;
	public String middleName;
	public String lastName;
	public List<ParticipantAddress> participantAddress;
	public List<EmploymentPeriod> employmentPeriodBegin;
	public List<PayPeriodHours> payPeriodHours;
	public BigDecimal partEnrlI;
	public Integer partHistC;
	public Integer rehireC;
	public BigDecimal srcI;
	public Integer statC;
	
	public String getTestData() {
		return TestData;
	}
	public void setTestData(String testData) {
		TestData = testData;
	}
	public Date getEffectiveDate() {
		return EffectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		EffectiveDate = effectiveDate;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public BigDecimal getEnrlProvGrpI() {
		return enrlProvGrpI;
	}
	public void setEnrlProvGrpI(BigDecimal enrlProvGrpI) {
		this.enrlProvGrpI = enrlProvGrpI;
	}
	public Boolean getIsPlanUnion() {
		return isPlanUnion;
	}
	public void setIsPlanUnion(Boolean isPlanUnion) {
		this.isPlanUnion = isPlanUnion;
	}
	public String getDivisionRecordKeepingTypeCode() {
		return divisionRecordKeepingTypeCode;
	}
	public void setDivisionRecordKeepingTypeCode(String divisionRecordKeepingTypeCode) {
		this.divisionRecordKeepingTypeCode = divisionRecordKeepingTypeCode;
	}
	public Boolean getMercerNonUnionPlan() {
		return mercerNonUnionPlan;
	}
	public void setMercerNonUnionPlan(Boolean mercerNonUnionPlan) {
		this.mercerNonUnionPlan = mercerNonUnionPlan;
	}
	public Boolean getIsMercerPlan() {
		return isMercerPlan;
	}
	public void setIsMercerPlan(Boolean isMercerPlan) {
		this.isMercerPlan = isMercerPlan;
	}
	public Integer getPlanYearMMDD() {
		return planYearMMDD;
	}
	public void setPlanYearMMDD(Integer planYearMMDD) {
		this.planYearMMDD = planYearMMDD;
	}
	public Integer getPpaNoticeWaitPeriod() {
		return ppaNoticeWaitPeriod;
	}
	public void setPpaNoticeWaitPeriod(Integer ppaNoticeWaitPeriod) {
		this.ppaNoticeWaitPeriod = ppaNoticeWaitPeriod;
	}
	public List<OutSrc> getOutsrcService() {
		return outsrcService;
	}
	public void setOutsrcService(List<OutSrc> outsrcService) {
		this.outsrcService = outsrcService;
	}
	public Map<BigDecimal, EligKitSourceRule> getEligibilityKitSourceRules() {
		return eligibilityKitSourceRules;
	}
	public void setEligibilityKitSourceRules(Map<BigDecimal, EligKitSourceRule> eligibilityKitSourceRules) {
		this.eligibilityKitSourceRules = eligibilityKitSourceRules;
	}
	public Map<BigDecimal, EligSourceRule> getEligibilitySourceRules() {
		return eligibilitySourceRules;
	}
	public void setEligibilitySourceRules(Map<BigDecimal, EligSourceRule> eligibilitySourceRules) {
		this.eligibilitySourceRules = eligibilitySourceRules;
	}
	public List<ActivePlanSource> getActivePlanSource() {
		return activePlanSource;
	}
	public void setActivePlanSource(List<ActivePlanSource> activePlanSource) {
		this.activePlanSource = activePlanSource;
	}
	public String getPersonalQueueForAccount() {
		return personalQueueForAccount;
	}
	public void setPersonalQueueForAccount(String personalQueueForAccount) {
		this.personalQueueForAccount = personalQueueForAccount;
	}
	public Map<BigDecimal, PlanEligibility> getPlanEligibility() {
		return planEligibility;
	}
	public void setPlanEligibility(Map<BigDecimal, PlanEligibility> planEligibility) {
		this.planEligibility = planEligibility;
	}
	public List<PlanClass> getPlanClasses() {
		return planClasses;
	}
	public void setPlanClasses(List<PlanClass> planClasses) {
		this.planClasses = planClasses;
	}
	public Map<BigDecimal, SourceClasses> getSourceClasses() {
		return sourceClasses;
	}
	public void setSourceClasses(Map<BigDecimal, SourceClasses> sourceClasses) {
		this.sourceClasses = sourceClasses;
	}
	public Map<BigDecimal, PlanERRptData> getPlanERRptData() {
		return planERRptData;
	}
	public void setPlanERRptData(Map<BigDecimal, PlanERRptData> planERRptData) {
		this.planERRptData = planERRptData;
	}
	public BigDecimal getClassId() {
		return classId;
	}
	public void setClassId(BigDecimal classId) {
		this.classId = classId;
	}
	public BigDecimal getSourceId() {
		return sourceId;
	}
	public void setSourceId(BigDecimal sourceId) {
		this.sourceId = sourceId;
	}
	public Integer getAllianceCode() {
		return allianceCode;
	}
	public void setAllianceCode(Integer allianceCode) {
		this.allianceCode = allianceCode;
	}
	public String getOutsrcDeferralDate() {
		return outsrcDeferralDate;
	}
	public void setOutsrcDeferralDate(String outsrcDeferralDate) {
		this.outsrcDeferralDate = outsrcDeferralDate;
	}
	public Integer getAutoEnrollC() {
		return autoEnrollC;
	}
	public void setAutoEnrollC(Integer autoEnrollC) {
		this.autoEnrollC = autoEnrollC;
	}
	public List<String> getSsn() {
		return ssn;
	}
	public void setSsn(List<String> ssn) {
		this.ssn = ssn;
	}
	public List<PartEnrlXref> getPartEnrlXref() {
		return partEnrlXref;
	}
	public void setPartEnrlXref(List<PartEnrlXref> partEnrlXref) {
		this.partEnrlXref = partEnrlXref;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<ParticipantAddress> getParticipantAddress() {
		return participantAddress;
	}
	public void setParticipantAddress(List<ParticipantAddress> participantAddress) {
		this.participantAddress = participantAddress;
	}
	public List<EmploymentPeriod> getEmploymentPeriodBegin() {
		return employmentPeriodBegin;
	}
	public void setEmploymentPeriodBegin(List<EmploymentPeriod> employmentPeriodBegin) {
		this.employmentPeriodBegin = employmentPeriodBegin;
	}
	public List<PayPeriodHours> getPayPeriodHours() {
		return payPeriodHours;
	}
	public void setPayPeriodHours(List<PayPeriodHours> payPeriodHours) {
		this.payPeriodHours = payPeriodHours;
	}
	public BigDecimal getPartEnrlI() {
		return partEnrlI;
	}
	public void setPartEnrlI(BigDecimal partEnrlI) {
		this.partEnrlI = partEnrlI;
	}
	public Integer getPartHistC() {
		return partHistC;
	}
	public void setPartHistC(Integer partHistC) {
		this.partHistC = partHistC;
	}
	public Integer getRehireC() {
		return rehireC;
	}
	public void setRehireC(Integer rehireC) {
		this.rehireC = rehireC;
	}
	public BigDecimal getSrcI() {
		return srcI;
	}
	public void setSrcI(BigDecimal srcI) {
		this.srcI = srcI;
	}
	public Integer getStatC() {
		return statC;
	}
	public void setStatC(Integer statC) {
		this.statC = statC;
	}
	@Override
	public String toString() {
		return "PlanContext [TestData=" + TestData + ", EffectiveDate=" + EffectiveDate + ", accountNo=" + accountNo
				+ ", enrlProvGrpI=" + enrlProvGrpI + ", divisionRecordKeepingTypeCode=" + divisionRecordKeepingTypeCode
				+ ", mercerNonUnionPlan=" + mercerNonUnionPlan + ", isMercerPlan=" + isMercerPlan + ", planYearMMDD="
				+ planYearMMDD + ", ppaNoticeWaitPeriod=" + ppaNoticeWaitPeriod + ", outsrcService=" + outsrcService
				+ ", eligibilityKitSourceRules=" + eligibilityKitSourceRules + ", eligibilitySourceRules="
				+ eligibilitySourceRules + ", activePlanSource=" + activePlanSource + ", personalQueueForAccount="
				+ personalQueueForAccount + ", planEligibility=" + planEligibility + ", planClasses=" + planClasses
				+ ", sourceClasses=" + sourceClasses + ", planERRptData=" + planERRptData + ", classId=" + classId
				+ ", sourceId=" + sourceId + ", allianceCode=" + allianceCode + ", outsrcDeferralDate="
				+ outsrcDeferralDate + ", autoEnrollC=" + autoEnrollC + ", ssn=" + ssn + ", partEnrlXref="
				+ partEnrlXref + ", employee=" + employee + ", participantName=" + participantName + ", firstName="
				+ firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", participantAddress="
				+ participantAddress + ", employmentPeriodBegin=" + employmentPeriodBegin + ", payPeriodHours="
				+ payPeriodHours + ", partEnrlI=" + partEnrlI + ", partHistC=" + partHistC + ", rehireC=" + rehireC
				+ ", srcI=" + srcI + ", statC=" + statC + "]";
	}

}
