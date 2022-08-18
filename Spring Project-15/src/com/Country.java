package com;

public class Country {
private String countryName;
private State state;

public Country(String countryName, State state) {
	this.countryName = countryName;
	this.state = state;
}

public String getCountryName() {
	return countryName;
}
 
public State getState() {
	return state;
}
public String toString(){
	return "Country Name:"+countryName+"\n"+state;
}

}
