import java.util.Scanner;
public class Tut18 {
	public static void main(String[] args) {
		int age;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter your age:");
		age = Scan.nextInt();
		
		if (age < 50){ //NORMAL IF ELSE STATEMENT
			System.out.println("Your young");
		}else{ //NORMAL IF ELSE STATEMENT
			System.out.println("Your old");
			if (age > 75){ //NESTED IF STATEMENT, meaning that there is an if and/or statement inside and if and/or if statement
				System.out.println("Your really old!");
			}else{ ////NESTED IF STATEMENT, meaning that there is an if and/or statement inside and if and/or if statement
				System.out.println("Don't worry, you arn't really that old! :D");
			}
		}
	}
}
