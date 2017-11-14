import java.util.Scanner;

public class Tut21 {
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
			int total = 0;
			int grade;
			int average;
			int counter = 0;
			
			while (counter < 10) {
				System.out.println("Enter grade the " + counter + " grade now:");
				grade = Scan.nextInt();
				total = total + grade;
				counter++;
			}
			average = total / 10;
			System.out.println("Your average grade is " + average);
	}
}
