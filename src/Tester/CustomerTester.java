package Tester;

import java.util.ArrayList;
import static utils.CustomerUtils.*;
import static utils.ValidationRules.*;
import java.util.List;
import java.util.Scanner;
import com.core.Customer;
import com.core.ServicePlan;


public class CustomerTester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Customer> customerArr = new ArrayList<Customer>();
			boolean exit = false;
			while (!exit) {
				System.out.println("1:Sign up\n2:logg in \n3:Change password\n4:Remove Customer \n5:display all \n0:exit");
				System.out.print("enter choice:");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("enter First name,last name,email,password,registration amount,DOB,plan");
						System.out.println("available plans");
						for(ServicePlan s:ServicePlan.values())
							System.out.println(s);
						customerArr.add(validateAll(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), sc.next().toUpperCase()));
						System.out.println("welcome to customer application");
						break;
					case 2:
						System.out.println("enter email and password");
						validateCustomer(sc.next(), sc.next(), customerArr);
						System.out.println("welcome back ");
						break;
					case 3:
						System.out.println("enter email password and new password");
						if (updatePass(sc.next(), sc.next(), sc.next(), customerArr))
							System.out.println("password changed succefully!!!");
						break;
					case 4:
						System.out.print("enter email: ");
						removeCustomer(sc.next(), customerArr);
						break;

					case 5:
						for (Customer i : customerArr)
							System.out.println(i);
						break;
					case 0:
						System.out.println("------------Thank you!!!---------");
						exit = true;
						break;
					default:
						System.out.println("invalid choice try again !!!");
					}
				} catch (Exception e) {
					System.out.println(e);
//					e.printStackTrace();
					sc.nextLine();
					System.out.println("please try again !!!");
				}

			}

		}
	}
}
