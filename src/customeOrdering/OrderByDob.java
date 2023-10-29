package customeOrdering;

import java.util.Comparator;

import com.core.Customer;

public class OrderByDob implements Comparator<Customer> {
	@Override
	public int compare(Customer obj1,Customer obj2)
	{
		return obj1.getDob().compareTo(obj2.getDob());
	}
}
