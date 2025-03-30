package Repository;

import java.util.*;

import Model.Product;

public class ProductRepositoryIMPL implements ProductRepository
{
    ArrayList product=new ArrayList();

    public boolean isAddNewProduct(Product p)
    {
        return product.add(p);
    }

    public List getAllProduct()
    {
        return product;
    }

    public Product getProductById(int id)
    {
        for(Object obj:product)
        {
            Product p=(Product)obj;
            if(p.getId()==id)
                return p;
        }
        return null;
    }

    public List getProductByName(String name)
    {
        List list=new ArrayList();

        for(Object obj:product)
        {
            Product p=(Product)obj;
            if(p.getName().equals(name))
                list.add(p);
        }
        return list;
    }

    public boolean deleteProductById(int id)
    {
        for(Object obj:product)
        {
            Product p=(Product)obj;
            if(p.getId()==id)
                return product.remove((Object)p);
        }
        return false;
    }

    public int getTotalProductCount()
    {
        return product.size();
    }
}
