package misProject;
import java.text.NumberFormat;
public class OrderItem {
    private Product product;
    private int quantity;
    private double discount;
    NumberFormat fmt1= NumberFormat.getCurrencyInstance();
    NumberFormat fmt2= NumberFormat.getPercentInstance();
    public OrderItem(Product product, int quantity ) {
        this.product = product;
        if(quantity<=0)
        	this.quantity = 1;
        else
        	this.quantity= quantity;
        if(this.quantity<5)
        	this.discount=0;
        else if(this.quantity>=5&&this.quantity<10)
        	this.discount=0.1;
        else if(this.quantity>=10&&this.quantity<15)
        	this.discount=0.2;
        else if(this.quantity>=15&&this.quantity<=20)
        	this.discount=0.25;
        else if(this.quantity>20)
        	this.discount=0.3;
    }
    public Product getProduct() {
        return product;
    }
    public String getDiscount() {
    	return fmt2.format(this.discount);
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return product.getPrice() * quantity*(1-this.discount);
    }
    public double getInitialPrice() {
    	return product.getPrice() * quantity;
    }
    public String toString() {
    	return product.toString()
    			+"\nQuantity of "+ product.getChoice() + " is: "+this.quantity
    			+"\nPrice before discount: "+ fmt1.format(getInitialPrice())
    			+"\nDiscount: "+ getDiscount()
    			+"\nPrice after discount: " + fmt1.format(getPrice());
    }

}

