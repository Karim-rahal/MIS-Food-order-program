package misProject;
import java.util.Random;
public class Person {
	protected String name;
	
	Random rand=new Random();
	public Person() {
		
	}
	public Person(String name) {
		this.name=name;
	}
	public void setName(String newName) {
		this.name=newName;
	}
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "Name: "+this.name
				;
	}
}