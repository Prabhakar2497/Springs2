package com;

public class District {
private String districtName;

public District(String districtName) {
	super();
	this.districtName = districtName;
}

public String getDistrictName() {
	return districtName;
}
public String toString(){
	return "District Name:"+districtName;
}
}
