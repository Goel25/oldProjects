
public class Tut12 {
	public static void main(String args[]){
		int age;
		age = 3;
		
		switch (age){ //Age is the variable of which we are testing
		case 1: //if value of age (from line above) is equal to 1
			System.out.print("You can crawl"); //what to do if case 1 is true
			break; //stop the code
		case 2:
			System.out.print("You can talk");
			break;
		case 3:
			System.out.print("You can get in trouble");
			break;
		default: //if none of the case's are true
			System.out.print("IDK how old you are");
			break;
		}
	}
}
