
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

public class FirstCalc extends Application implements EventHandler<ActionEvent> {

    Button[] numButtons = new Button[10];
    Button[] operatorButtons = new Button[5];
    String[] numButtonNames = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    String[] operatorButtonNames = {"+", "-", "x", "/", "=", "C"};

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gPane = new GridPane();
        BorderPane bPane = new BorderPane();
        
        primaryStage.setTitle("Calculator");
        
        for (Button button : operatorButtons) {
            for (String name : operatorButtonNames) {
                button = new Button(name);
                button.setOnAction(this);
            }
        }

        for (Button button : numButtons) {
            for (String name : numButtonNames) {
                button = new Button(name);
                button.setOnAction(this);
            }
        }

    }

    @Override
    public void handle(ActionEvent event) {

    }
}
