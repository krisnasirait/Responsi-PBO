package productmanager.product.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import productmanager.database.ConnectToDatabase;

public class ProductDaoImpl implements ProductDao {

    private final Connection conn = ConnectToDatabase.createConnection();
    private final String SQL_CREATE_PRODUCT = "INSERT INTO product (productOrderNumber, productDescription, productWidth, productDepth, productHeight, productWeight, productPrice) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private final String SQL_GET_PRODUCT_BY_ID = "SELECT * FROM product WHERE productId=?";
    private final String SQL_GET_ALL_PRODUCTS = "SELECT * FROM product";
    private final String SQL_UPDATE_PRODUCT = "UPDATE product SET productOrderNumber=?, productDescription=?, productWidth=?, productDepth=?, productHeight=?, productWeight=?, productPrice=? WHERE productId=?";
    private final String SQL_DELETE_PRODUCT = "DELETE FROM product WHERE productId=?";

    @Override
    public void createProduct(Product product) {
        try (PreparedStatement pstmt = conn.prepareStatement(SQL_CREATE_PRODUCT, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, product.getProductOrderNumber());
            pstmt.setString(2, product.getProductDescription());
            pstmt.setDouble(3, product.getProductWidth());
            pstmt.setDouble(4, product.getProductDepth());
            pstmt.setDouble(5, product.getProductHeight());
            pstmt.setDouble(6, product.getProductWeight());
            pstmt.setDouble(7, product.getProductPrice());
            pstmt.executeUpdate();
            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    product.setProductId(generatedKeys.getInt(1));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Product getProductById(int productId) {
        Product product = new Product();
        try (PreparedStatement pstmt = conn.prepareStatement(SQL_GET_PRODUCT_BY_ID)) {
            pstmt.setInt(1, productId);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    product.setProductId(rs.getInt(1));
                    product.setProductOrderNumber(rs.getString(2));
                    product.setProductDescription(rs.getString(3));
                    product.setProductWidth(rs.getDouble(4));
                    product.setProductDepth(rs.getDouble(5));
                    product.setProductHeight(rs.getDouble(6));
                    product.setProductWeight(rs.getDouble(7));
                    product.setProductPrice(rs.getDouble(8));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        ArrayList<Product> allProducts = new ArrayList();
        try (PreparedStatement pstmt = conn.prepareStatement(SQL_GET_ALL_PRODUCTS);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Product product = new Product();
                product.setProductId(rs.getInt(1));
                product.setProductOrderNumber(rs.getString(2));
                product.setProductDescription(rs.getString(3));
                product.setProductWidth(rs.getDouble(4));
                product.setProductDepth(rs.getDouble(5));
                product.setProductHeight(rs.getDouble(6));
                product.setProductWeight(rs.getDouble(7));
                product.setProductPrice(rs.getDouble(8));
                allProducts.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allProducts;
    }

    @Override
    public void updateProduct(Product product) {
        try (PreparedStatement pstmt = conn.prepareStatement(SQL_UPDATE_PRODUCT)) {
            pstmt.setString(1, product.getProductOrderNumber());
            pstmt.setString(2, product.getProductDescription());
            pstmt.setDouble(3, product.getProductWidth());
            pstmt.setDouble(4, product.getProductDepth());
            pstmt.setDouble(5, product.getProductHeight());
            pstmt.setDouble(6, product.getProductWeight());
            pstmt.setDouble(7, product.getProductPrice());
            pstmt.setInt(8, product.getProductId());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteProduct(int productId) {
        try (PreparedStatement pstmt = conn.prepareStatement(SQL_DELETE_PRODUCT)) {            
            pstmt.setInt(1, productId);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}