import java.util.Scanner;
public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("ENTER A NUMBER Between 0 To 31");
			int userInput = scanner.nextInt();
			if (userInput >= 0 && userInput <= 31) {
				 printTable(userInput);
			} else {
				System.out.println("Please Enter Valid Input ");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private static void printTable(int userInput){
		for(int i=0;i<= userInput;i++){
			System.out.println("2 ^ "+i+" "+(int)Math.pow(2,i));
		}
	}
}
