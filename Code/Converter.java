import javax.swing.JOptionPane;

public class Converter {

	public static void main(String[] args) {

		String degreesString = JOptionPane.showInputDialog(
				"Please enter a temperature in degrees Fahrenheit\n"
				+"as a whole number without a fractional part.");
		
		int DegreesF;
		DegreesF = Integer.parseInt(degreesString);
		//Turning user's input(string) into a number again
		
		double DegreesC = (DegreesF - 32.0) * 5.0 / 9.0;
		//DegreesC = DegreesC / 10;
		//DegreesC = DegreesC % 10;
		
		//Converts Fahrenheit to Celsius 
		
		JOptionPane.showMessageDialog(null, DegreesF + 
		" degrees Fahrenheit is " + DegreesC + " degrees Celsius.");
		
System.exit(0);		
	}}
