
public class Tut17t2 {
	private String girlName; 
	public Tut17t2(String name){ //Name it the same as the class to initialize it. Can't be void because then it can't return anything
		girlName = name;
	}
	public String getName(){
		return girlName;
	}
	public void saying(){
		System.out.println("Your first gf was " + getName());
		
	}
}
