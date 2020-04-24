package Exam2016;

public class TeamLeagueMain {

	public static void main(String[] args) {

		Team rons_team = new Team("LaVitesse", 3, 1, 4);
		
		// Created more teams to test the methods
		Team a = new Team("a", 3, 1, 4);
		Team b = new Team("b", 4, 1, 4);
		Team c = new Team("c", 5, 1, 4);
		Team d = new Team("d", 9, 1, 4);
		Team e = new Team("f", 83, 1, 4);
		Team f = new Team("r", 31, 1, 4);
		Team g = new Team("t", 32, 1, 4);
		Team h = new Team("y", 34, 1, 4);
		Team i = new Team("u", 0, 1, 4);
		Team j = new Team("i", 6, 1, 4);
		Team k = new Team("o", 4, 1, 4);
		Team l = new Team("q", 8, 1, 4);
		Team m = new Team("w", 7, 1, 4);
		Team n = new Team("e", 2, 1, 4);
		
		League league = new League();
		
		league.add(a);
		league.add(b);
		league.add(c);
		league.add(d);
		league.add(e);
		league.add(f);
		league.add(g);
		league.add(h);
		league.add(i);
		league.add(j);
		league.add(k);
		league.add(l);
		league.add(m);
		league.add(n);
		league.add(rons_team);
		
		// Prints unsorted array of teams
		System.out.println(league);
		
		league.sort();

		// Prints sorted array of teams
		System.out.println(league);
	}

}
