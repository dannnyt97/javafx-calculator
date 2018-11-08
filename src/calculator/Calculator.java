/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 *
 * @author dtwns
 */
public class Calculator extends Application implements EventHandler<ActionEvent> {

    Button[] numpadButtons = new Button[10];
    Button[] operatorButtons = new Button[6];
    String[] numButtonNames = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    String[] operatorButtonNames = {"+", "-", "x", "/", "=", "C"};
    TextField label;
    String input = "";
    String sum = "";
    Double num1 = 0.0;
    Double num2 = 0.0;
    char operator = ' ';
    int numOperators = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gPane = new GridPane();
        BorderPane bPane = new BorderPane();
        
        
        
        label = new TextField();
        primaryStage.setTitle("Calculator");

        for (int i = 0; i < numpadButtons.length; i++) {
            numpadButtons[i] = new Button(numButtonNames[i]); //create new button objects and give them their text
            numpadButtons[i].setOnAction(this);
            gPane.setVgrow(numpadButtons[i], Priority.ALWAYS);
            gPane.setHgrow(numpadButtons[i], Priority.ALWAYS);
            numpadButtons[i].setMaxWidth(Double.MAX_VALUE);
            numpadButtons[i].setMaxHeight(Double.MAX_VALUE);
            
            
        }

        for (int i = 0; i < operatorButtons.length; i++) {
            operatorButtons[i] = new Button(operatorButtonNames[i]);
            operatorButtons[i].setOnAction(this);
            gPane.setVgrow(operatorButtons[i], Priority.ALWAYS);
            gPane.setHgrow(operatorButtons[i], Priority.ALWAYS);
            operatorButtons[i].setMaxWidth(Double.MAX_VALUE);
            operatorButtons[i].setMaxHeight(Double.MAX_VALUE);
        }
        

        gPane.add(numpadButtons[6], 1, 3);
        gPane.add(numpadButtons[3], 1, 4);
        gPane.add(numpadButtons[0], 1, 5);
        gPane.add(operatorButtons[5], 1, 6);
        gPane.add(numpadButtons[7], 2, 3);
        gPane.add(numpadButtons[4], 2, 4);
        gPane.add(numpadButtons[1], 2, 5);
        gPane.add(numpadButtons[9], 2, 6);
        gPane.add(numpadButtons[8], 3, 3);
        gPane.add(numpadButtons[5], 3, 4);
        gPane.add(numpadButtons[2], 3, 5);
        gPane.add(operatorButtons[4], 3, 6);
        gPane.add(operatorButtons[0], 4, 3);
        gPane.add(operatorButtons[1], 4, 4);
        gPane.add(operatorButtons[2], 4, 5);
        gPane.add(operatorButtons[3], 4, 6);
        gPane.setVgap(4);
        gPane.setHgap(4);
        
        
        
        
        
        label.setEditable(false);
        //label.setAlignment(Pos.CENTER_LEFT);

        bPane.setTop(label);
        gPane.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        bPane.setCenter(gPane);

        Scene scene = new Scene(bPane, 300, 400);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void handle(ActionEvent event) {
        try {
            if (event.getSource() == numpadButtons[0]) {
                input += "1";
                label.setText(input);
            } else if (event.getSource() == numpadButtons[1]) {
                input += "2";
                label.setText(input);
            } else if (event.getSource() == numpadButtons[2]) {
                input += "3";
                label.setText(input);
            } else if (event.getSource() == numpadButtons[3]) {
                input += "4";
                label.setText(input);
            } else if (event.getSource() == numpadButtons[4]) {
                input += "5";
                label.setText(input);
            } else if (event.getSource() == numpadButtons[5]) {
                input += "6";
                label.setText(input);
            } else if (event.getSource() == numpadButtons[6]) {
                input += "7";
                label.setText(input);
            } else if (event.getSource() == numpadButtons[7]) {
                input += "8";
                label.setText(input);
            } else if (event.getSource() == numpadButtons[8]) {
                input += "9";
                label.setText(input);
            } else if (event.getSource() == numpadButtons[9]) {
                input += "0";
                label.setText(input);
            } else if (event.getSource() == operatorButtons[4]) {
                if (numOperators == 1) {
                    parseInput();
                    calculate();
                    label.setText(sum);
                    clearNums();
                    sum = "";
                } else if (numOperators == 0) {
                    throw new ArithmeticException("No operator detected");
                } else {
                    throw new ArithmeticException("Unknown error");
                }

            } else if (event.getSource() == operatorButtons[0]) {
                input += "+";
                ++numOperators;
                operator = '+';
                label.setText(input);
            } else if (event.getSource() == operatorButtons[1]) {
                input += "-";
                ++numOperators;
                operator = '-';
                label.setText(input);
            } else if (event.getSource() == operatorButtons[2]) {
                input += "x";
                ++numOperators;
                operator = 'x';
                label.setText(input);
            } else if (event.getSource() == operatorButtons[3]) {
                input += "/";
                ++numOperators;
                operator = '/';
                label.setText(input);
            } else if (event.getSource() == operatorButtons[5]) {
                clearNums();
                clearScreen();
                sum = "";
            } //else if (event.getSource() == backSpaceButton) {
            //input = input.substring(0, input.length() - 1);
            //label.setText(input);

            //}
        } catch (ArithmeticException e) {
            clearNums();
            clearScreen();
            sum = "";
            label.setText(e.getMessage());
        }
    }

    public void calculate() throws ArithmeticException {
        if (operator == 47) {//if operator is a forward slash
            if (num2 != 0) {
                sum = Double.toString(num1 / num2);
            } else {
                throw new ArithmeticException("Arithmetic error");
            }
        } else if (operator == 61) { // -
            sum = Double.toString(num1 - num2);
        } else if (operator == 43) { //+
            sum = Double.toString(num1 + num2);
        } else if (operator == 120) {
            sum = Double.toString(num1 * num2);
        }

    }

    public void parseInput() {
        int indexOfOperator = input.indexOf(operator);
        int inputLength = input.length();
        num1 = Double.parseDouble(input.substring(0, indexOfOperator));
        num2 = Double.parseDouble(input.substring(indexOfOperator + 1, inputLength));

    }

    public void clearNums() {
        num1 = 0.0;
        num2 = 0.0;
        input = "";
        //sum = "";
        operator = ' ';
        numOperators = 0;
        //label.setText("");
    }

    public void clearScreen() {
        label.setText("");
    }

}
