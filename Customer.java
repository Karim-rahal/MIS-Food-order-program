package misProject;

import java.util.ArrayList;

public class Customer extends Person{
    private String address;
    private String phone;
    private String id;
    

    public Customer(String id ,String name, String address, String phone) {
        super(name);
        this.id=id;
        this.address = address;
        this.phone = phone;
      
    }

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

  

  

}

