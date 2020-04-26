package Exam2019;

public class Student {

	protected String name;
	protected String matricNumber;
	private double gpa;

	public Student(String name, String matricNumber) {
		this.name = name;
		this.matricNumber = matricNumber;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String toString() {
		return name + "(" + matricNumber + "): " + gpa;
	}

	public static void main(String[] args) {
		Student s,t,u;
		s = new Student("Simon","0123456");
//		Student t = new Student("Bill","9876543");
		System.out.println(s); // Line A
		t = s; // Line C
		t.setGpa(3.5);
		System.out.println(s); // Line B
		
//	QUESTION A. There are 3 student references, and 2 student objects are created.
//				However, the second student object created creates a reference "t"
//				again, giving a duplicate variable issue. This can be solved by
//				removing the "Student" from the left of the "t" variable when
//				creating the object "Bill".
		
//	QUESTION B. Line A's output: Simon (0123456): 0.0
		
//				The double attribute is not set, hence it is displayed as 0.0 by default;
//				this is because primitive types cannot be null, and Java assigns a value to
//				them by default.
		
//				Line B's output: Simon (0123456): 3.5

//				The GPA changes because after making "t" reference the same object that
//				"s" is referencing in the line "t = s", then, when we use the method "setGpa"
//				in the reference "t", it changes the value of the object "Simon".
		
//	QUESTION C. If the duplicate variable "t" was fixed, then no, it will not be
//				possible to access the object "Bill" again; the Java garbage collector
//				removes all unreferenced/unused objects to free up memory.

//	QUESTION D. *Note: See PGStudent class for following up this question.
//				Some changes made to the student class: the attributes needed were
//				changed from private to protected so the child class could access them.

//	QUESTION E. 
		
				PGStudent a = new PGStudent("Mary","1234",56.7);
				Student b = a; // Line D
				System.out.println(a);
//				System.out.println(b)
				
				

	}
}
