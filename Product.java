package misProject;
import java.text.NumberFormat;
public class Product {
    private double price;
    private Category category;

    // constructor
    public Product(Category category) {
       this.category=category;
       if(category.getCategory().equals("food")||category.getCategory().equals("Food")) {
			if(category.getNb()==1)
				this.price=5;
			else if(category.getNb()==2)
				this.price=7;
			else if(category.getNb()==3)
				this.price=6;
			else if(category.getNb()==4)
				this.price=5;
			else if(category.getNb()==5)
				this.price=4;
			else if(category.getNb()==6)
				this.price=10;
		}
		if(category.getCategory().equals("drink")||category.getCategory().equals("Drink")) {
			if(category.getNb()==1)
				this.price=2;
			else if(category.getNb()==2)
				this.price=2;
			else if(category.getNb()==3)
				this.price=2;
			else if(category.getNb()==4)
				this.price=2;
			else if(category.getNb()==5)
				this.price=4;
			else if(category.getNb()==6)
				this.price=3;
		}
		if(category.getCategory().equals("appetizers")||category.getCategory().equals("Appetizers")) {
			if(category.getNb()==1)
				this.price=3;
			else if(category.getNb()==2)
				this.price=4;
			else if(category.getNb()==3)
				this.price=3;
			else if(category.getNb()==4)
				this.price=3;
			else if(category.getNb()==5)
				this.price=2;
			else if(category.getNb()==6)
				this.price=5;
		}
    }
    
    public double getPrice() {
        return this.price;
    }

    public Category getCategory() {
		return category;
	}
    public String getChoice() {
    	return category.getChoice();
    }
	public void setPrice(Category category) {
		if(category.getCategory().equals("food")||category.getCategory().equals("Food")) {
			if(category.getNb()==1)
				this.price=5;
			else if(category.getNb()==2)
				this.price=7;
			else if(category.getNb()==3)
				this.price=6;
			else if(category.getNb()==4)
				this.price=5;
			else if(category.getNb()==5)
				this.price=4;
			else if(category.getNb()==6)
				this.price=10;
		}
		if(category.getCategory().equals("drink")||category.getCategory().equals("Drink")) {
			if(category.getNb()==1)
				this.price=2;
			else if(category.getNb()==2)
				this.price=2;
			else if(category.getNb()==3)
				this.price=2;
			else if(category.getNb()==4)
				this.price=2;
			else if(category.getNb()==5)
				this.price=4;
			else if(category.getNb()==6)
				this.price=3;
		}
		if(category.getCategory().equals("appetizers")||category.getCategory().equals("Appetizers")) {
			if(category.getNb()==1)
				this.price=3;
			else if(category.getNb()==2)
				this.price=4;
			else if(category.getNb()==3)
				this.price=3;
			else if(category.getNb()==4)
				this.price=3;
			else if(category.getNb()==5)
				this.price=2;
			else if(category.getNb()==6)
				this.price=5;
		}
    }
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	public String toString() {
		return category.toString() 
				+"\nPrice of 1 " + category.getChoice() +" is: "+ fmt.format(getPrice());
	}

}

