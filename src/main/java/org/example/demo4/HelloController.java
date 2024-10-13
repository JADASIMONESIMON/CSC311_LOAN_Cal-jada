package org.example.demo4;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class HelloController {

    @FXML
    private Button Buttoncal;

    @FXML
    private TextField amount;

    @FXML
    private AnchorPane calculate;

    @FXML
    private TextField monthPay;

    @FXML
    private TextField rate;

    @FXML
    private TextField sumPay;

    @FXML
    private TextField years;


    @FXML
    void loanCalculate(ActionEvent event) {

        double loanAmount = Double.parseDouble(amount.getText());
        double annualRate = Double.parseDouble(rate.getText());
        int numberOfYears = Integer.parseInt(years.getText());

        double monthlyRate = annualRate/1200;

        double monthlyPayment= loanAmount * monthlyRate /
                (1 - (1 / Math.pow(1 + monthlyRate, numberOfYears * 12)));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        // Display the results in the appropriate text fields
        monthPay.setText(String.format("%.2f", monthlyPayment));
        sumPay.setText(String.format("%.2f", totalPayment));


    }

}
