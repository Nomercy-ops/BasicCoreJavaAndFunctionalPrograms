import java.util.*; 
class SwapTwoNumbers{
	//swapping two numbers without using third variable..
	
    static void swapValuesWithoutUsingThirdVariable(int firstNumber, int secondNumber)
    {
        // Difference of 2nd from 1st is stored in first variable
        firstNumber = firstNumber - secondNumber;
 
        // Sum is stored in second variable
        secondNumber = firstNumber + secondNumber;
 
        // Difference of 1st from 2nd
        // is replaced in first variable
        firstNumber = secondNumber - firstNumber;
 
        // Print  the numbers after swapping
        System.out.println("Value of First Number Without using Third Variable is " + firstNumber
                           + " and Value of second Number without using Third Variable is " + secondNumber);
    }
	
	//swapping two numbers  using third variable..
	static void swapValuesUsingThirdVariable(int firstNumber, int secondNumber)
    {
	int temp = firstNumber;
	firstNumber = secondNumber;
	secondNumber = temp;
	System.out.println("Value of First Number using Third Variable is " + firstNumber
                           + " and Value of second Number using Third Variable is " + secondNumber);
	}
	
 
    public static void main(String[] args)
    {
	Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number to swap : ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter 2nd Number to swap : ");
		int secondNumber = scanner.nextInt();
        swapValuesWithoutUsingThirdVariable(firstNumber, secondNumber);
		swapValuesUsingThirdVariable(firstNumber, secondNumber);
    }
}