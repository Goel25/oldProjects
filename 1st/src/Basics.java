
import java.util.Scanner; //Telling java we want a scanner
public class Basics {
	public static void main(String args[]) {
		Scanner Scan = new Scanner(System.in); //Scanner means that we are going to use a scanner, scan is the variable name, System.in makes the variable = to whatever the user inputs
			double num1, num2, ans; //Setting variables
			System.out.println("Enter first number"); //Prompting user to enter the first number
			num1 = Scan.nextDouble(); //Setting num1 to the SCAN, the scanner variables, NEXTDOUBLE() sets it to the next double that is entered
			System.out.println("Enter second number");
			num2 = Scan.nextDouble();
			ans = num1 + num2;
			System.out.print(num1);
			System.out.print("+");
			System.out.print(num2);
			System.out.print("=");
			System.out.println(ans);
	}
}
