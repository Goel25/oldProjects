import java.util.Scanner;
public class Tut16 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Tut16t2 Tut16t2O = new Tut16t2();
		System.out.print("Enter name of first gf here:");
		String name = input.nextLine();
		Tut16t2O.SetName(name);
		Tut16t2O.saying();
	}
}