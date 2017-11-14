
public class Tut11 {
	public static void main(String args[]){
		int boy, girl;
		boy = 18;
		girl = 68;
		
//		if (boy > 10 && girl < 60){IF BOTH ARE TRUE!
		if (boy > 10 || girl < 60 ){ //ONLY ONE HAS TO BE TRUE, OR BOTH
			System.out.print("You can enter!");
		}else{
			System.out.print("You can not enter");;
		}
	}
}
