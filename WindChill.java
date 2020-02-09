import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		//Create a new object of type Scanner that reads from the keyboard
		Scanner input = new Scanner(System.in);
		
		double temp;
		double windSpeed;
		double windChill;
		double z;
		String programmer = "Phuc Bui";
		
		//Display a header of your application
		System.out.print("Wind Chill Calculator");
		do {
		//Prompt the user to enter the temperature in Fahrenheit
		System.out.print("\n\nEnter the temperature in Fahrenheit(must be >= -45 and <= 40): ");
		temp = input.nextDouble();
		}
		
		while (temp < -45 || temp >40);
		
		
		do {
		//Prompt the user to enter the wind speed
		System.out.print("Enter the wind speed (must be >= 5 and <= 60): ");
		windSpeed = input.nextDouble();
		}
		while (windSpeed < 5 || windSpeed > 60);
		
		z = Math.pow(windSpeed,0.16);
		windChill =	35.74 + 0.6215*temp-35.75*z+0.4275*temp*z;
		
		//Display the wind chill temperature that results
		System.out.println("\nWind chill temperature: " + windChill +" degrees Fahrenheit");
		//Display your name as programmer
		System.out.println("\nProgrammer: " +programmer);
		input.close();
	}

}

