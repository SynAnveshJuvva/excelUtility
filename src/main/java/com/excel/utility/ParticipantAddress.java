package com.excel.utility;


import java.util.List;

public class ParticipantAddress {
	
	public String zipCode;
	public String streetNameLine4;
	public String streetNameLine3;
	public String streetNameLine2;
	public String streetNameLine1;
	public String stateCode;
	public String regionStateCode;
	public String province;
	public String mailStatusCode;
	public String countryCode;
	public String cityName;
	public String addressFlagCode;
	public Boolean isForeignAddress;
	public List<String> badFields;
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getStreetNameLine4() {
		return streetNameLine4;
	}
	public void setStreetNameLine4(String streetNameLine4) {
		this.streetNameLine4 = streetNameLine4;
	}
	public String getStreetNameLine3() {
		return streetNameLine3;
	}
	public void setStreetNameLine3(String streetNameLine3) {
		this.streetNameLine3 = streetNameLine3;
	}
	public String getStreetNameLine2() {
		return streetNameLine2;
	}
	public void setStreetNameLine2(String streetNameLine2) {
		this.streetNameLine2 = streetNameLine2;
	}
	public String getStreetNameLine1() {
		return streetNameLine1;
	}
	public void setStreetNameLine1(String streetNameLine1) {
		this.streetNameLine1 = streetNameLine1;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getRegionStateCode() {
		return regionStateCode;
	}
	public void setRegionStateCode(String regionStateCode) {
		this.regionStateCode = regionStateCode;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getMailStatusCode() {
		return mailStatusCode;
	}
	public void setMailStatusCode(String mailStatusCode) {
		this.mailStatusCode = mailStatusCode;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getAddressFlagCode() {
		return addressFlagCode;
	}
	public void setAddressFlagCode(String addressFlagCode) {
		this.addressFlagCode = addressFlagCode;
	}
	public Boolean getIsForeignAddress() {
		return isForeignAddress;
	}
	public void setIsForeignAddress(Boolean isForeignAddress) {
		this.isForeignAddress = isForeignAddress;
	}
	public List<String> getBadFields() {
		return badFields;
	}
	public void setBadFields(List<String> badFields) {
		this.badFields = badFields;
	}
	@Override
	public String toString() {
		return "ParticipantAdress [zipCode=" + zipCode + ", streetNameLine4=" + streetNameLine4 + ", streetNameLine3="
				+ streetNameLine3 + ", streetNameLine2=" + streetNameLine2 + ", streetNameLine1=" + streetNameLine1
				+ ", stateCode=" + stateCode + ", regionStateCode=" + regionStateCode + ", province=" + province
				+ ", mailStatusCode=" + mailStatusCode + ", countryCode=" + countryCode + ", cityName=" + cityName
				+ ", addressFlagCode=" + addressFlagCode + ", isForeignAddress=" + isForeignAddress + ", badFields="
				+ badFields + "]";
	}

}
