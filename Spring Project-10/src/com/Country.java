package com;

public class Country {
private String countryName;
private State state;
public void setCountryName(String countryName){
	this.countryName=countryName;
}
public String getCountryName(){
	return countryName;
}
public void setState(State state){
	this.state=state;
}
public State getState(){
	return state;
}
}
