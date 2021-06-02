import java.util.Scanner;
public class Quadratic {

	static void roots(int a, int b, int c) {
		// calculating delta value
		
		int delta = Math.abs(b * b - 4 * a * c);
		double root1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
		double root2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
		System.out.println("The First Root Of Equation Is " +root1);
	    System.out.println("The Second Root Of Equation Is " +root2);

	}

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter value for a : ");
			int a = scanner.nextInt();
			System.out.println("enter value for  b : ");
			int b = scanner.nextInt();
			System.out.println("enter value for c : ");
			int c = scanner.nextInt();
			roots(a, b, c);
			scanner.close();
	}
}
