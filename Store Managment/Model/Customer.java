package Model;

import java.util.*;

public class Customer 
{
    private static int aid=1;
    private int id;
    private String name,email,contact,address;
    private List orderlist=new ArrayList();

    public Customer() 
    {
    }
    public Customer(String name, String email, String contact, String address) 
    {
        this.id = aid;
        aid++;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.address = address;
    }

    public void setId() 
    {
        this.id = aid;
        aid++;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }
    public void setContact(String contact) 
    {
        this.contact = contact;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }
    public void setOrderlist(Object ol) 
    {
        this.orderlist.add(ol);
    }

    public int getId() 
    {
        return id;
    }
    public String getName() 
    {
        return name;
    }
    public String getEmail() 
    {
        return email;
    }
    public String getContact() 
    {
        return contact;
    }
    public String getAddress() 
    {
        return address;
    }
    public List getOrderlist() 
    {
        return orderlist;
    }    
}
