public class RomanNumeralCalculator {
	RomanNumeralConverter converter= new RomanNumeralConverter();
	int calculatorResult;
	String firstNumeral="";
	String secondNumeral="";
	String resultNumeral="";
	
	public String getResult() {
		return "You entered " + firstNumeral +" and " + secondNumeral+" and the sum is "+ resultNumeral +" or as a number " + calculatorResult;
	
	}
	public void addNumbers(int firstNumber, int secondNumber) {
		firstNumeral= converter.converter(firstNumber);
		secondNumeral=converter.converter(secondNumber);
		calculatorResult = firstNumber + secondNumber;
		resultNumeral=converter.converter(calculatorResult);
	}

	public void subtractNumbers(int firstNumber, int secondNumber) {
		calculatorResult = firstNumber - secondNumber;
	}

	public void multiplyNumbers(int firstNumber, int secondNumber) {
		calculatorResult = firstNumber * secondNumber;
	}

	public void divideNumbers(int firstNumber, int secondNumber) {
		calculatorResult = firstNumber / secondNumber;
	}
}
