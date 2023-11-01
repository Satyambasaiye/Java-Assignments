package Tester;

import java.util.ArrayList;

import java.util.*;
import com.core.*;
import static utils.CustomerUtils.*;
import static utils.ValidationRules.*;
import static admin.Admin.*;
import customeOrdering.OrderByDob;

public class CustomerTester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Customer> customerArr = sampleData();
			boolean exit = false;
			while (!exit) {
				System.out.println("\n1:Sign up\n2:logg in \n3:Change password\n4:Remove Customer \n5:display all ");
				System.out.println(
						"6:sort by email \n7:sort by dob \n8:sort by dob and name \n9:not paid substrion for 3 months");
<<<<<<< HEAD
				System.out.println("10 remove cust not paid subscription for 6 months 11:To pay subscription\n0:exit");
=======
				System.out.println("10 remove cust not paid subscription for 6 months\n0:exit");
>>>>>>> 5f592173138b51b05e9feda0dccbe6fdef513e98
				System.out.print("enter choice:");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("enter First name,last name,email,password,registration amount,DOB,plan");
						System.out.println("available plans");
						for (ServicePlan s : ServicePlan.values())
							System.out.println(s);
						customerArr.add(validateAll(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), sc.next().toUpperCase(), sc.next(), customerArr));
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
					case 6:
						Collections.sort(customerArr);
						break;
					case 7:
						Collections.sort(customerArr, new OrderByDob());
						break;
					case 8:
						Collections.sort(customerArr, new Comparator<Customer>() {
							@Override
							public int compare(Customer obj1, Customer obj2) {
								if (obj1.getDob().equals(obj2.getDob())) {
									return obj1.getfName().compareTo(obj2.getfName());
								}
								return obj1.getDob().compareTo(obj2.getDob());
							}
						});
						break;
					case 9:
						notPaidSubscription(customerArr);
						break;
					case 10:
						removeNotPaidSubscription(customerArr);
						break;
<<<<<<< HEAD
					
=======
>>>>>>> 5f592173138b51b05e9feda0dccbe6fdef513e98

					case 0:
						System.out.println("------------Thank you!!!---------");
						exit = true;
						break;

					default:
						System.out.println("invalid choice try again !!!");
					}
					System.out.println("-----------------------------------------------------------------------------");
				} catch (Exception e) {
					System.out.println(e);
					e.printStackTrace();
					sc.nextLine();
					System.out.println("please try again !!!");
				}

			}

		}
	}
}
