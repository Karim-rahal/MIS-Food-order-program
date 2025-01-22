package misProject;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class MIStest {
	
	private static final String csvFilePath="C:\\Users\\CORONA\\Desktop\\karim.txt";
    public static void main(String[] args) {
    	NumberFormat fmt1= NumberFormat.getCurrencyInstance();
    	Scanner scanner = new Scanner(System.in);
    	String username,address,phone, id , generatedId;
    	Cashier cashier=new Cashier();
        do {
        	System.out.println("Cashier login:");
			System.out.print("Username: ");
			String username1 = scanner.nextLine();
			System.out.print("Password: ");
			String password1 = scanner.nextLine();
			cashier.setTrue(username1, password1);
        }while(cashier.getTrue()==false);
        System.out.println("Welcome cashier "+cashier.getName());
        System.out.println("Customer Login: ");
        System.out.print("Enter your ID (Enter 0 if you're new): ");
        id = scanner.nextLine();

        boolean hasOrderHistory = Csv.hasOrderHistory(csvFilePath, id);

        if (hasOrderHistory) {
            System.out.println("User with ID '" + id + "' has order history");
            String[] userInfo = Csv.extractUserInfo(csvFilePath, id);
           username = userInfo[0];
             address = userInfo[1];
             phone = userInfo[2];
            
           
        } else {
            System.out.println("User with ID '" + id + "' does not have order history");
             generatedId = Csv.generateRandomId(csvFilePath);
            System.out.print("Enter your username: ");
             username = scanner.nextLine();
            System.out.println("Address:");
             address = scanner.nextLine();
            System.out.println("Phone (###-###-####):");
             phone = scanner.nextLine();
             System.out.println("Your new ID is: "+generatedId);
            Csv.saveUserInfoToCSV(csvFilePath, generatedId, username, address, phone);
            String[] userInfo = Csv.extractUserInfo(csvFilePath, generatedId);
            username = userInfo[0];
              address = userInfo[1];
              phone = userInfo[2];
            id=generatedId;
        }
    
        Customer customer1 = new Customer(id, username, address,phone);
        
    
        int choice,sumprice=0;ArrayList<OrderItem> orders = new ArrayList<>();
        do { 
            System.out.println();
            
            System.out.println("1. Add an order");
            System.out.println("2. Delete an order");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter your category (Food, Drink, Appetizers): ");
                    String c = scanner.nextLine();
                    Category cat1 = new Category(c);
                    cat1.menu(c);
                    System.out.println();
                    System.out.print("Enter your choice: ");
                    int n1 = scanner.nextInt();
                    System.out.println();

                    Category cat2 = new Category(c, n1);
                    Product product1 = new Product(cat2);
                    System.out.println(product1);
                    System.out.println();

                    System.out.print("Enter quantity: ");
                    int q1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();

                    OrderItem orderItem = new OrderItem(product1, q1);
                    orders.add(orderItem);
                    break;
                case 2:
                   
                    if (orders.isEmpty()) {
                        System.out.println("No orders to delete.");
                    } else {
                       
                        System.out.println("Current orders:");
                        for (int i = 0; i < orders.size(); i++) {
                            System.out.println((i + 1) + ". " + orders.get(i));
                        }

                        System.out.print("Enter the order number to delete: ");
                        int orderNumber = scanner.nextInt();
                        scanner.nextLine();

                        if (orderNumber >= 1 && orderNumber <= orders.size()) {
                            
                            OrderItem removedOrder = orders.remove(orderNumber - 1);
                            System.out.println("Order removed: " + removedOrder);
                        } else {
                            System.out.println("Invalid order number.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 3);
        System.out.println("Order summary:");
        int i=1;
        for (OrderItem order : orders) {
        	
            System.out.println("Order "+i+":\n"+order);
            sumprice+=order.getPrice();      i++;  }
        Csv.extractUserInfo(csvFilePath, id);
    
        System.out.println("Total price of orders: "+fmt1.format(sumprice));
    
    }
    
}


