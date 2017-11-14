
public class Tut28 {
	public static void main(String[] args){
		System.out.println("Index\tValue"); //Prints header of table, with /t being a tab
		int Table[] = {4, 6, 765, 1234, 76, 98, 23, 56, 234 ,67, 23, 65, 23, 6,3, 53};
		
		for (int counter = 0;counter<Table.length;counter++){ //counter<Table.length, Table.length will be replaced with the amount of variable entered
			System.out.println(counter + "\t" + Table[counter]); //Prints the number, a tab, then the value of that number
		}
	}
}
