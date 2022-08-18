package com;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SandalWood {
private String name;
private List<String>producer;
private Set<String>director;
private Map<String,Double>details;
public void setName(String name){
	this.name=name;
}
 
public void setProducer(List<String> producer){
	this.producer=producer;
}
 
public void setDirector(Set<String> director){
	this.director=director;
}
 
public void setDetails(Map<String,Double> details){
	this.details=details;
}
 public String toString(){
	 return "Hero:"+name+"\nProducer:"+producer+"\nDirector:"+director
			 +"\nMovie Name & IMDB Rating:"+details;
 }
}
