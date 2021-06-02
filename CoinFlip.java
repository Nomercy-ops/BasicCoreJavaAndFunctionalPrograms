import java.util.Scanner;
public class CoinFlip {
	
	public static void main(String[] args) {
		
		try {
			// Getting input fro the user..
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter How Many Turns To Flip: ");
			int flipCount = scanner.nextInt();
			int headCount = 0;
			int tailCount = 0;
			while (flipCount < 0) {
				System.out.println("Error! Please Enter a Positive Number : ");
				flipCount = scanner.nextInt();
			}
			for (int i = 0; i < flipCount; i++) {
				double random = Math.random();
				if (random< 0.5) {
					headCount++;
				}
				else{
					tailCount++;
				}
			}
			System.out.println("HeadCount is : " + headCount + " % = " +calculatePercentage(flipCount, headCount));
			System.out.println("TailCount is : " + tailCount + " % = " +calculatePercentage(flipCount, tailCount));
			scanner.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private static int calculatePercentage(int flipCount, int count ){
		int percentage =  count * 100 / flipCount;
		return percentage;
	}
}