package com;

public class State {
private String stateName;
private District district;

public State(String stateName, District district) {
	this.stateName = stateName;
	this.district = district;
}

public String getStateName() {
	return stateName;
}
 
public District getDistrict() {
	return district;
}
 public String toString(){
	 return "State Name:"+stateName+"\n"+district;
 }

}
