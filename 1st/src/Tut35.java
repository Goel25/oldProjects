
public class Tut35 {
	public static void main(String[] args){
		System.out.println(average(43, 56, 76, 43, -345, 34, 654, 76, 1, 34, 0));
	}
	
	public static int average(int...numbers){
		int total = 0;
		for(int x:numbers)
			total += x;
		
		return total/numbers.length;
	}
}