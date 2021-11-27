package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

public class Main extends Application implements EventHandler {
    Stage window;
    Stage window2;
    Stage ErrorWindow;
    Button loginButton;
    TextField nameInput;
    TextField passInput;
    Text output;
    Text output2;
    Text output3;


    @Override
    public void start(Stage primaryStage) throws Exception{

        window  = primaryStage;
        window.setTitle("Padraigs Application");

        GridPane grid = new GridPane();
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

        //Password Label
        Label passLabel = new Label("Password: ");
        GridPane.setConstraints(passLabel, 0, 1);

        //Password input
        passInput = new TextField();
        passInput.setPromptText("Password");
        GridPane.setConstraints(passInput, 1,1);

        //Submit Button
        loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1,2);
        loginButton.setOnAction(this);

        //Outputs
        output = new Text("");
        GridPane.setConstraints(output, 1,4);
        output2 = new Text("");
        GridPane.setConstraints(output2, 1,5);
        output3 = new Text("");
        GridPane.setConstraints(output3, 1,3);

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton, output, output2, output3);

        Scene scene = new Scene(grid, 400, 200);
        window.setScene(scene);

        window.show();




    }

    @Override
    public void handle(Event event) {
        boolean allGood = true;
        String CheckEmail = nameInput.getText();
        String CheckPassword = passInput.getText();
        if (!Username.emptyCheck(CheckEmail)){ AlertBox.start("Error Message", "You must submit a username"); allGood = false;}
        if (!Username.alphabetCheck(CheckEmail)) { AlertBox.start("Error Message", "Your Email must have a Letter"); allGood = false;}
        if (!Username.atCheck(CheckEmail)){ AlertBox.start("Error Message", "Your Email must have an @ sign"); allGood = false;}
        if (!Username.dotcomCheck(CheckEmail)){ AlertBox.start("Error Message", "Your Email must end with a .com"); allGood = false;}
        if (!Password.emptyCheck(CheckPassword)){ AlertBox.start("Error Message", "You must submit a Password"); allGood = false;}
        if (!Password.alphabetCheck(CheckPassword)){ AlertBox.start("Error Message", "Your Password must contain a Letter"); allGood = false;}
        if (!Password.numCheck(CheckPassword)){ AlertBox.start("Error Message", "Your Password must contain a number"); allGood = false;}
        if (!Password.specCheck(CheckPassword)){ AlertBox.start("Error Message", "Your Password must contain a Special Character"); allGood = false;}
        if (allGood){
            ConfirmationBox.start("Success", "You have entered a valid email and password");

        }






    }
}


