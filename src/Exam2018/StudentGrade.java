package Exam2018;

public class StudentGrade implements Comparable {

	private int matric;
	private String grade;
	
	public StudentGrade(int m, String g) {
		this.matric = m;
		this.grade = g;
	}

	public int getMatric() {
		return matric;
	}

	public void setMatric(int matric) {
		this.matric = matric;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof StudentGrade) {
			StudentGrade student = (StudentGrade) o;
			
			return compareGrades(this.getGrade(), student.getGrade());
		}
		return -1;
	}
	
	public static int compareGrades(String gradeOne, String gradeTwo) {

		if ((gradeOne.charAt(0) > gradeTwo.charAt(0)) || (gradeOne.charAt(0) == gradeTwo.charAt(0)) && (gradeOne.charAt(1) > gradeTwo.charAt(1))) {

			return 1;

		} else if (gradeOne.charAt(1) == gradeTwo.charAt(1)) {

			return 0;
		}

		return -1;
	}
	
	public String toString() {
		String formatted = String.format("Matric: %07d" + " Grade: " + grade, matric);
		return formatted;
	}
}
