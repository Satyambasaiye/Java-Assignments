package Tester;


import com.core.Customer;
import com.core.ValidationRules;

public class CustomerTester {
	public static void main(String[] args) {
//validateAll(String fName, String lName, String email, String password, double regAmount, LocalDate dob,

//(String fName, String lName, String email, String password, double regAmount, LocalDate dob,String plan)
		try {
			Customer obj = ValidationRules.validateAll("abc", "xyzw", "abc@gmail.com", "abc@123", 2000, "2022-01-01","GOLD");
			System.out.println(obj);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
