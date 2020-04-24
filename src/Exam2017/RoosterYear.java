package Exam2017;

public class RoosterYear {

	public static void main(String[] args) {
		
		System.out.println(isRoosterYear(1945)); // true
		System.out.println(isRoosterYear(1900)); // false
		System.out.println(isRoosterYear(1909)); // true

	}
	
	
//  did not find a way to calculate it, so I just iterate
//	from 1909 to 2017 adding 12 years each time to find the
//	years that are rooster year. An alternative would be to 
//	have an ArrayList<Integer> to store all rooster years and
//	use the method contains()...
	public static boolean isRoosterYear(int number) {

		for (int i = 1909; i <= 2017; i += 12) {

			if (i == number) {
				return true;
			}
		}
		return false;
	}
}
