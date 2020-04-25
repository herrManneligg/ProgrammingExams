package Exam2018;

public class PrimeNumbers {
	
//	Custom program based on https://www.geeksforgeeks.org/program-to-find-prime-numbers-between-given-interval/

	public static void main(String[] args) {
		findPrimeNumbers();
	}
	
	public static void findPrimeNumbers() {
		
		for (int i = 0; i < 100; i++) {
			
			// 0 and 1 are not prime numbers
			if (i == 0 || i == 1) {
				continue;
			} else {
				
				boolean flag = false;
				
				// this is a bit of "brute force"; we check all numbers up to half of i to check if one of them divides 
				//	i, and if so, it is not a prime number. There must be a more sophisticated way to check this as this time
				//	complexity seems a bit off to me, but for now I will stick with this.
				
				for (int k = 2; k <= i/2; k++) {
					if (i % k == 0) {
						flag = true;
						break;
					}
				}
				
				// if there are no numbers that divide i, then we proceed to print i.
				if (!flag ) {
					System.out.println(i);
				}
			}
		}
	}
}
