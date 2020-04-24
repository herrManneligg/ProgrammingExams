package Exam2016;

public class TwoIntegersVariables {
	
	// I haven't done the rest as they were rather easy to guess

	public static void main(String[] args) {
		int a = 9;
		int b = 6;

		String output = String.format("%1.1f/%1.1f=%d", (float) a, (float) b, a / b);
		System.out.println(output);
	}

}
