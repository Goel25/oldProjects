import java.util.Random; //Importing random

public class Tut26 {
		public static void main(String[] args){
			Random dice = new Random(); //Setting random object
			int number;
			
			for (int counter=1;counter<=10;counter++){ //Loop to do it 10 times
				number = 1+dice.nextInt(6); //Setting number to a random int, with 6 options (0,1,2,3,4,5) and adding 1 that the outcome is (1,2,3,4,5,6), since random counting starts at 0
				System.out.println(number);
			}
		}
}
