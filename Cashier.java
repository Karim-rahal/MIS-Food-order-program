package misProject;

public class Cashier extends Person{
    private String password;
    private boolean s=false;
    public Cashier() {
    	super();
    }
    public Cashier(String name ) {
        super(name);
    }
    public void setTrue(String name , String password) {
    	if(name.equalsIgnoreCase("Hadi")&&password.equals("password1")) {
    		this.s=true;
    		this.name=name;
    		this.password=password;
    	}
    	else if(name.equalsIgnoreCase("Hadi")&&password!="password1") {
    		this.s=false;
    		System.out.println("Error! Correct username but incorrect password! Try again");
    	}
    	else if(name.equalsIgnoreCase("Karim")&&password.equals("password2")) {
    		this.s=true;
    		this.name=name;
    		this.password=password;
    	}
    	else if(name.equalsIgnoreCase("Karim")&&password!="password2") {
    		this.s=false;
    		System.out.println("Error! Correct username but incorrect password! Try again");
    	}
    	else {
    		this.s=false;
    		System.out.println("Error! Incorrect username and incorrect password! Try again");
    	}
    }
    public boolean getTrue() {
    	return this.s;
    }
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String toString() {
    	return "Cashier: "
    			
    			+"\nUsername: "+this.name;	
    }
}


