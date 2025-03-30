import java.util.*;

import Model.*;
import Services.*;

public class ClientAplication 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        ProductService ps=new ProductServiceIMPL();
        CustomerService cs=new CustomerServiceIMPL();

        int ch;
        do
        {
            System.out.println("***************MENU**************");
            System.out.println("1. Add New Product");
            System.out.println("2. View All Products");
            System.out.println("3. Search Product By (Id,Name)");
            System.out.println("4. Delete Product by using Id");
            System.out.println("5. Count total number of products");
            System.out.println("6. Add New Customer");
            System.out.println("7. View All Customers");
            System.out.println("8. Search Customer By (Id,Name)");
            System.out.println("9. Purchase Products");
            System.out.println("10. View All Order");
            System.out.println("11. View individual customer orders");
            System.out.println("12. Delete customer and its order");
            System.out.println("13. Exit");
            System.out.println("------------------------------------");

            System.out.println("Enter your choice");
            ch=sc.nextInt();

            switch (ch) 
            {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter Product Name");
                    String name=sc.nextLine();

                    System.out.println("Enter Product Company");
                    String comp=sc.nextLine();

                    System.out.println("Enter Product Quantity");
                    int qty=sc.nextInt();

                    System.out.println("Enter Product Price");
                    float price=sc.nextFloat();

                    Product p=new Product(qty, name, comp, price);

                    if(ps.isAddNewProduct(p))
                    {
                        System.out.println("Product Added Successfully...");
                    }
                    else
                    {
                        System.out.println("Product Not added...");
                    }
                    break;
            
                case 2:
                    List obj=ps.getAllProduct();

                    topBottomLine(89);
                    System.out.printf("| %-5s | %-25s | %-25s | %-8s | %-10s |\n","Id","Name","Company","Quantity","Price");
                    topBottomLine(89);

                    for(Object ob:obj)
                    {
                        Product pro=(Product)ob;
                        System.out.printf("| %-5d | %-25s | %-25s | %-8d | %-10.2f |\n",pro.getId(),pro.getName(),pro.getCompany(),pro.getQty(),pro.getPrice());
                    }
                    topBottomLine(89);
                    break;

                case 3:
                    System.out.println("*******************");
                    System.out.println("1. Search Product by Id");
                    System.out.println("2. Search Product by Name");
                    System.out.println("----------------------------");

                    System.out.println("Enter Your choice");
                    int choice=sc.nextInt();

                    switch (choice) 
                    {
                        case 1:
                            System.out.println("Enter Product Id");
                            int id=sc.nextInt();
        
                            Product pro=ps.getProductById(id);
        
                            if(pro!=null)
                            {
                                topBottomLine(89);
                                System.out.printf("| %-5s | %-25s | %-25s | %-8s | %-10s |\n","Id","Name","Company","Quantity","Price");
                                topBottomLine(89);
                                System.out.printf("| %-5d | %-25s | %-25s | %-8d | %-10.2f |\n",pro.getId(),pro.getName(),pro.getCompany(),pro.getQty(),pro.getPrice());
                                topBottomLine(89);
                            }
                            else
                            {
                                System.out.println("Product Not found");
                            }
                            break;
                    
                        case 2:
                            sc.nextLine();
                            System.out.println("Enter Product Name");
                            name=sc.nextLine();

                            obj=ps.getProductByName(name);

                            if(obj.size()!=0)
                            {
                                topBottomLine(89);
                                System.out.printf("| %-5s | %-25s | %-25s | %-8s | %-10s |\n","Id","Name","Company","Quantity","Price");
                                topBottomLine(89);

                                for(Object ob:obj)
                                {
                                    pro=(Product)ob;
                                    System.out.printf("| %-5d | %-25s | %-25s | %-8d | %-10.2f |\n",pro.getId(),pro.getName(),pro.getCompany(),pro.getQty(),pro.getPrice());
                                }
                                topBottomLine(89);
                            }
                            else
                            {
                                System.out.println("Product Not found");
                            }
                            break;

                        default:
                            System.out.println("Invalid choice...");
                            break;
                    }
                    
                    break;
                    
                case 4:
                    System.out.println("Enter Product Id");
                    int id=sc.nextInt();

                    if(ps.deleteProductById(id))
                    {
                        System.out.println("Product delete Successfully");
                    }
                    else
                    {
                        System.out.println("Product Not found");
                    }
                    break;

                case 5:
                    System.out.println("Total Product Count is :"+ps.getTotalProductCount());
                    break;
                    
                case 6:
                    sc.nextLine();
                    System.out.println("Enter Customer name");
                    name=sc.nextLine();

                    System.out.println("Enter Customer Email");
                    String email=sc.nextLine();

                    System.out.println("Enter Contact Number");
                    String contact=sc.nextLine();

                    System.out.println("Enter Customer Address");
                    String address=sc.nextLine();

                    Customer c=new Customer(name, email, contact, address);

                    if(cs.isAddNewCustomer(c))
                    {
                        System.out.println("Customer Added Successfully...");
                    }
                    else
                    {
                        System.out.println("Customer Not Added");
                    }
                    break;

                case 7:
                    obj=cs.getAllCustomer();

                    topBottomLine(108);
                    System.out.printf("| %-5s | %-25s | %-25s | %-12s | %-25s |\n","Id","Name","Email","Contact","Address");
                    topBottomLine(108);

                    for(Object ob:obj)
                    {
                        Customer cust=(Customer)ob;
                        System.out.printf("| %-5d | %-25s | %-25s | %-12s | %-25s |\n",cust.getId(),cust.getName(),cust.getEmail(),cust.getContact(),cust.getAddress());
                    }
                    topBottomLine(108);
                    break;

                case 8:
                    System.out.println("*******************");
                    System.out.println("1. Search Customer by Id");
                    System.out.println("2. Search Customer by Name");
                    System.out.println("----------------------------");

                    System.out.println("Enter Your choice");
                    choice=sc.nextInt();

                    switch (choice) 
                    {
                        case 1:
                            System.out.println("Enter Customer Id");
                            id=sc.nextInt();
        
                            Customer cust=cs.getCustomerById(id);
        
                            if(cust!=null)
                            {
                                topBottomLine(108);
                                System.out.printf("| %-5s | %-25s | %-25s | %-12s | %-25s |\n","Id","Name","Email","Contact","Address");
                                topBottomLine(108);
                                System.out.printf("| %-5d | %-25s | %-25s | %-12s | %-25s |\n",cust.getId(),cust.getName(),cust.getEmail(),cust.getContact(),cust.getAddress());
                                topBottomLine(108);
                            }
                            else
                            {
                                System.out.println("Customer Not found");
                            }
                            break;
                    
                        case 2:
                            sc.nextLine();
                            System.out.println("Enter Customer Name");
                            name=sc.nextLine();

                            obj=cs.getCustomerName(name);

                            if(obj.size()!=0)
                            {
                                topBottomLine(108);
                                System.out.printf("| %-5s | %-25s | %-25s | %-12s | %-25s |\n","Id","Name","Email","Contact","Address");
                                topBottomLine(108);

                                for(Object ob:obj)
                                {
                                    cust=(Customer)ob;
                                    System.out.printf("| %-5d | %-25s | %-25s | %-12s | %-25s |\n",cust.getId(),cust.getName(),cust.getEmail(),cust.getContact(),cust.getAddress());
                                }
                                topBottomLine(108);
                            }
                            else
                            {
                                System.out.println("Customer Not found");
                            }
                            break;

                        default:
                            System.out.println("Invalid choice...");
                            break;
                    }

                    break;

                case 9:
                    System.out.println("Enter Customer Id");
                    int cid=sc.nextInt();

                    Customer cust=cs.getCustomerById(cid);

                    if(cust==null)
                    {
                        System.out.println("Invalild Customer id");
                        break;
                    }
                    List ol=new ArrayList();
                    int a;
                    float totalPrice=0;

                    do
                    {
                        obj=ps.getAllProduct();

                        topBottomLine(89);
                        System.out.printf("| %-5s | %-25s | %-25s | %-8s | %-10s |\n","Id","Name","Company","Quantity","Price");
                        topBottomLine(89);

                        for(Object ob:obj)
                        {
                            Product pro=(Product)ob;
                            System.out.printf("| %-5d | %-25s | %-25s | %-8d | %-10.2f |\n",pro.getId(),pro.getName(),pro.getCompany(),pro.getQty(),pro.getPrice());
                        }
                        topBottomLine(89);

                        System.out.println("Enter Product id you want to buy");
                        int pid=sc.nextInt();

                        Product product=ps.getProductById(pid);
                        if(product!=null)
                        {
                            ol.add(product);
                            totalPrice+=product.getPrice();
                        }
                        else
                            System.out.println("Invalid Product Id");

                        System.out.println("Do you want to buy more (Yes:1, No:0)");
                        a=sc.nextInt();
                    }while(a==1);

                    if(ol.size()!=0)
                    {
                        Order or=new Order(cid, ol, totalPrice);
                        cust.setOrderlist(or);

                        cs.addNewOrder(or);
                    }

                    break;

                case 10:
                    List order=cs.getAllOrder();

                    topBottomLine(78);
                    System.out.printf("| %-5s | %-5s | %-12s | %-15s | %-25s |\n","Id","C_Id","Date","Total Price","Product List");
                    topBottomLine(78);

                    for(Object ob:order)
                    {
                        Order o=(Order)ob;
                        System.out.printf("| %-5d | %-5d | %-12s | %-15.2f |",o.getId(),o.getCid(),o.getDate(),o.getTotalprice());

                        List pl=o.getProductlist();
                        boolean flag=true;
                        for(Object object:pl)
                        {
                            Product product=(Product)object;

                            if(flag)
                            {
                                System.out.printf(" %-25s |\n",product.getName());
                                flag=false;
                            }
                            else
                                System.out.printf("| %-5s | %-5s | %-12s | %-15s | %-25s |\n","","","","",product.getName());
                        }
                        topBottomLine(78);
                    }
                    break;

                case 11:
                    System.out.println("Enter Customer id");
                    id=sc.nextInt();

                    cust=cs.getCustomerById(id);

                    if(cust!=null)
                    {
                        System.out.println("===============================================================");
                        System.out.println("Customer id   :"+cust.getId());
                        System.out.println("Customer Name :"+cust.getName());
                        System.out.println("Contact       :"+cust.getContact());

                        order=cust.getOrderlist();

                        topBottomLine(70);
                        System.out.printf("| %-5s | %-12s | %-15s | %-25s |\n","Id","Date","Total Price","Product List");
                        topBottomLine(70);

                        for(Object ob:order)
                        {
                            Order o=(Order)ob;
                            System.out.printf("| %-5d | %-12s | %-15.2f |",o.getId(),o.getDate(),o.getTotalprice());

                            List pl=o.getProductlist();
                            boolean flag=true;
                            for(Object object:pl)
                            {
                                Product product=(Product)object;

                                if(flag)
                                {
                                    System.out.printf(" %-25s |\n",product.getName());
                                    flag=false;
                                }
                                else
                                    System.out.printf("| %-5s | %-12s | %-15s | %-25s |\n","","","",product.getName());
                            }
                            topBottomLine(70);
                        }
                        System.out.println("===============================================================");
                    }
                    else
                    {
                        System.out.println("Customer Not found");
                    }
                    break;

                case 12:
                    System.out.println("Enter Customer Id");
                    id=sc.nextInt();

                    if(cs.deleteCustomerById(id))
                    {
                        System.out.println("Delete Customer And Its orders Successfully");
                    }
                    else
                    {
                        System.out.println("Customer Not found");
                    }
                    break;

                case 13:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice...");
                    break;
            }
        }while(ch!=13);
    }

    public static void topBottomLine(int w)
    {
        for(int i=0;i<w;i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }
}
