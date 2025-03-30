package Services;

import java.util.List;

import Model.Product;
import Repository.*;

public class ProductServiceIMPL implements ProductService
{
    ProductRepository pr=new ProductRepositoryIMPL();

    public boolean isAddNewProduct(Product p)
    {
        return pr.isAddNewProduct(p);
    }

    public List getAllProduct()
    {
        return pr.getAllProduct();
    }

    public Product getProductById(int id)
    {
        return pr.getProductById(id);
    }

    public List getProductByName(String name)
    {
        return pr.getProductByName(name);
    }

    public boolean deleteProductById(int id)
    {
        return pr.deleteProductById(id);
    }

    public int getTotalProductCount()
    {
        return pr.getTotalProductCount();
    }
}
