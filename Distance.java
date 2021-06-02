import java.util.Scanner;
public class Distance {

	static void calculate(int x, int y) {
		System.out.println("distance is " + (int)Math.pow((x * x + y * y), 0.5));
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("enter value for x");
			int x = scanner.nextInt();
			System.out.println("enter value for y ");
			int y = scanner.nextInt();
			calculate(x, y);
			scanner.close();
	}
}
