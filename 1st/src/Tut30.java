import java.util.Random;

public class Tut30 {
	public static void main(String[] args){
		Random Rand = new Random();
		double freq[] = new double[7]; //Created a variable to store the how many times that each side was rolled
		
		for (int roll = 1;roll<1000;roll++){ //Looped 1,000 times
			++freq[1+Rand.nextInt(6)]; //Each loop, it would roll a random number, 1-5, add one so it was 1-6, then added 1 to freq[1-6] so it added one each time that side was rolled
		}
		System.out.println("Face\tFrequency\tPercentage"); //Header of chart
		
		for (int face = 1;face<freq.length;face++){ //Looped each face
			double per = freq[face] / 10; //Get's the percentage, added by me
			System.out.println(face + "\t" + freq[face] + "        \t" + per + "%"); //Printed the face (1-6) with the amount of times that face was rolled to the left of it, then I added the percentage
		}
	}
}
