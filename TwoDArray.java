import java.io.PrintWriter;
import java.util.Scanner;


public class TwoDArray{
	private static Scanner scanner = new Scanner(System.in);
	int mArray[][];
	int m,n;
	
	// constructor of 2-D array with arguments
	public TwoDArray(int m,int n){
		mArray=new int[m][n];
		this.m=m;	
		this.n=n;
		
	}
		// Taking number of rows and columns from user..
	public static void main(String args[]){
		
		System.out.println("Enter number of Column:");
		int n=scanner.nextInt();

		System.out.println("Enter number of Row:");
		int m=scanner.nextInt();
		TwoDArray twoDArray=new TwoDArray(m,n);
		twoDArray.takeArrayInput();
		System.out.println("2D Array is");
		twoDArray.printArray();
	}
	
	//Take 2D Array as Input
	public void takeArrayInput(){
		for(int row=0;row<m;row++){
			for(int col=0;col<n;col++){
				System.out.print("Array["+row+"] ["+col+"] :");
				mArray[row][col]=scanner.nextInt();
				System.out.println();
			}
		}
	}
		// functions to print 2-D array..
	public void printArray(){
		PrintWriter mPrintWriter=new PrintWriter(System.out,true);
    	
		for(int row=0;row<m;row++){
		
			for(int col=0;col<n;col++){
				mPrintWriter.print(" "+mArray[row][col]);
			}
			mPrintWriter.println();
		}
	}
}




