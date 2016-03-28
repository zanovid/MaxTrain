public class RomanNumeralConverter {
	private int inputNumber = 0;
	private String romanNumeral = "";

	public String converter(int inputNumber) {
		this.inputNumber = inputNumber;
		
		while (inputNumber > 0) {
			if (inputNumber >=1000000){
				inputNumber-=1000000;
				romanNumeral+="Mbar";
			} else if (inputNumber >=900000){
				inputNumber-=900000;
				romanNumeral+="CbarMbar";
			} else if (inputNumber >=500000){
				inputNumber-=500000;
				romanNumeral+="Dbar";
			} else if (inputNumber >=400000){
				inputNumber-=400000;
				romanNumeral+="CbarDbar";
			} else if (inputNumber >=100000){
				inputNumber-=100000;
				romanNumeral+="Cbar";
			} else if (inputNumber >=90000){
				inputNumber-=90000;
				romanNumeral+="XbarCbar";
			} else if (inputNumber >=50000){
				inputNumber-=50000;
				romanNumeral+="Lbar";
			} else if (inputNumber >=40000){
				inputNumber-=40000;
				romanNumeral+="LbarXbar";
			} else if (inputNumber >=10000){
				inputNumber-=10000;
				romanNumeral+="Xbar";
			} else if (inputNumber >=9000){
				inputNumber-=9000;
				romanNumeral+="MXbar";
			} else if (inputNumber >=5000){
				inputNumber-=5000;
				romanNumeral+="Vbar";
			} else if (inputNumber >=4000){
				inputNumber-=4000;
				romanNumeral+="MVbar";
			} else if (inputNumber >= 1000) {
				inputNumber -= 1000;
				romanNumeral += "M";
			} else if (inputNumber >= 900) {
				inputNumber -= 900;
				romanNumeral += "CM";
			} else if (inputNumber >= 500) {
				inputNumber -= 500;
				romanNumeral += "D";
			} else if (inputNumber >= 400) {
				inputNumber -= 400;
				romanNumeral += "CD";
			} else if (inputNumber >= 100) {
				inputNumber -= 100;
				romanNumeral += "C";
			} else if (inputNumber >= 90) {
				inputNumber -= 90;
				romanNumeral += "C";
			} else if (inputNumber >= 50) {
				inputNumber -= 50;
				romanNumeral += "L";
			} else if (inputNumber >= 40) {
				inputNumber -= 40;
				romanNumeral += "XL";
			} else if (inputNumber >= 10) {
				inputNumber -= 10;
				romanNumeral += "X";
			} else if (inputNumber >= 9) {
				inputNumber -= 9;
				romanNumeral += "IX";
			} else if (inputNumber >= 5) {
				inputNumber -= 5;
				romanNumeral += "V";
			} else if (inputNumber >= 4) {
				inputNumber -= 4;
				romanNumeral += "IV";
			} else if (inputNumber >= 1) {
				inputNumber -= 1;
				romanNumeral += "I";
			}
		}
		return romanNumeral;
	}
}
