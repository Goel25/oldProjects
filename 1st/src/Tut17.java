import java.util.Scanner;
public class Tut17 {
	public static void main(String[] args){
		Tut17t2 T17Object = new Tut17t2("[404 Error: No Girlfriend was found]"); //Instead of empty parameters put the default thing in there
		Tut17t2 T17Object2 = new Tut17t2("You have had no gf's"); //Different objects have their own set's of variables
		T17Object.saying();
		T17Object2.saying();
	}
}
