import java.util.Scanner;
public class LetterCounter {
	public static void main(String[] args){
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Please write a sentance");
		String sentance = Input.nextLine();
	//	System.out.println(sentance);
		int count = 0;
		for (int i = 0; i < sentance.length(); i++){
			if (i == 1){
				System.out.println("Processing...");
			}
			
			count++;
		}
		
		System.out.println("Your sentance contains " + count + " letters");
	}
}
