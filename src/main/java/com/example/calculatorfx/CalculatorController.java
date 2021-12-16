package com.example.calculatorfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculatorController {

    private String num1, num2, operator;

    @FXML
    private Label screen;

    @FXML
    void butonOne(ActionEvent event) {
        screen.setText(screen.getText() + "1");
    }

    @FXML
    void buttonTwo(ActionEvent event) {
        screen.setText(screen.getText() + "2");
    }

    @FXML
    void buttonThree(ActionEvent event) {
        screen.setText(screen.getText() + "3");
    }

    @FXML
    void buttonFour(ActionEvent event) {
        screen.setText(screen.getText() + "4");
    }

    @FXML
    void buttonFive(ActionEvent event) {
        screen.setText(screen.getText() + "5");
    }

    @FXML
    void buttonSix(ActionEvent event) {
        screen.setText(screen.getText() + "6");
    }

    @FXML
    void buttonSeven(ActionEvent event) {
        screen.setText(screen.getText() + "7");
    }

    @FXML
    void buttonEight(ActionEvent event) {
        screen.setText(screen.getText() + "8");
    }

    @FXML
    void buttonNine(ActionEvent event) {
        screen.setText(screen.getText() + "9");
    }

    @FXML
    void buttonZero(ActionEvent event) {
        screen.setText(screen.getText() + "0");
    }

    @FXML
    void buttonDot(ActionEvent event) {
        screen.setText(screen.getText() + ".");
    }

    @FXML
    void buttonPlus(ActionEvent event) {
        calculo("+");
    }

    @FXML
    void buttonMinus(ActionEvent event) {
        calculo("-");
    }

    @FXML
    void buttonMulti(ActionEvent event) {
        calculo("*");
    }

    @FXML
    void buttonDivide(ActionEvent event) {
        calculo("/");
    }

    @FXML
    void buttonEquals(ActionEvent event) {
        setNum2(screen.getText());
        screen.setText("");
        screen.setText(calcular());
        setNum1(calcular());
    }

    @FXML
    void buttonClear(ActionEvent event) {
        screen.setText("");
        setNum1("");
        setNum2("");
    }

    public double operation(double num1, double num2, String operator) {
        switch (operator) {
            case "+": {
                return num1 + num2;
            }
            case "-": {
                return num1 - num2;
            }
            case "*": {
                return num1 * num2;
            }
            case "/": {
                return num2 == 0 ? 0 : num1 / num2;
            }
            default:
                return 0;
        }
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public void setOperador(String operator) {
        this.operator = operator;
    }

    public String calcular() {
        return String.valueOf(operation(Double.parseDouble(num1), Double.parseDouble(num2), operator));
    }

    private void calculo(String operator) {
        if (!screen.getText().equalsIgnoreCase(""))
            setNum1(screen.getText());
        screen.setText("");
        setOperador(operator);
    }
}
