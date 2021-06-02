import java.util.Scanner;
public class WindChill {

	 /* Function to calculate windchill  double value of temperature in fahreinheit */
	 
	  static void windChill(double fahreinheit, double windSpeed) {
		double windChill = 35.74 + 0.62158 * fahreinheit + (0.4275 * fahreinheit - 35.75) * Math.pow(windSpeed, 0.16);
		System.out.println("The National Weather Service defines the effective temperature (the wind chill) to be: " +windChill);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter Temperature In Fahrenheit : ");
			double fahreinheit = scanner.nextDouble();
			System.out.println("Enter wind speed in miles per hour");
			double windSpeed = scanner.nextDouble();
			if (Math.abs(fahreinheit) > 50 || windSpeed > 120 || windSpeed< 3) {
				System.out.println("Enter correct input");
			} else {
				windChill(fahreinheit, windSpeed);
			}
		} catch (Exception e) {
			System.out.println("Enter proper input");
		}
		scanner.close();
	}
}
