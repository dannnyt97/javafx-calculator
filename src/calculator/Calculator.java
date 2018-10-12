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
            if(!checkForMultipeOperators()) {
                parseInput();
                calculate();
                
                label.setText(sum);
            }
            else {
                label.setText("Found more than one operator. Clear and try again.");
            }
            
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
            clearScreen();
            sum = "";
        } else if (event.getSource() == backSpaceButton) {
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
        } catch (ArithmeticException e) {
            e.getMessage();
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
        //label.setText("");
    }
    
    public void clearScreen() {
        label.setText("");
    }

    public boolean checkForMultipeOperators() {
        String currentOperator;

        for (int i = 0; i < listOfOperators.length; ++i) {
            currentOperator = String.valueOf(listOfOperators[i]);

            if (input.contains(currentOperator) && input.indexOf(currentOperator) != input.lastIndexOf(currentOperator)) {
                return true;
            }
        }
        return false;
    }

}
