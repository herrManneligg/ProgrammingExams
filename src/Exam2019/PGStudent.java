package Exam2019;

public class PGStudent extends Student {
	
	private double projectGrade;

	public PGStudent(String name, String matricNumber, double projectGrade) {
		super(name, matricNumber);
		this.projectGrade = projectGrade;
	}

	public double getProjectGrade() {
		return projectGrade;
	}

	public void setProjectGrade(double projectGrade) {
		this.projectGrade = projectGrade;
	}
	
	@Override
	public String toString() {
		return name + "(" + matricNumber + "): " + this.projectGrade;
	}
}
