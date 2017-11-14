import java.util.Scanner;
public class Faces {
	public static void main(String[] args){
		Scanner Input = new Scanner(System.in);
		System.out.println("How are you feeling (happy, sad, or mad)?");
		String face = Input.next();
		switch (face){
			case "happy":
				System.out.println("\t______");
				System.out.println("       /      \\");
				System.out.println("      / O   O  \\");
				System.out.println("     /          \\");
				System.out.println("    |           |");
				System.out.println("     \\  \\   /  /");
				System.out.println("      \\  ררר  /");
				System.out.println("       \\_____/");  
				break;
			case "sad":
				System.out.println("\t______");
				System.out.println("       /      \\");
				System.out.println("      / O   O  \\");
				System.out.println("     /          \\");
				System.out.println("    |           |");
				System.out.println("     \\   ___   /");
				System.out.println("      \\ /   \\ /");
				System.out.println("       \\_____/");
				break;
			case "mad":
				System.out.println("\t______");
				System.out.println("       /      \\");
				System.out.println("      / O\\ /O  \\");
				System.out.println("     /          \\");
				System.out.println("    |           |");
				System.out.println("     \\   ___   /");
				System.out.println("      \\       /");
				System.out.println("       \\_____/");
				break;
		}
	}
}
