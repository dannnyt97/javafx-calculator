package calculator;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

/**
 *
 * @author dantown
 */
public class Calculator extends Application implements EventHandler<ActionEvent> {

    TextField label;
    Button numberOneButton;
    Button numberTwoButton;
    Button numberThreeButton;
    Button numberFourButton;
    Button numberFiveButton;
    Button numberSixButton;
    Button numberSevenButton;
    Button numberEightButton;
    Button numberNineButton;
    Button numberZeroButton;
    Button plusButton;
    Button minusButton;
    Button divideButton;
    Button multiplyButton;
    Button acButton;
    Button equalsButton;
    Button backSpaceButton;
    char[] listOfOperators = {'x', '+', '-', '/',};

    String input = "";
    String sum = "";
    int num1 = 0;
    int num2 = 0;
    char operator = ' ';
    int numOperators = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");
        numberOneButton = new Button("1");
        numberTwoButton = new Button("2");
        numberThreeButton = new Button("3");
        numberFourButton = new Button("4");
        numberFiveButton = new Button("5");
        numberSixButton = new Button("6");
        numberSevenButton = new Button("7");
        numberEightButton = new Button("8");
        numberNineButton = new Button("9");
        numberZeroButton = new Button("0");
        divideButton = new Button("/");
        acButton = new Button("ac");
        equalsButton = new Button("=");
        plusButton = new Button("+");
        minusButton = new Button("-");
        multiplyButton = new Button("x");
        backSpaceButton = new Button("del");
        label = new TextField("0");

        numberEightButton.setScaleX(1);
        numberSevenButton.setScaleX(1);
        acButton.setScaleX(1);

        //This class will handle the button events
        numberOneButton.setOnAction(this);
        numberTwoButton.setOnAction(this);
        numberThreeButton.setOnAction(this);
        numberFourButton.setOnAction(this);
        numberFiveButton.setOnAction(this);
        numberSixButton.setOnAction(this);
        numberSevenButton.setOnAction(this);
        numberEightButton.setOnAction(this);
        numberNineButton.setOnAction(this);
        numberZeroButton.setOnAction(this);
        minusButton.setOnAction(this);
        multiplyButton.setOnAction(this);
        plusButton.setOnAction(this);
        acButton.setOnAction(this);
        divideButton.setOnAction(this);
        equalsButton.setOnAction(this);
        //backSpaceButton.setOnAction(this);

        GridPane gPane = new GridPane();
        BorderPane bPane = new BorderPane();

        gPane.add(numberSevenButton, 1, 3);
        gPane.add(numberFourButton, 1, 4);
        gPane.add(numberOneButton, 1, 5);
        gPane.add(acButton, 1, 6);
        gPane.add(numberEightButton, 2, 3);
        gPane.add(numberFiveButton, 2, 4);
        gPane.add(numberTwoButton, 2, 5);
        gPane.add(numberZeroButton, 2, 6);
        gPane.add(numberNineButton, 3, 3);
        gPane.add(numberSixButton, 3, 4);
        gPane.add(numberThreeButton, 3, 5);
        gPane.add(equalsButton, 3, 6);
        gPane.add(plusButton, 4, 3);
        gPane.add(minusButton, 4, 4);
        gPane.add(multiplyButton, 4, 5);
        gPane.add(divideButton, 4, 6);

        label.setEditable(false);
        label.setAlignment(Pos.CENTER_LEFT);

        bPane.setTop(label);
        gPane.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        bPane.setCenter(gPane);

        gPane.setVgrow(numberSevenButton, Priority.ALWAYS);
        gPane.setVgrow(numberFourButton, Priority.ALWAYS);
        gPane.setVgrow(numberOneButton, Priority.ALWAYS);
        gPane.setVgrow(acButton, Priority.ALWAYS);
        gPane.setVgrow(numberEightButton, Priority.ALWAYS);
        gPane.setVgrow(numberFiveButton, Priority.ALWAYS);
        gPane.setVgrow(numberTwoButton, Priority.ALWAYS);
        gPane.setVgrow(numberZeroButton, Priority.ALWAYS);
        gPane.setVgrow(numberNineButton, Priority.ALWAYS);
        gPane.setVgrow(numberSixButton, Priority.ALWAYS);
        gPane.setVgrow(numberThreeButton, Priority.ALWAYS);
        gPane.setVgrow(equalsButton, Priority.ALWAYS);
        gPane.setVgrow(plusButton, Priority.ALWAYS);
        gPane.setVgrow(minusButton, Priority.ALWAYS);
        gPane.setVgrow(multiplyButton, Priority.ALWAYS);
        gPane.setVgrow(divideButton, Priority.ALWAYS);

        gPane.setHgrow(numberSevenButton, Priority.ALWAYS);
        gPane.setHgrow(numberFourButton, Priority.ALWAYS);
        gPane.setHgrow(numberOneButton, Priority.ALWAYS);
        gPane.setHgrow(acButton, Priority.ALWAYS);
        gPane.setHgrow(numberEightButton, Priority.ALWAYS);
        gPane.setHgrow(numberFiveButton, Priority.ALWAYS);
        gPane.setHgrow(numberTwoButton, Priority.ALWAYS);
        gPane.setHgrow(numberZeroButton, Priority.ALWAYS);
        gPane.setHgrow(numberNineButton, Priority.ALWAYS);
        gPane.setHgrow(numberSixButton, Priority.ALWAYS);
        gPane.setHgrow(numberThreeButton, Priority.ALWAYS);
        gPane.setHgrow(equalsButton, Priority.ALWAYS);
        gPane.setHgrow(plusButton, Priority.ALWAYS);
        gPane.setHgrow(minusButton, Priority.ALWAYS);
        gPane.setHgrow(multiplyButton, Priority.ALWAYS);
        gPane.setHgrow(divideButton, Priority.ALWAYS);

        numberOneButton.setMaxWidth(Double.MAX_VALUE);
         numberTwoButton.setMaxWidth(Double.MAX_VALUE);
         numberThreeButton.setMaxWidth(Double.MAX_VALUE);
         numberFourButton.setMaxWidth(Double.MAX_VALUE);
         numberFiveButton.setMaxWidth(Double.MAX_VALUE);
         numberSixButton.setMaxWidth(Double.MAX_VALUE);
         numberSevenButton.setMaxWidth(Double.MAX_VALUE);
         numberEightButton.setMaxWidth(Double.MAX_VALUE);
         numberNineButton.setMaxWidth(Double.MAX_VALUE);
         numberZeroButton.setMaxWidth(Double.MAX_VALUE);
         plusButton.setMaxWidth(Double.MAX_VALUE);
         minusButton.setMaxWidth(Double.MAX_VALUE);
         divideButton.setMaxWidth(Double.MAX_VALUE);
         multiplyButton.setMaxWidth(Double.MAX_VALUE);
         acButton.setMaxWidth(Double.MAX_VALUE);
         equalsButton.setMaxWidth(Double.MAX_VALUE);
         backSpaceButton.setMaxWidth(Double.MAX_VALUE);
         
         numberOneButton.setMaxHeight(Double.MAX_VALUE);
         numberTwoButton.setMaxHeight(Double.MAX_VALUE);
         numberThreeButton.setMaxHeight(Double.MAX_VALUE);
         numberFourButton.setMaxHeight(Double.MAX_VALUE);
         numberFiveButton.setMaxHeight(Double.MAX_VALUE);
         numberSixButton.setMaxHeight(Double.MAX_VALUE);
         numberSevenButton.setMaxHeight(Double.MAX_VALUE);
         numberEightButton.setMaxHeight(Double.MAX_VALUE);
         numberNineButton.setMaxHeight(Double.MAX_VALUE);
         numberZeroButton.setMaxHeight(Double.MAX_VALUE);
         plusButton.setMaxHeight(Double.MAX_VALUE);
         minusButton.setMaxHeight(Double.MAX_VALUE);
         divideButton.setMaxHeight(Double.MAX_VALUE);
         multiplyButton.setMaxHeight(Double.MAX_VALUE);
         acButton.setMaxHeight(Double.MAX_VALUE);
         equalsButton.setMaxHeight(Double.MAX_VALUE);
         backSpaceButton.setMaxHeight(Double.MAX_VALUE);

        //gPane.setVgap(5);
        //gPane.setHgap(30);

        

    }

    @Override
    public void handle(ActionEvent event) throws ArithmeticException {
        try {
            if (event.getSource() == numberOneButton) {
                input += "1";
                label.setText(input);
            } else if (event.getSource() == numberTwoButton) {
                input += "2";
                label.setText(input);
            } else if (event.getSource() == numberThreeButton) {
                input += "3";
                label.setText(input);
            } else if (event.getSource() == numberFourButton) {
                input += "4";
                label.setText(input);
            } else if (event.getSource() == numberFiveButton) {
                input += "5";
                label.setText(input);
            } else if (event.getSource() == numberSixButton) {
                input += "6";
                label.setText(input);
            } else if (event.getSource() == numberSevenButton) {
                input += "7";
                label.setText(input);
            } else if (event.getSource() == numberEightButton) {
                input += "8";
                label.setText(input);
            } else if (event.getSource() == numberNineButton) {
                input += "9";
                label.setText(input);
            } else if (event.getSource() == numberZeroButton) {
                input += "0";
                label.setText(input);
            } else if (event.getSource() == equalsButton) {
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

            } else if (event.getSource() == plusButton) {
                input += "+";
                ++numOperators;
                operator = '+';
                label.setText(input);
            } else if (event.getSource() == minusButton) {
                input += "-";
                ++numOperators;
                operator = '-';
                label.setText(input);
            } else if (event.getSource() == multiplyButton) {
                input += "x";
                ++numOperators;
                operator = 'x';
                label.setText(input);
            } else if (event.getSource() == divideButton) {
                input += "/";
                ++numOperators;
                operator = '/';
                label.setText(input);
            } else if (event.getSource() == acButton) {
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
                sum = Integer.toString(num1 / num2);
            } else {
                throw new ArithmeticException("Arithmetic error");
            }
        } else if (operator == 61) { // -
            sum = Integer.toString(num1 - num2);
        } else if (operator == 43) { //+
            sum = Integer.toString(num1 + num2);
        } else if (operator == 120) {
            sum = Integer.toString(num1 * num2);
        }

    }

    public void parseInput() {
        int indexOfOperator = input.indexOf(operator);
        int inputLength = input.length();
        num1 = Integer.parseInt(input.substring(0, indexOfOperator));
        num2 = Integer.parseInt(input.substring(indexOfOperator + 1, inputLength));

    }

    public void clearNums() {
        num1 = 0;
        num2 = 0;
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
