package calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author dantown
 */
public class Calculator extends Application implements EventHandler<ActionEvent>{
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
    
    public static void main(String[] args) {
        launch(args);
    }
    
     @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Title of Window");
        numberOneButton = new Button();
        numberOneButton.setText("1");
        
        numberTwoButton = new Button();
        numberTwoButton.setText("2");
        
        numberThreeButton = new Button();
        numberThreeButton.setText("3");
        
        numberFourButton = new Button();
        numberFourButton.setText("4");
        
        numberFiveButton = new Button();
        numberFiveButton.setText("5");
        
        numberSixButton = new Button();
        numberSixButton.setText("6");
        
        numberSevenButton = new Button();
        numberSevenButton.setText("7");
        
        numberEightButton = new Button();
        numberEightButton.setText("8");
        
        numberNineButton = new Button();
        numberNineButton.setText("9");
        
        numberZeroButton = new Button();
        numberZeroButton.setText("0");
        

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

        StackPane layout = new StackPane();
        layout.getChildren().add(numberOneButton);
        layout.getChildren().add(numberTwoButton);
        layout.getChildren().add(numberThreeButton);
        layout.getChildren().add(numberFourButton);
        layout.getChildren().add(numberFiveButton);       
        layout.getChildren().add(numberSixButton); 
        layout.getChildren().add(numberSevenButton);
        layout.getChildren().add(numberEightButton);
        layout.getChildren().add(numberNineButton);        
        layout.getChildren().add(numberZeroButton);
                
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == numberOneButton) 
            System.out.println("Hey Charlie!");
        if (event.getSource() == numberTwoButton) 
            System.out.println("Hey Charlie!");
        if (event.getSource() == numberThreeButton) 
            System.out.println("Hey Charlie!");
        if (event.getSource() == numberFourButton) 
            System.out.println("Hey Charlie!");
        if (event.getSource() == numberFiveButton) 
            System.out.println("Hey Charlie!");
        if (event.getSource() == numberSixButton) 
            System.out.println("Hey Charlie!");
        if (event.getSource() == numberSevenButton) 
            System.out.println("Hey Charlie!");
        if (event.getSource() == numberEightButton) 
            System.out.println("Hey Charlie!");
        if (event.getSource() == numberNineButton) 
            System.out.println("Hey Charlie!");
        if (event.getSource() == numberZeroButton) 
            System.out.println("Hey Charlie!");
        
    }
    
}
