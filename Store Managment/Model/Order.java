package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Order 
{
    private static int aid=1;
    private int id,cid;
    private List productlist;
    private float totalprice;
    private String date;

    public Order() 
    {
    }
    public Order(int cid, List productlist, float totalprice) 
    {
        this.id = aid;
        aid++;
        this.cid = cid;
        this.productlist = productlist;
        this.totalprice = totalprice;

        LocalDate ld=LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = ld.format(formatter);

		this.date=formattedDate;
    }

    public void setId() 
    {
        this.id = aid;
        aid++;
    }
    public void setCid(int cid) 
    {
        this.cid = cid;
    }
    public void setProductlist(List productlist) 
    {
        this.productlist = productlist;
    }
    public void setTotalprice(float totalprice) 
    {
        this.totalprice = totalprice;
    }
    public void setDate() 
    {
        LocalDate ld=LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = ld.format(formatter);

		this.date=formattedDate;
    }

    public int getId() 
    {
        return id;
    }
    public int getCid() 
    {
        return cid;
    }
    public List getProductlist() 
    {
        return productlist;
    }
    public double getTotalprice() 
    {
        return totalprice;
    }
    public String getDate() 
    {
        return date;
    }
}
