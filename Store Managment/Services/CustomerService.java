package Services;

import java.util.*;
import Model.*;

public interface CustomerService 
{
    boolean isAddNewCustomer(Customer c);
    List getAllCustomer();
    Customer getCustomerById(int id);
    List getCustomerName(String name);
    boolean deleteCustomerById(int id);
    boolean addNewOrder(Order o);
    List getAllOrder();
}
