package Services;

import java.util.List;

import Model.Customer;
import Model.Order;
import Repository.*;

public class CustomerServiceIMPL implements CustomerService
{
    CustomerRepository cr=new CustomerRepositoryIMPL();

    public boolean isAddNewCustomer(Customer c)
    {
        return cr.isAddNewCustomer(c);
    }

    public List getAllCustomer()
    {
        return cr.getAllCustomer();
    }

    public Customer getCustomerById(int id)
    {
        return cr.getCustomerById(id);
    }

    public List getCustomerName(String name)
    {
        return cr.getCustomerName(name);
    }

    public boolean deleteCustomerById(int id)
    {
        return cr.deleteCustomerById(id);
    }

    public boolean addNewOrder(Order o)
    {
        return cr.addNewOrder(o);
    }

    public List getAllOrder()
    {
        return cr.getAllOrder();
    }
}
