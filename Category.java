package misProject;

public class Category {
	private String category;
	private int nb;
	private String choice;
	public Category(String category) {
		if(category.equalsIgnoreCase("food")||category.equalsIgnoreCase("drink")||category.equalsIgnoreCase("appetizers"))
			this.category = category;
		else
			this.category="food";
	}
	public Category(String category , int nb) {
		if(category.equalsIgnoreCase("food")||category.equalsIgnoreCase("drink")||category.equalsIgnoreCase("appetizers"))
			this.category = category;
		else
			this.category="food";
		if(nb<1||nb>6)
			this.nb=1;
		else
			this.nb=nb;
		if(category.equalsIgnoreCase("food")) {
			if(nb==1)
				this.choice="Classic Burger";
			else if(nb==2)
				this.choice="Cheese Burger";
			else if(nb==3)
				this.choice="Lebanese Burger";
			else if(nb==4)
				this.choice="Shawarma";
			else if(nb==5)
				this.choice="Chicken Shawarma";
			else if(nb==6)
				this.choice="Chicken Wings";
		}
		if(category.equalsIgnoreCase("drink")) {
			if(nb==1)
				this.choice="Cola";
			else if(nb==2)
				this.choice="Pepsi";
			else if(nb==3)
				this.choice="Jallab";
			else if(nb==4)
				this.choice="Tea";
			else if(nb==5)
				this.choice="Mango Juice";
			else if(nb==6)
				this.choice="Orange Juice";
		}
		if(category.equalsIgnoreCase("appetizers")) {
			if(nb==1)
				choice="Bruschetta";
			else if(nb==2)
				choice="Mozzarella Sticks";
			else if(nb==3)
				choice="Hummus";
			else if(nb==4)
				choice="Tabbouleh";
			else if(nb==5)
				choice="Sambousek";
			else if(nb==6)
				choice="Kibbeh";
		}
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		if(category.equalsIgnoreCase("food")||category.equalsIgnoreCase("drink")||category.equalsIgnoreCase("appetizers"))
			this.category = category;
		else
			this.category="food";
	}
	public void menu(String category) {
		if(category.equalsIgnoreCase("food"))
			System.out.println("Menu: \n1-Classic Burger \t2-Cheese Burger \t3-Lebanese Burger "
					+ "\n4-Shawarma \t5-Chicken Shawarma \t6-Chiken wings");
		else if(category.equalsIgnoreCase("drink"))
			System.out.println("Menu: \n1-Cola \t2-Pepsi \t3-Jallab"
					+ "\n4-Tea \t5-Mango Juice \t6-Orange Juice");	
		else if(category.equalsIgnoreCase("appetizers"))
			System.out.println("Menu: \n1-Bruschetta \t2-Mozzarella Sticks \t3-Hummus"
					+ "\n4-Tabbouleh \t5-Sambousek \t6-Kibbeh");
	}
	public int getNb() {
		return nb;
	}
	public void setNb(int nb) {
		if(nb<1||nb>6)
			this.nb=1;
		else
			this.nb=nb;
	}
	public void setChoice(String category,int nb) {
		if(category.equalsIgnoreCase("food")) {
			if(nb==1)
				choice="Classic Burger";
			else if(nb==2)
				choice="Cheese Burger";
			else if(nb==3)
				choice="Lebanese Burger";
			else if(nb==4)
				choice="Shawarma";
			else if(nb==5)
				choice="Chicken Shawarma";
			else if(nb==6)
				choice="Chicken Wings";
		}
		if(category.equalsIgnoreCase("drink")) {
			if(nb==1)
				choice="Cola";
			else if(nb==2)
				choice="Pepsi";
			else if(nb==3)
				choice="Tea";
			else if(nb==4)
				choice="Ice Tea";
			else if(nb==5)
				choice="Mango Juice";
			else if(nb==6)
				choice="Orange Juice";
		}
		if(category.equalsIgnoreCase("appetizers")) {
			if(nb==1)
				choice="Bruschetta";
			else if(nb==2)
				choice="Mozzarella Sticks";
			else if(nb==3)
				choice="Hummus";
			else if(nb==4)
				choice="Tabbouleh";
			else if(nb==5)
				choice="Sambousek";
			else if(nb==6)
				choice="Kibbeh";
		}
	}
	public String getChoice() {
		return this.choice;
	}
	public String toString() {
		return "Your category is: "+this.category
				+"\nYour choice is: "+this.choice;
						
	}
}
