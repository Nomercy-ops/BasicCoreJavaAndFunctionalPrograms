import java.util.Scanner;
  
class EvenOdd {
  
    public static void main(String[] args)
    {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Entered a Number To Check Even Or Odd : ");
		int userInput = scanner.nextInt();
        // If condition to check if the remainder is zero
        if (userInput % 2 == 0) {
            System.out.println("Entered Number is Even");
        }
        else {
            System.out.println("Entered Number is Odd");
        }
    }
}