package Exam2016;

public class League {

	private Team[] teams;

	public League() {

		teams = new Team[20];
	}

	public void add(Team team) {

		for (int i = 0; i < teams.length; i++) {
			if (teams[i] == null) {
				teams[i] = team;
				break;
			} 
		}
	}

	// Finds the name of the team
	public String find(String teamName) {

		for (Team t : teams) {
			if (t != null && t.getName().equals(teamName)) {
				return t.getName();
			}
		}
		return null;
	}

	// Sorts the current array in descending order of points
	public void sort() {

		Team[] sortedArray = new Team[20];

		for (int left = 0; left < sortedArray.length; left++) {
			Team temp = null;
			Team team = teams[left];

			for (int i = left; i < teams.length; i++) {

				if ((teams[i] != null) && (team.points() <= teams[i].points())) {
					
//					team variable has less points than teams[i], so we swap them in the original array
//					so in the next iteration the team with more points is not checked again.
					
					temp = team;
					team = teams[i];
					teams[i] = temp;
				}
			}
//			We add the team with more points to the sorted array
			sortedArray[left] = team;
		}

//		We reference the teams array from the class to the sorted array
		teams = sortedArray;
	}

	public String toString() {
		String text = "";
		for (Team t : teams) {
			if (t != null) {
				text += t.getName() + " Points: " + t.points() + "\n";
			}
		}
		return text;
	}
}
