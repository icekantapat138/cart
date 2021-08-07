package ku.cs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ku.cs.model.CartClass;

public class Cart {

    @FXML private Label totalpricewdeliverytohomeLabel;
    @FXML private Label amountpriceLabel;
    @FXML private TextField amountpriceTextfield;

    private CartClass cart;

    @FXML
    public void initialize() {
        cart = new CartClass();
    }

    @FXML
    public void handletestButton(ActionEvent actionEvent){
        String priceStr = amountpriceTextfield.getText();
        double deliveryprice = Double.parseDouble(priceStr);
        cart.addpricedelivery(deliveryprice);
        showpricedeliveryData();
    }

    private void showpricedeliveryData(){
        String deliverypriceNumber = String.format("%.2f", cart.getAdddeliveryprice());
        totalpricewdeliverytohomeLabel.setText(deliverypriceNumber);
    }
}
