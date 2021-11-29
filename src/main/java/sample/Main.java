package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * This class acts as the main view for the GUI
 */

public class Main extends Application {

    Stage window;
    Button loginButton;
    static TextField nameInput;
    static PasswordField passInput;
    CheckBox checkbox;
    Text label;
    GridPane grid;


    @Override
    public void start(Stage primaryStage){

        window  = primaryStage;
        window.setTitle("Padraig's Application");

        grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        //Name Label
        Label nameLabel = new Label("Email Address: ");
        GridPane.setConstraints(nameLabel, 0, 0);

        //Name Input
        nameInput = new TextField();
        nameInput.setPromptText("Email Address");
        GridPane.setConstraints(nameInput, 1, 0);

        //Checkbox
        checkbox = new CheckBox("Show Password");
        //checkbox.setSelected(true);
        GridPane.setConstraints(checkbox, 2, 1);
        checkbox.setOnAction(this::change);

        //Password Label
        Label passLabel = new Label("Password: ");
        GridPane.setConstraints(passLabel, 0, 1);

        //Password input
        passInput = new PasswordField();
        passInput.setPromptText("Password");
        GridPane.setConstraints(passInput, 1, 1);

        label = new Text();
        label.textProperty().bindBidirectional(passInput.textProperty());
        GridPane.setConstraints(label, 1,2);

        //Submit Button
        loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1,3);
        loginButton.setOnAction(Checking::handle);


        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton, checkbox);

        Scene scene = new Scene(grid, 400, 200);
        window.setScene(scene);

        window.show();
    }

    public void change(ActionEvent event) {
        if (checkbox.isSelected()){
            grid.getChildren().add(label);
        } else {
            grid.getChildren().remove(label);
        }
    }

    public static PasswordField getPassInput() {
        return passInput;
    }


    public static TextField getNameInput() {
        return nameInput;
    }

}


