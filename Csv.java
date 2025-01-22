package misProject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Csv {
	
	 public static void saveUserInfoToCSV(String csvFile, String id, String username, String address, String phone) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile, true))) {
	            writer.write(id);
	            writer.write(",");
	            writer.write(username);
	            writer.write(",");
	            writer.write(address);
	            writer.write(",");
	            writer.write(phone);
	            writer.newLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 public static boolean hasOrderHistory(String csvFile, String id) {
	        String line;
	        String cvsSplitBy = ",";

	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
	            while ((line = br.readLine()) != null) {
	                String[] fields = line.split(cvsSplitBy);
	                String idFromFile = fields[0];
	                if (idFromFile.equals(id)) {
	                    return true;
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return false;
	    }
	 
		  
			   public static String[] extractUserInfo(String csvFile, String id) {
			        String line;
			        String cvsSplitBy = ",";

			        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			            while ((line = br.readLine()) != null) {
			                String[] fields = line.split(cvsSplitBy);

			                if (fields.length >= 4) {
			                    String id1 = fields[0];
			                    if (id.equals(id1)) {
			                        String username = fields[1];
			                        String address = fields[2];
			                        String phone = fields[3];
			                       
			                        System.out.println("Username: "+username );
			                        System.out.println("Address: " + address);
			                        System.out.println("Phone: " + phone);
			                        return new String[]{username, address, phone};
			                         
			                    }
			                    
			                }
			            }
			        } catch (IOException e) {
			            e.printStackTrace();
			        }

			        // Return null if no matching ID found
			        return null;
			    }

public static String generateRandomId(String csvFile) {
    Set<String> existingIds = new HashSet<>();
    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] fields = line.split(",");
            String id = fields[0];
            existingIds.add(id);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    Random random = new Random();
    String generatedId;
    do {
        int idNumber = random.nextInt(9000) + 1000;
        generatedId = "2023_" + idNumber;
    } while (existingIds.contains(generatedId));

    return generatedId;
}
}