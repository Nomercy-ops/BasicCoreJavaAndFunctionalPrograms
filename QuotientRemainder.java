import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
		QuotientRemainder quetientRemainder = new QuotientRemainder();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Dividend Number");
		int dividend = scanner.nextInt();
		System.out.println("Enter a Dividend Number");
		int divisor = scanner.nextInt();
    if(dividend <= 0 && divisor <= 0){
		System.out.println("Enter a Number greater than Zero");
	}
	else
	{
		quetientRemainder.quotientRemainderCalculation(dividend, divisor);
	}
    }
	static void quotientRemainderCalculation(int dividend, int divisor){
		 try{
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
		 }
		 catch(Exception e){
			 System.out.println(e + "  Enter valid input "); 
		 }
	}
}