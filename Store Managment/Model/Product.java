package Model;

public class Product 
{
    private static int aid=1;
    private int id,qty;
    private String name,company;
    private float price;

    public Product() 
    {
    }

    public Product(int qty, String name, String company, float price) 
    {
        this.id=aid;
        aid++;
        this.qty = qty;
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public void setId() 
    {
        this.id = aid;
        aid++;
    }
    public void setQty(int qty) 
    {
        this.qty = qty;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public void setCompany(String company) 
    {
        this.company = company;
    }
    public void setPrice(float price) 
    {
        this.price = price;
    }
    public int getId() 
    {
        return id;
    }
    public int getQty() 
    {
        return qty;
    }
    public String getName() 
    {
        return name;
    }
    public String getCompany() 
    {
        return company;
    }
    public float getPrice() 
    {
        return price;
    }
}
