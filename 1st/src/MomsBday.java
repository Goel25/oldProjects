
import java.util.Scanner;
public class MomsBday {
	public static void main(String args[]) {
		Scanner Scan = new Scanner(System.in);
			double num1;
			System.out.print("Enter Moomy's birthday: with format monthday");
			num1 = Scan.nextDouble();
			if (num1 == 0625 || num1 == 625){
				System.out.print("Leo and Harris say Happy birthday Mooomy!");
			}else{
				System.out.print("It is not moomy's birthday :(");
		}
	}
}