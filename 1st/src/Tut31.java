
public class Tut31 {
	public static void main(String[] args){
		int Array[] = {4,5,6}; //Made array called Array
		int sum = 0; //Made sum and set it to 0
		
		for (int x: Array){ //Enhanced for statement: 1st argument is the type and name of the variable the values will be stored in, 2nd arg is what array we are looping
			//Enhanced for basically sets a variable to the first number in a certain array, does something with it then loops if for the 2nd number and so on
			sum += x; //Added x to sum for each value
		}
		System.out.println(sum);
	}
}
