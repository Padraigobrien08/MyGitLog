package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;

public class Controller {
    @FXML
    private Label myLabel; //Top Label
    @FXML
    private TextField myTextField; // Whats entered in the text box
    @FXML
    private Button button;

    int age;

    public void submit(ActionEvent event){
        //Use a try block in a later refactoring
        age = Integer.parseInt(myTextField.getText());
        System.out.println(age);

    }

}
