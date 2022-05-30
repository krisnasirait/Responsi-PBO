package productmanager.product.view;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumnModel;
import net.miginfocom.swing.MigLayout;


public class ProductMainPanel extends JPanel {

    private final CardLayout cardLayout;

    private JButton createProductBtn;
    private JButton deleteProductBtn;

    private JTable allProductsTable;

    public ProductMainPanel() {
        cardLayout = new CardLayout();
        setLayout(cardLayout);
        add(createMainTablePanel(), "tablePanel");
    }


    private JPanel createMainTablePanel() {
        JPanel mainTablePanel = new JPanel(new MigLayout("wrap", "grow, fill", "[][grow, fill]"));        
        mainTablePanel.add(createControlTablePanel());
        mainTablePanel.add(createTablePanel());        
        return mainTablePanel;
    }

    private JPanel createControlTablePanel() {
        JPanel controlTablePanel = new JPanel(new MigLayout());
        createProductBtn = new JButton("New product");
        controlTablePanel.add(createProductBtn);
        deleteProductBtn = new JButton("Delete");
        deleteProductBtn.setEnabled(false);
        controlTablePanel.add(deleteProductBtn);
        return controlTablePanel;
    }

    private JPanel createTablePanel() {        
        JPanel tablePanel = new JPanel(new MigLayout("", "grow, fill", "grow, fill"));
        AllProductsTableModel allProductsTableModel = new AllProductsTableModel();
        allProductsTable = new JTable(allProductsTableModel);
        TableColumnModel tcm = allProductsTable.getColumnModel();
        tcm.removeColumn(tcm.getColumn(0));
        allProductsTable.setFillsViewportHeight(true);
        JScrollPane tablePane = new JScrollPane(allProductsTable);
        tablePanel.add(tablePane);
        return tablePanel;
    }

    public JButton getCreateProductBtn() {
        return createProductBtn;
    }

    public JButton getDeleteProductBtn() {
        return deleteProductBtn;
    }

    public JTable getAllProductsTable() {
        return allProductsTable;
    }

    public void addCreateProductBtnActionListener(ActionListener al) {
        createProductBtn.addActionListener(al);
    }

    public void addDeleteProductBtnActionListener(ActionListener al) {
        deleteProductBtn.addActionListener(al);
    }

    public void addDeleteBtnEnabler(TableModelListener tm) {
        allProductsTable.getModel().addTableModelListener(tm);
    }

    public void addDoubleClickListenerToAllProductsTable(MouseAdapter ma) {
        allProductsTable.addMouseListener(ma);
    }

    public void addPanelToMainPanel(JPanel panel, String panelKey) {
        add(panel, panelKey);        
    }

    public void changePanel(String panelKey) {
        cardLayout.show(this, panelKey);
    }

}