package calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author dantown
 */
public class Calculator extends Application implements EventHandler<ActionEvent> {

    Label label;
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

    String input = "";
    String sum = "";
    int num1 = 0;
    int num2 = 0;
    char operator = ' ';

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
        label = new Label();

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
        backSpaceButton.setOnAction(this);
        
        GridPane layout = new GridPane();

        layout.add(numberSevenButton, 0, 1);
        layout.add(numberFourButton, 0, 2);
        layout.add(numberOneButton, 0, 3);
        layout.add(acButton, 0, 4);
        layout.add(numberEightButton, 1, 1);
        layout.add(numberFiveButton, 1, 2);
        layout.add(numberTwoButton, 1, 3);
        layout.add(numberZeroButton, 1, 4);
        layout.add(numberNineButton, 2, 1);
        layout.add(numberSixButton, 2, 2);
        layout.add(numberThreeButton, 2, 3);
        layout.add(equalsButton, 2, 4);
        layout.add(plusButton, 3, 1);
        layout.add(minusButton, 3, 2);
        layout.add(multiplyButton, 3, 3);
        layout.add(divideButton, 3, 4);
        layout.add(backSpaceButton, 4, 1);

        layout.add(label, 0, 0);
        layout.setVgap(10);
        layout.setHgap(10);

        Scene scene = new Scene(layout, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
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
            parseInput();
            calculate();
            label.setText(sum);
        } else if (event.getSource() == plusButton) {
            input += "+";
            operator = '+';
            label.setText(input);
        } else if (event.getSource() == minusButton) {
            input += "-";
            operator = '-';
            label.setText(input);
        } else if (event.getSource() == multiplyButton) {
            input += "x";
            operator = 'x';
            label.setText(input);
        } else if (event.getSource() == divideButton) {
            input += "/";
            operator = '/';
            label.setText(input);
        } else if (event.getSource() == acButton) {
            clearNums();
        } else if(event.getSource() == backSpaceButton) {
            input = input.substring(0, input.length() - 1);
            label.setText(input);
            
        }
    }

//    public void addNumButtonsPushedToInput(Button nums) {
//        nums.
//    } {
//    
//    }
    public void calculate() throws ArithmeticException {
        try {
            if (operator == 47) {//if operator is a forward slash
                sum = Integer.toString(num1 / num2);
            } else if (operator == 61) { // -
                sum = Integer.toString(num1 - num2);
            } else if (operator == 43) { //+
                sum = Integer.toString(num1 + num2);
            } else if (operator == 120) {
                sum = Integer.toString(num1 * num2);
            }
        } 
        catch  (ArithmeticException e) {e.getMessage();}
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
        sum = "";
        operator = ' ';
        label.setText("");
    }

//    public String getInput(ActionEvent event) {
//        if (event.getSource() == numberOneButton) {
//            System.out.println("Hello");
//            return "1";
//        } else if (event.getSource() == numberTwoButton) {
//            return "2";
//        } else if (event.getSource() == numberThreeButton) {
//            return "3";
//        } else if (event.getSource() == numberFourButton) {
//            return "4";
//        } else if (event.getSource() == numberFiveButton) {
//            return "5";
//        } else if (event.getSource() == numberSixButton) {
//            return "6";
//        } else if (event.getSource() == numberSevenButton) {
//            return "7";
//        } else if (event.getSource() == numberEightButton) {
//            return "8";
//        } else if (event.getSource() == numberNineButton) {
//            return "9";
//        } else if (event.getSource() == numberZeroButton) {
//            return "0";
//        } else if (event.getSource() == equalsButton) {
//            lastOperator = '=';
//            return "=";
//        }
//        else if(event.getSource() == plusButton) {
//            lastOperator = '+';
//            return "+";
//        }
//
//        return "";
//
//    }
}
