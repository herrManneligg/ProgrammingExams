package Exam2018;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SystemStudentsGradesAndMatrics {

	public static void main(String[] args) {

		String path = "C:\\Users\\p_ber\\Workspace\\ProgrammingExams\\src\\Exam2018\\grades.txt";
		ArrayList<String> document = loadFile(path);

		int[] matrics = new int[document.size()];
		String[] grades = new String[document.size()];

		for (int i = 0; i < document.size(); i++) {

			matrics[i] = Integer.parseInt(document.get(i).substring(0, 7));
			grades[i] = document.get(i).substring(8);

//			System.out.println("Matric: " + matrics[i] + " Grade: " + grades[i]);
			String formatted = String.format("Matric: %07d" + " Grade: " + grades[i], matrics[i]);
			System.out.println(formatted);
		}

		findMaxGrade(matrics, grades);

		StudentGrade[] students = new StudentGrade[matrics.length];
		for (int j = 0; j < matrics.length; j++) {
			students[j] = new StudentGrade(matrics[j], grades[j]);
		}
		
//		java.util.Arrays.sort(students);
		
		System.out.println("Sorted");
		for (int j = 0; j < students.length; j++) {
			System.out.println(students[j]);
		}
		
	}

	public static ArrayList<String> loadFile(String path) {

		FileReader filereader;
		Scanner scanner = null;

		ArrayList<String> document = new ArrayList<>();

		try {

			filereader = new FileReader(path);
			scanner = new Scanner(filereader);

			while (scanner.hasNext()) {
				document.add(scanner.nextLine());
			}

			scanner.close();

		} catch (FileNotFoundException e) {
			System.err.println("Error: " + e.getMessage());
		}

		return document;
	}

	public static int compareGrades(String gradeOne, String gradeTwo) {

		if ((gradeOne.charAt(0) > gradeTwo.charAt(0)) || (gradeOne.charAt(0) == gradeTwo.charAt(0)) && (gradeOne.charAt(1) > gradeTwo.charAt(1))) {

			return 1;

		} else if (gradeOne.charAt(1) == gradeTwo.charAt(1)) {

			return 0;
		}

		return -1;

	}

	public static void findMaxGrade(int[] matrics, String[] grades) {

		String maxGrade = grades[0];
		int index = 0;

		for (int i = 1; i < grades.length; i++) {
			if (compareGrades(maxGrade, grades[i]) > 0) {
				maxGrade = grades[i];
				index = i;
			}
		}
		String formatted = String.format("Max grade: " + maxGrade + " || Student: %07d", matrics[index]);
		System.out.println(formatted);
	}
	
//	(d) State one reason why using two arrays like this to hold data is not sensible
	
//	There are several inconveniences when storing data in this way. Firstly, it is hard to manipulate the data,
//	making it easy to mix information if not handled correctly. Secondly, it is not efficient, as the methods
//	for manipulating the data need to be more elaborated and to mantain the relation of the matrics with the
//	grades. A better way would be a hashmap, for instance, or creating an object for students that stores both,
//	the matric and the grades.
}
