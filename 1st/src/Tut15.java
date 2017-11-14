import java.util.Scanner;
public class Tut15 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Tut15t2 Object15t2 = new Tut15t2 ();
		
		System.out.print("Enter your name");
		
		String name = input.nextLine();
		
		Object15t2.SimpleMessage(name);
	}
}
