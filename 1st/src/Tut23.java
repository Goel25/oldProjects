
public class Tut23 {
	public static void main(String[] args){
		//A=P(1=R)^n
		double amount, principle = 10000, rate = .01;
		
		for (int year=1;year<=2555;year++){
			amount = principle *  Math.pow(1 + rate, year);
			System.out.println(year + "----------" + amount);
		}
	}
}
