package com.java.oops;
class Cricketer {
	int Jno;
	String name;
	Team team;
	
	Cricketer(Cricketer cricketer) {
		this.Jno = cricketer .Jno;
		this.name = cricketer.name;
		this.team = new Team(cricketer.team);
	}
	public Cricketer(int jno, String name, Team team) {
		this.Jno = jno;
		this.name = name;
		this.team = team;
	}

	void cricketerInfo() {
		System.out.println("Cricketer Name is : " + name );
		System.out.println("Jersey Number is : " + Jno);
		System.out.println("Cricketers Team is : " + team.city);
		System.out.println("================================");
	}
}

class Team {
	String city;

	public Team(String city) {
		this.city = city;
	}
	Team(Team team) {
		this.city = team.city;
	}
}
public class DeepCopy {

	public static void main(String[] args) {
		Team team = new Team("Mumbai Indians");
		Cricketer cricketer = new Cricketer(45, "Rohit Sharma", team);
		cricketer.cricketerInfo();
		
		Cricketer cricketer2 = new Cricketer(cricketer);
		cricketer2.cricketerInfo();
		cricketer2.Jno = 9;
		cricketer2.name = "Harinadh";
		cricketer2.team.city = "AndhraLions";
		cricketer2.cricketerInfo();
		cricketer.cricketerInfo();
	}
}