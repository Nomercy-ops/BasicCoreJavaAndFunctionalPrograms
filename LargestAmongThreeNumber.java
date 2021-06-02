import java.util.Scanner;  
public class LargestAmongThreeNumber 
{  
public static void main(String args[])  
{  
int number1;
int number2;
int number3;  
System.out.println("Enter Three number To Check Largest AMONG Them: ");  
Scanner scanner = new Scanner(System.in);  
number1 = scanner.nextInt();  
number2 = scanner.nextInt();  
number3 = scanner.nextInt();  
if (number1 > number2 && number1 > number3)  
System.out.println("The largest number is: "+number1);  
else if (number2 > number1 && number2 > number3)  
System.out.println("The largest number is: "+number2);  
else if (number3 > number1 && number3 > number2)  
System.out.println("The largest number is: "+number3);  
else  
System.out.println("The numbers are same.");  
}  
}  