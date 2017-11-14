
public class Tut16t2 {
	private String girlName; //Private means that only the methods in this class can use it, unlike public
	public void SetName(String name){ //This is the first method
		girlName = name;
	}
	public String getName(){ //Second method. String is return type, if your string will return nothing, put void!
		return girlName;
	}
	public void saying(){
		System.out.printf("Your first gf was %s", getName());
	}
}
