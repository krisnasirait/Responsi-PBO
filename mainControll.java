package productmanager.product.controller;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import productmanager.product.model.Product;
import productmanager.product.model.ProductService;
import productmanager.product.view.AllProductsTableModel;
import productmanager.product.view.ProductDetailPanel;
import productmanager.product.view.ProductMainPanel;
import productmanager.product.view.ProductNewPanel;

public class ProductMainController {

    private final ProductMainPanel productMainPanel;

    public ProductMainController(ProductMainPanel productMainPanel) {
        this.productMainPanel = productMainPanel;
        ControlTablePanelController controlTablePanelController  = new ControlTablePanelController();
        TablePanelController tablePanelController = new TablePanelController();
    }

    private class ControlTablePanelController {

        public ControlTablePanelController() {
            productMainPanel.addDeleteBtnEnabler(new DeleteBtnEnabler());
            productMainPanel.addCreateProductBtnActionListener(new ControlTablePanelBtnsCotroller(0));
            productMainPanel.addDeleteProductBtnActionListener(new ControlTablePanelBtnsCotroller(1));
        }

        private class ControlTablePanelBtnsCotroller implements ActionListener {

            private final int actionListenerNum;

            public ControlTablePanelBtnsCotroller(int actionListenerNum) {
                this.actionListenerNum = actionListenerNum;
            }

            @Override
            public void actionPerformed(ActionEvent e) {                
                switch (actionListenerNum) {
                    case 0:
                        ProductNewPanel productNewPanel = new ProductNewPanel();
                        productMainPanel.addPanelToMainPanel(productNewPanel, "productNewPanel");
                        productMainPanel.changePanel("productNewPanel");
                        ProductNewController productNewController = new ProductNewController(productNewPanel, productMainPanel);
                        break;
                    case 1:
                        JTable allProductsTable = productMainPanel.getAllProductsTable();
                        AllProductsTableModel allProductsTableModel = (AllProductsTableModel) allProductsTable.getModel();
                        for (int i = allProductsTableModel.getRowCount() - 1; i >= 0; i--) {
                            boolean checked = (boolean) allProductsTableModel.getValueAt(i, 1);
                            if (checked) {
                                int productId = (int) allProductsTableModel.getValueAt(i, 0);
                                ProductService productService = new ProductService();
                                productService.deleteProduct(productId);
                                allProductsTableModel.removeRow(i);
                            }
                        }
                        break;
                }

            }

        }

        private class DeleteBtnEnabler implements TableModelListener {

            @Override
            public void tableChanged(TableModelEvent e) {
                JButton deleteProductBtn = productMainPanel.getDeleteProductBtn();
                if (isAnyRowChecked()) {
                    deleteProductBtn.setEnabled(true);
                } else {
                    deleteProductBtn.setEnabled(false);
                }
            }

            private boolean isAnyRowChecked() {
                JTable allProductsTable = productMainPanel.getAllProductsTable();
                AllProductsTableModel allProductsTableModel = (AllProductsTableModel) allProductsTable.getModel();
                for (int i = 0; i < allProductsTableModel.getRowCount(); i++) {
                    boolean checked = (boolean) allProductsTableModel.getValueAt(i, 1);
                    if (checked) {
                        return true;
                    }
                }
                return false;
            }

        }

    }

    private class TablePanelController extends MouseAdapter{

        public TablePanelController() {
            productMainPanel.addDoubleClickListenerToAllProductsTable(this);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            JTable allProductsTable = productMainPanel.getAllProductsTable();
            Point p = e.getPoint();
            int row = allProductsTable.rowAtPoint(p);
            int column = allProductsTable.columnAtPoint(p);
            if (row != -1 && column !=0 && e.getClickCount() == 2 && SwingUtilities.isLeftMouseButton(e)) {
                AllProductsTableModel allProductsTableModel = (AllProductsTableModel) allProductsTable.getModel();
                int productId = (int) allProductsTableModel.getValueAt(row, 0);
                ProductService productService = new ProductService();
                Product product = productService.getProductById(productId);
                ProductDetailPanel productDetailPanel = new ProductDetailPanel(product);
                productMainPanel.addPanelToMainPanel(productDetailPanel, "productDetailPanel");
                productMainPanel.changePanel("productDetailPanel");
                ProductDetailController productDetailController = new ProductDetailController(product, productDetailPanel, productMainPanel);
            }
        }        

    }
}
ProductNewController.java

package productmanager.product.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import productmanager.product.model.Product;
import productmanager.product.model.ProductService;
import productmanager.product.view.AllProductsTableModel;
import productmanager.product.view.ProductDetailPanel;
import productmanager.product.view.ProductMainPanel;
import productmanager.product.view.ProductNewPanel;

public class ProductNewController {

    private final ProductNewPanel productNewPanel;
    private final ProductMainPanel productMainPanel;

    public ProductNewController(ProductNewPanel productNewPanel, ProductMainPanel productMainPanel) {
        this.productNewPanel = productNewPanel;
        this.productMainPanel = productMainPanel;
        ProductFormButtonsPanelController productFormButtonsPanelController = new ProductFormButtonsPanelController();
    }

    private class ProductFormButtonsPanelController {

        public ProductFormButtonsPanelController() {
            productNewPanel.addSaveProductBtnActionListener(new FormSaveButtonsActionListener(0));
            productNewPanel.addSaveAndNewProductBtnActionListener(new FormSaveButtonsActionListener(1));
            productNewPanel.addSaveAndCloseProductBtnActionListener(new FormSaveButtonsActionListener(2));
            productNewPanel.addCloseProductBtnActionListener(new FormCloseButtonActionListener());
        }

        private class FormSaveButtonsActionListener implements ActionListener {
