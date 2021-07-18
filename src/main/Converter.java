package main;
import java.util.Scanner;

public class Converter {
	
	//Miles to Kilometers
	public static double convertMilesToKilometers(double milesToConvert) {
		System.out.println("Converting Miles to Kilometers");
		double convertedNumber = (milesToConvert * 1.60934);
		System.out.println(milesToConvert + " Miles is equal to " + convertedNumber + " Kilometers");
		return convertedNumber;
	}
	
	//Kilometers to Miles
	public static  double convertKilometersToMiles(double kilometersToConvert) {
		System.out.println("Converting Miles to Kilometers");
		double convertedNumber = (kilometersToConvert * 0.621371);
		System.out.println(kilometersToConvert + " Kilometers is equal to " + convertedNumber + " Miles");
		return convertedNumber;
	}
	
	//F to C
	public static  double convertFahrenheitToCelcius(double fahToConvert) {
		System.out.println("Converting Fahrenheit to Celcius");
		double convertedNumber = ((fahToConvert - 32.0) * 5.0/9.0);
		System.out.println(fahToConvert + " Degrees Fahrenheit is equal to " + convertedNumber + " Degrees Celcius");
		return convertedNumber;
	}
	
	//C to F
	public static double convertCelciusToFahrenheit(double celcToConvert) {
		System.out.println("Converting Cekcuys to Fahrenheit");
		double convertedNumber = ((celcToConvert * 9.0/5.0) + 32.0);
		System.out.println(celcToConvert + " Degrees Celcius is equal to " + convertedNumber + " Degrees Fahrenheit");
		return convertedNumber;
	}
	
	//lbs to Kg
	public static double convertPoundstoKilograms(double poundsToConvert) {
		System.out.println("Converting Pounds to Kilograms");
		double convertedNumber = (poundsToConvert * 0.453592);
		System.out.println(poundsToConvert + "lbs is equal to " + convertedNumber + "kg");
		return convertedNumber;
	}
	//Kg to lbs
	public static double convertKilogramsToPounds(double kilogramsToConvert) {
		System.out.println("Converting Kilograms to Pounds");
		double convertedNumber = (kilogramsToConvert * 2.20462);
		System.out.println(kilogramsToConvert + "kg is equal to " + convertedNumber + "lbs");
		return convertedNumber;
	}
	
	
	public static void main(String[] args) {
		int menuSelection;
		System.out.println("Select the conversion you would like:");
		System.out.println("");
		System.out.println("1. Miles to Kilometers");
		System.out.println("2. Kilometers to Miles");
		System.out.println("3. Fahrenheit to Celcius");
		System.out.println("4. Celcius to Fahrenheit");
		System.out.println("5. Pounds to Kilograms");
		System.out.println("6. Kilograms to Pounds");
		System.out.println("0. Quit Program");
		System.out.println("");
		Scanner userIn = new Scanner(System.in);
		try {
			boolean isQuitting = false;
			while (isQuitting == false) {
				menuSelection = userIn.nextInt();
				System.out.println("You have selected option: " + menuSelection);
				if (menuSelection > 6 | menuSelection < 0) {
					System.out.println("Option does not exist, please select another option:");
				}
				else {
					switch (menuSelection) {
					
						case 0: System.out.println("Quitting...");
								isQuitting = true;
								break;
								
						case 1: System.out.println("Miles to Kilometers Selected!");
								System.out.println("Please input miles to be converted.");
								Scanner userMiles = new Scanner(System.in);
								double milesToBeConverted = userMiles.nextDouble();
								convertMilesToKilometers(milesToBeConverted);
								
								break;
						case 2: System.out.println("Kilometers to Miles Selected!");
								System.out.println("Please input kilometers to be converted.");
								Scanner userKilometers = new Scanner(System.in);
								double kilometersToBeConverted = userKilometers.nextDouble();
								convertKilometersToMiles(kilometersToBeConverted);
								
								break;
						case 3: System.out.println("Fahrenheit to Celcius Selected!");
								System.out.println("Please input temperature to be converted.");
								Scanner userFahrenheit = new Scanner(System.in);
								double fahrenheitToBeConverted = userFahrenheit.nextDouble();
								convertFahrenheitToCelcius(fahrenheitToBeConverted);
								
								break;
						case 4: System.out.println("Celcius to Fahrenheit Selected!");
								System.out.println("Please input temperature to be converted.");
								Scanner userCelcius = new Scanner(System.in);
								double celcuisToBeConverted = userCelcius.nextDouble();
								convertFahrenheitToCelcius(celcuisToBeConverted);
								
								break;
						case 5: System.out.println("Pounds to Kilograms Selected");
								System.out.println("Please input weight to be converted.");
								Scanner userPounds = new Scanner(System.in);
								double poundsToBeConverted = userPounds.nextDouble();
								convertPoundstoKilograms(poundsToBeConverted);
								
								break;
						case 6: System.out.println("Kilograms to Pounds Selected!");
								System.out.println("Please input weight to be converted.");
								Scanner userKilograms = new Scanner(System.in);
								double kilogramsToBeConverted = userKilograms.nextDouble();
								convertKilogramsToPounds(kilogramsToBeConverted);
								break;

					}
				}
				
				if (isQuitting == false) {
					System.out.println("");
					System.out.println("Select next option");
					System.out.println("1. Miles to Kilometers");
					System.out.println("2. Kilometers to Miles");
					System.out.println("3. Fahrenheit to Celcius");
					System.out.println("4. Celcius to Fahrenheit");
					System.out.println("5. Pounds to Kilograms");
					System.out.println("6. Kilograms to Pounds");
					System.out.println("0. Quit Program");
					System.out.println("");
				}
			}
			
			userIn.close();
			System.out.println("Thanks for Using my Converter!");
			System.exit(1);
		}
		
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Invalid Option, Converter is Exiting");
			System.exit(1);
		}
		


	}

}
