package com.excel.utility;

import java.util.List;

public class ParticipantWithPendingEligibili {

	public List<String> ssn;

	public List<String> getSsn() {
		return ssn;
	}

	public void setSsn(List<String> ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "ParticipantWithPendingEligibility [ssn=" + ssn + "]";
	}
	
}
