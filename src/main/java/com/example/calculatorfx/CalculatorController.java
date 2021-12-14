package com.example.calculatorfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class CalculatorController {

    @FXML
    private Text operationSaved;
    @FXML
    private Label textNumbers;

    private String firstNum = "";
    private String secondNum = "";
    private String operation;

    @FXML
    void butonOne(ActionEvent event) {
        add("1");
    }

    @FXML
    void buttonTwo(ActionEvent event) {
        add("2");
    }

    @FXML
    void buttonThree(ActionEvent event) {
        add("3");
    }

    @FXML
    void buttonFour(ActionEvent event) {
        add("4");
    }

    @FXML
    void buttonFive(ActionEvent event) {
        add("5");
    }

    @FXML
    void buttonSix(ActionEvent event) {
        add("6");
    }

    @FXML
    void buttonSeven(ActionEvent event) {
        add("7");
    }

    @FXML
    void buttonEight(ActionEvent event) {
        add("8");
    }

    @FXML
    void buttonNine(ActionEvent event) {
        add("9");
    }

    @FXML
    void buttonZero(ActionEvent event) {
        if (!secondNum.equals("")) {
            add("0");
        }
    }

    @FXML
    void buttonClear(ActionEvent event) {
        secondNum = "";
        textNumbers.setText("");
        operationSaved.setText("");
    }

    @FXML
    void buttonPlus(ActionEvent event) {
        calculation("+");
    }

    @FXML
    void buttonMinus(ActionEvent event) {
        calculation("-");
    }

    @FXML
    void buttonMulti(ActionEvent event) {
        calculation("*");
    }

    @FXML
    void buttonDivide(ActionEvent event) {
        calculation("/");
    }

    @FXML
    void buttonEquals(ActionEvent event) {
        int first = Integer.parseInt(firstNum);
        int second = Integer.parseInt(secondNum);

        switch (operation) {
            case "+" -> {
                int result = first + second;
                operationSaved.setText(firstNum + " + " + secondNum + " = " + result);
                textNumbers.setText(String.valueOf(result));
            }
            case "-" -> {
                int result = first - second;
                operationSaved.setText(firstNum + " - " + secondNum + " = " + result);
                textNumbers.setText(String.valueOf(result));
            }
            case "/" -> {
                if (second != 0) {
                    double result = first / (double) second;
                    operationSaved.setText(firstNum + " / " + secondNum + " = " + result);
                    textNumbers.setText(String.valueOf(result));
                }
            }
            case "*" -> {
                int result = first * second;
                operationSaved.setText(firstNum + " * " + secondNum + " = " + result);
                textNumbers.setText(String.valueOf(result));
            }
        }
        secondNum = "";
    }

    public void calculation(String operation) {
        this.operation = operation;
        firstNum = secondNum;
        secondNum = "";
        operationSaved.setText(firstNum + " " + operation);
    }

    public void updateText() {
        textNumbers.setText(secondNum);
    }

    public void add(String number) {
        secondNum += number;
        updateText();
    }
}
