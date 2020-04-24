package Exam2017;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneProgram {

	public static ArrayList<String> readFile() throws FileNotFoundException {

		String file = "C:\\Users\\p_ber\\Workspace\\ProgrammingExams\\src\\Exam2017\\phone.txt";

		FileReader filereader = new FileReader(file);
		Scanner scanner = new Scanner(filereader);
		ArrayList<String> phoneNumbers = new ArrayList<>();

		while (scanner.hasNext()) {
			phoneNumbers.add(scanner.nextLine());
		}

		scanner.close();

		return phoneNumbers;
	}

	public static void sort(ArrayList<String> list) {

		ArrayList<String> sorted = new ArrayList<>();
		String temp = "";
		String nextSortedName = list.get(0);

		for (int left = 1; left <= list.size(); left++) {
			
			for (int i = left; i < list.size(); i++) {
				System.out.println(nextSortedName);
				
				if (list.get(i).charAt(0) < nextSortedName.charAt(0)) {
					
					temp = nextSortedName;
					nextSortedName = list.get(i);
					list.add(i, temp);
					
				} else if (list.get(i).charAt(0) == nextSortedName.charAt(0)) {

					for (int j = 0; j < list.get(i).length() - 1; j++) {
						if (list.get(i).charAt(j) < nextSortedName.charAt(j)) {
							temp = nextSortedName;
							nextSortedName = list.get(i);
							list.remove(i);
							list.add(i, temp);
							break;
						}
					}
				}
			}
			sorted.add(nextSortedName);
		}
		System.out.println(sorted);
		list = sorted;
	}

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> phoneBook = readFile();
//		System.out.println(phoneBook);
		
		sort(phoneBook);
		System.out.println(phoneBook);
	}
}
