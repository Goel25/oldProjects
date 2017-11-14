import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		Random Rand = new Random();
		System.out.println("Enter number of rounds:");
		int rounds = Scan.nextInt();
		double total = 0;
		double wrong;
		for (int counter = 1;counter<=rounds;counter++){
			int ans = 1+Rand.nextInt(10);
			int guess = 15;
			wrong = 0;
			System.out.println("Enter your guess (1-10):");
			while (guess != ans){
				guess = Scan.nextInt();
				if (guess == ans){
					for (int counter2 = 1;counter2<=5;counter2++){
						System.out.println("Congrats you guessed it! You got it wrong " + wrong + " times!");
					}
					break;
				}else{
					System.out.println("Wrong!");
					wrong++;
				}
			}
		}
	}
}