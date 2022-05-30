package productmanager.product.model;

import java.util.ArrayList;


public class ProductService {

    private final ProductDaoImpl productDaoImpl = new ProductDaoImpl();

    public void createProduct(Product product) {
        productDaoImpl.createProduct(product);
    }

    public Product getProductById(int productId) {
        return productDaoImpl.getProductById(productId);
    }

    public ArrayList<Product> getAllProducts() {
        return productDaoImpl.getAllProducts();
    }

    public void updateProduct(Product product) {
        productDaoImpl.updateProduct(product);
    }

    public void deleteProduct(int productId) {
        productDaoImpl.deleteProduct(productId);
    }

}
View:

AllProductsTableModel.java

package productmanager.product.view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import productmanager.product.model.Product;
import productmanager.product.model.ProductService;


public class AllProductsTableModel extends DefaultTableModel {

    private final String[] columnNames = {"productId", "#", "Order number", "Description", "Width", "Depth", "Height", "Weight", "Price"};
    private final ProductService productService = new ProductService();
    private final ArrayList<Product> allProducts = productService.getAllProducts();

    public AllProductsTableModel() {
        addColumnNames();
        addData();
    }

    public void addColumnNames() {
        for (String columnName : columnNames) {
            super.addColumn(columnName);
        }
    }

    public void addData() {
        for (Product product : allProducts) {
            Object[] productData = {
                product.getProductId(),
                Boolean.FALSE,
                product.getProductOrderNumber(),
                product.getProductDescription(),
                product.getProductWidth(),
                product.getProductDepth(),
                product.getProductHeight(),