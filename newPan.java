package productmanager.product.view;

import java.awt.event.ActionListener;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

public class ProductNewPanel extends JPanel {

    private JTextField productOrderNumberField;
    private JTextField productDescriptionField;
    private JTextField productWidthField;
    private JTextField productDepthField;
    private JTextField productHeightField;
    private JTextField productWeightField;
    private JTextField productPriceField;

    private JButton saveProductBtn;
    private JButton saveAndNewProductBtn;
    private JButton saveAndCloseProductBtn;
    private JButton closeProductBtn;

    public ProductNewPanel() {
        setLayout(new MigLayout("wrap", "grow, fill", ""));
        add(createTitlePanel());
        add(createProductFormPanel());
        add(createProductFormButtonsPanel());
    }

    private JPanel createTitlePanel() {
        JPanel titlePanel = new JPanel(new MigLayout("center"));
        JLabel titleLabel = new JLabel("New product:");        
        titleLabel.setFont(titleLabel.getFont().deriveFont(20f));
        titlePanel.add(titleLabel);
        return titlePanel;
    }

    private JPanel createProductFormPanel() {
        JPanel productFormPanel = new JPanel(new MigLayout("wrap 2", "[30%][grow, fill]", ""));
        productFormPanel.add(new JLabel("Order number:"));
        productOrderNumberField = new JTextField();
        productFormPanel.add(productOrderNumberField);
        productFormPanel.add(new JLabel("Description:"));
        productDescriptionField = new JTextField();
        productFormPanel.add(productDescriptionField);
        productFormPanel.add(new JLabel("Width:"));
        productWidthField = new JTextField();
        productFormPanel.add(productWidthField);
        productFormPanel.add(new JLabel("Depth:"));
        productDepthField = new JTextField();
        productFormPanel.add(productDepthField);
        productFormPanel.add(new JLabel("Height:"));
        productHeightField = new JTextField();
        productFormPanel.add(productHeightField);
        productFormPanel.add(new JLabel("Weight:"));
        productWeightField = new JTextField();
        productFormPanel.add(productWeightField);
        productFormPanel.add(new JLabel("Price:"));
        productPriceField = new JTextField();
        productFormPanel.add(productPriceField);
        return productFormPanel;
    }

    private JPanel createProductFormButtonsPanel() {
        JPanel productFormButtonsPanel = new JPanel(new MigLayout("center"));
        saveProductBtn = new JButton("Save");
        productFormButtonsPanel.add(saveProductBtn);
        saveAndNewProductBtn = new JButton("Save and new");
        productFormButtonsPanel.add(saveAndNewProductBtn);
        saveAndCloseProductBtn = new JButton("Save and close");
        productFormButtonsPanel.add(saveAndCloseProductBtn);
        closeProductBtn = new JButton("Close");
        productFormButtonsPanel.add(closeProductBtn);
        return productFormButtonsPanel;
    }

    public String getProductOrderNumberFieldText() {
        return productOrderNumberField.getText();
    }

    public String getProductDescriptionFieldText() {
        return productDescriptionField.getText();
    }

    public String getProductWidthFieldText() {
        return productWidthField.getText();
    }

    public String getProductDepthFieldText() {
        return productDepthField.getText();
    }

    public String getProductHeightFieldText() {
        return productHeightField.getText();
    }

    public String getProductWeightFieldText() {
        return productWeightField.getText();
    }

    public String getProductPriceFieldText() {
        return productPriceField.getText();
    }

    public void addSaveProductBtnActionListener(ActionListener al) {
        saveProductBtn.addActionListener(al);
    }

    public void addSaveAndNewProductBtnActionListener(ActionListener al) {
        saveAndNewProductBtn.addActionListener(al);
    }

    public void addSaveAndCloseProductBtnActionListener(ActionListener al) {
        saveAndCloseProductBtn.addActionListener(al);
    }

    public void addCloseProductBtnActionListener(ActionListener al) {
        closeProductBtn.addActionListener(al);
    }
