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

    String input = "";
    int sum = 0;
    int temp1 = 0;
    int temp2 = 0;
    char lastOperator = ' ';

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

        layout.add(label, 0, 0);
        layout.setVgap(10);
        layout.setHgap(10);

        Scene scene = new Scene(layout, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        do {
                if (event.getSource() == numberOneButton) {
                    input += "1";
                }
                if (event.getSource() == numberTwoButton) {
                    input += "2";
                }
                if (event.getSource() == numberThreeButton) {
                    input += "3";
                }
                if (event.getSource() == numberFourButton) {
                    input += "4";
                }
                if (event.getSource() == numberFiveButton) {
                    input += "5";
                }
                if (event.getSource() == numberSixButton) {
                    input += "6";
                }
                if (event.getSource() == numberSevenButton) {
                    input += "7";
                }
                if (event.getSource() == numberEightButton) {
                    input += "8";
                }
                if (event.getSource() == numberNineButton) {
                    input += "9";
                }
                if (event.getSource() == numberZeroButton) {
                    input += "0";
                }
                if(event.getSource() == plusButton) {
                    input+= "+";
                    lastOperator = '+';
                }
                if(event.getSource() == equalsButton) {
                    lastOperator = '=';
                    //print sum
                }
            
        } while (lastOperator != ' ');
        
        

    }
}
