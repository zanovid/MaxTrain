import java.util.Scanner;


public class RomanNumeralApp {
	
public static void main(String[] args) {
		
		RomanNumeralCalculator calculator = new RomanNumeralCalculator();
		RomanNumeralConverter converter= new RomanNumeralConverter();
		calculator.addNumbers(getNumberFromConsole(), getNumberFromConsole());
		System.out.println(calculator.getResult());
		calculator.subtractNumbers(getNumberFromConsole(), getNumberFromConsole());
		System.out.println(calculator.getResult());
		calculator.multiplyNumbers(getNumberFromConsole(), getNumberFromConsole());
		System.out.println(calculator.getResult());
		calculator.divideNumbers(getNumberFromConsole(), getNumberFromConsole());
		System.out.println(calculator.getResult());
		System.out.println(converter.converter(getNumberFromConsole()));
		
	}
	private static int getNumberFromConsole(){
		
		int consoleInteger=0;
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please enter a whole number: ");
		if (inputScanner.hasNextInt()){
		consoleInteger = (inputScanner.nextInt());
		} else {
			System.out.println("Please enter a Valid Integer");
		}
		return consoleInteger;
	}

	

}
