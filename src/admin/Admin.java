package admin;

import java.util.*;
import com.core.*;

import java.time.LocalDate;
import java.time.Period;

public class Admin {
	public static void notPaidSubscription(List<Customer> list) {
		Iterator<Customer> itr = list.iterator();
		while (itr.hasNext()) {
			Customer cust = itr.next();
			if ((Period.between(cust.getLastSubscriptionPaidDate(), LocalDate.now())).toTotalMonths() >= 3)
				System.out.println(cust.getfName() + " " + cust.getlName());
		}
	}

	public static void removeNotPaidSubscription(List<Customer> list) {
		Iterator<Customer> itr = list.iterator();
		while (itr.hasNext()) {
			Customer cust = itr.next();
			if (((Period.between(cust.getLastSubscriptionPaidDate(), LocalDate.now())).toTotalMonths()) > 6)
				itr.remove();

		}
	}

}
