package Repository;

import java.util.*;

import Model.*;

public class CustomerRepositoryIMPL implements CustomerRepository
{
    List customer=new ArrayList();
    List order=new ArrayList();

    public boolean isAddNewCustomer(Customer c)
    {
        return customer.add(c);
    }

    public List getAllCustomer()
    {
        return customer;
    }

    public Customer getCustomerById(int id)
    {
        for(Object obj:customer)
        {
            Customer c=(Customer)obj;

            if(c.getId()==id)
                return c;
        }
        return null;
    }

    public List getCustomerName(String name)
    {
        List list=new ArrayList();

        for(Object obj:customer)
        {
            Customer c=(Customer)obj;
            if(c.getName().equals(name))
            {
                list.add(c);
            }
        }
        return list;
    }

    public boolean deleteCustomerById(int id)
    {
        for(Object obj:customer)
        {
            Customer c=(Customer)obj;
            if(c.getId()==id)
            {
                ListIterator ltr=order.listIterator();
                while(ltr.hasNext()) 
                {
                    Order or =(Order)ltr.next();
                    
                    if(or.getCid()==c.getId())
                    {
                        ltr.remove();
                    }
                }
                return customer.remove((Object)c);
            }
        }
        return false;
    }

    public boolean addNewOrder(Order o)
    {
        return order.add(o);
    }

    public List getAllOrder()
    {
        return order;
    }
}
