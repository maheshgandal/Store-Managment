package Services;

import java.util.*;
import Model.*;


public interface ProductService 
{
    boolean isAddNewProduct(Product p);
    List getAllProduct();
    Product getProductById(int id);
    List getProductByName(String name);
    boolean deleteProductById(int id);
    int getTotalProductCount();
}
