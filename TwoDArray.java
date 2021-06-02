import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
	
	static PrintWriter printwriter = new PrintWriter(System.out);
	public static void main(String[] args) {
     Scanner scan =  new Scanner(System.in);
     System.out.println("Enter Number  m rows");
     int M = scan.nextInt();
     System.out.println("Enter Number of n coloums");
     int N = scan.nextInt();
     int arr[][]  = new int[M][N];
     boolean ar[][]  = new boolean[M][N];
     double arrr[][]  = new double[M][N];
     for(int i = 0 ; i<M ; i++) {
    	 for(int j = 0 ; j<N ; j++) {
    		 arr[i][j] = scan.nextInt();
    	 }
     }
     
     TwoDArray.PrintArr(arr);
     System.out.println(" Enter boolean Array");
     
     for(int i = 0 ; i<M ; i++) {
    	 for(int j = 0 ; j<N ; j++) {
    		 ar[i][j] = scan.nextBoolean();
    	 }
     }
     TwoDArray.PrintArr(ar);
     System.out.println(" Enter double Array");
     
     for(int i = 0 ; i<M ; i++) {
    	 for(int j = 0 ; j<N ; j++) {
    		 arrr[i][j] = scan.nextDouble();
    	 }
     }
     TwoDArray.PrintArr(arrr);
scan.close();
	}
	
	public static void PrintArr(int a[][]) {
		for (int b[] : a) {
			for (int c : b) {

				 printwriter.print(c + " ");
				 printwriter.flush();
			}
			System.out.println();
		}
	}
	
	public static void PrintArr(double a[][]) {
		for (double b[] : a) {
			for (double c : b) {
				 printwriter.print(c + " ");
				 printwriter.flush();
			}
			System.out.println();
		}
	}

	public static void PrintArr(boolean a[][]) {
		for (boolean b[] : a) {
			for (boolean c : b) {
				if (c == true) {
					 printwriter.print("1 ");
					 printwriter.flush();
				} else {
					 printwriter.print("0 ");
					 printwriter.flush();
				}
			}
			System.out.println();
		}
	}
}


