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
    int sum = 0;
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

        gPane.setVgap(5);
        //gPane.setHgap(30);

        Scene scene = new Scene(bPane, 300, 300);

        primaryStage.setScene(scene);
        primaryStage.show();

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
                    label.setText(Integer.toString(sum));
                    clearNums();
                    sum = 0;
                } else if (numOperators == 0) {
                    throw new ArithmeticException("No operator detected");
                }
                else {
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
                sum = 0;
            } //else if (event.getSource() == backSpaceButton) {
            //input = input.substring(0, input.length() - 1);
            //label.setText(input);

            //}
        } catch (ArithmeticException e) {
            clearNums();
            clearScreen();
            sum = 0;
            label.setText(e.getMessage());
        }
    }

    public void calculate() throws ArithmeticException {
        if (operator == 47) {//if operator is a forward slash
            if (num2 != 0) {
                sum = num1 / num2;
            } else {
                throw new ArithmeticException("Arithmetic error");
            }
        } else if (operator == 61) { // -
            sum = num1 - num2;
        } else if (operator == 43) { //+
            sum = num1 + num2;
        } else if (operator == 120) {
            sum = num1 * num2;
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
