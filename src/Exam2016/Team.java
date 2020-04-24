package Exam2016;

public class Team {

	private String name;
	private int won, drawn, lost;
	
	public Team(String name, int won, int draw, int lost) {
		
		this.name = name;
		this.won = won;
		this.drawn = draw;
		this.lost = lost;
	}
	
	// Name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	// Won
	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}

	// Drawn
	public int getDrawn() {
		return drawn;
	}

	public void setDrawn(int drawn) {
		this.drawn = drawn;
	}

	// Lost
	public int getLost() {
		return lost;
	}

	public void setLost(int lost) {
		this.lost = lost;
	}
	
	public int points() {
		
		int points = won*3 + drawn;
		
		return points;
	}
}
