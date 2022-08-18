package com;

public class Team {
private String teamName;
private Player player;
public void setTeamName(String teamName){
	this.teamName=teamName;
}
public void setPlayer(Player player){
	this.player=player;
}
public Player getPlayer(){
	return player;
}
 public String toString(){
	 return "Team Name:"+teamName;
 }
}
