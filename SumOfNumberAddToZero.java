import java.util.Scanner;

public class SumOfNumberAddToZero {
	private static Scanner scanner = new Scanner(System.in);
	
	
		static void sumZeroCount(int numberOfInputs) {
		try {
		int[] arr = new int[numberOfInputs];
		int count = 0;
		System.out.println("enter values");
		// taking integer input for creating array
		for (int i = 0; i < numberOfInputs; i++) {
			arr[i] = scanner.nextInt();
		}
		// checking for triplets by loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						count++;
						System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "=" + "0");
					}
				}
			}
		}
		// output
		System.out.println("total pairs are " + count);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		System.out.println("enter no of inputs");
		int numberOfInputs = scanner.nextInt();
		sumZeroCount(numberOfInputs);

	}
}
