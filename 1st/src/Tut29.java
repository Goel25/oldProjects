
public class Tut29 {
	public static void main(String[] args){
		int Ages[] = {21, 16, 10};
		int sum = 0;
		
		for (int counter = 0;counter<Ages.length;counter++){
			sum += Ages[counter]; //Takes the value of an array variable and adds it to the sum
		}
		System.out.println("The total age of these people are " + sum);
	}
}
