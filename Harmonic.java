import java.util.Scanner;
public class Harmonic{
	
	public static void main(String args[]){
		int number;
		Harmonic harmonic=new Harmonic();
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.println("Enter Number (N):");
			number = scanner.nextInt();
		}while(!harmonic.checkNumberIsZero(number));
		System.out.println("Harmonic :"+harmonic.calculateHarmonic(number));
		
	}

	// check Number Is Zero
	public boolean checkNumberIsZero(int number){
		if(number==0)
			return false;
		else
			return true;
	}

	public double calculateHarmonic(int number){
		double result=0;
		for(int i=1;i<=number;i++){
			
			result=result+(1.0/i);
			System.out.println(result);
		}
		return result;
	}

	
}
