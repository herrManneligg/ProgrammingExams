package Exam2016;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

//
//	The following program splits the tasks from the exercise
//	in different tiny methods for a cleaner implementation.
//

public class programFileReader {

	// Method for getting the minimum value from the array of numbers
	public static double min(ArrayList<Double> numbers) {

		double min = numbers.get(0);

		for (double n : numbers) {
			if (n < min) {
				min = n;
			}
		}

		return min;
	}

	// Method for getting the maximum value from the array of numbers
	public static double max(ArrayList<Double> numbers) {

		double max = numbers.get(0);

		for (double n : numbers) {
			if (n > max) {
				max = n;
			}
		}

		return max;
	}

	// Method for retrieving the data from the file, returned in an ArrayList
	public static ArrayList<Double> fillList(String fileLocation) {

		Scanner scanner;
		FileReader fileReader;
		ArrayList<Double> filledList = new ArrayList<>();

		try {
			fileReader = new FileReader(fileLocation);
			scanner = new Scanner(fileReader);

			while (scanner.hasNext()) {
				double number = scanner.nextDouble();
				filledList.add(number);
			}

			scanner.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return filledList;
	}

	// Method to calculate the weight of the numbers
	public static double weighting(double number, double min, double max) {
		double weight = 0.0;

		weight = (number - min) / (max - min);

		return weight;
	}

	// Method to print the numbers in a formatted String

	public static void printFormatted(ArrayList<Double> numbers, double min, double max) {
		
		System.out.println("The minimum value is " + min);
		System.out.println("The maximum value is " + max + "\n");
		
		for (double n : numbers) {
			String output = String.format("%10s: %8.4f %20s: %4.2f", "Number", n, "Weight", weighting(n, min, max));
			System.out.println(output);
		}
	}

	// Main
	public static void main(String[] args) {

//		Note, change the directory path in the String to yours for the program to work.
		
		String file = "C:\\Users\\[your_user]\\Workspace\\ProgrammingExams\\src\\Exam2016\\in.txt";
		ArrayList<Double> numbers = new ArrayList<>();
		numbers = fillList(file);

		double min = min(numbers);
		double max = max(numbers);
		
		printFormatted(numbers, min, max);
	}
}
