package Repository;

import java.util.*;
import Model.Customer;
import Model.Order;

public interface CustomerRepository 
{
    boolean isAddNewCustomer(Customer c);
    List getAllCustomer();
    Customer getCustomerById(int id);
    List getCustomerName(String name);
    boolean deleteCustomerById(int id);
    boolean addNewOrder(Order o);
    List getAllOrder();
}
