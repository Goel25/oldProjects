
public class Tut33 {
	public static void main(String[] args){
		int firstarray[][] = { {8,9,10,11} , {12,13,14,15} };//First square bracket for the row, second for the column. The first index (8,9,10,11) would be row 0, and the "9" in that row would be column 1
									//Inside the curly brackets, you have another set of curly brackets separated by a comma, and inside those curly brackets are is the content of that row
		int secondarray[][] = {{30,31,32,33},{43},{4,5,6}};
		System.out.println("First array: " + firstarray[0][3] + " | Second array: " + secondarray[0][2]);
	}
}
