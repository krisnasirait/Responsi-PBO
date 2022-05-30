package productmanager.product.model;

import java.util.ArrayList;    

public interface ProductDao {

    public void createProduct(Product product);
    public Product getProductById(int productId);
    public ArrayList<Product> getAllProducts();
    public void updateProduct(Product product);
    public void deleteProduct(int productId);

}