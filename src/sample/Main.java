package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

public class Main extends Application implements EventHandler {
    Button button;
    TextField input;
    Text output;


    @Override
    public void start(Stage primaryStage) throws Exception{
        //Look at Vbox for refactoring
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        VBox layout = new VBox();
        primaryStage.setTitle("Padraig's Application From");
        primaryStage.setScene(new Scene(root, 600, 675));

        input = new TextField();
        layout.getChildren().add(input);

        button = new Button();
        button.setText("Submit");
        button.setOnAction(this);
        layout.getChildren().add(button);

        output = new Text();
        layout.getChildren().add(output);

        Scene scene = new Scene(layout, 500, 500);
        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(Event event) {
        output.setText(input.getText());

    }
}
