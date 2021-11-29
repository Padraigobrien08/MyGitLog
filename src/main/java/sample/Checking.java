package sample;

import javafx.event.Event;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * This class acts as the Model in the MVP structure, it takes in the data taken in by the view, and makes a decision based on this data and calls upon the Presenter, the AlertBox or Confirmation box
   depending on the result which acts as the result.
 */

public class Checking{
    public static void handle(Event event) {
        boolean allGood = true;
        TextField CheckEmail = Main.getNameInput();
        //System.out.println(CheckEmail.getText());
        PasswordField CheckPassword = Main.getPassInput();
        //System.out.println(CheckPassword.getText());
        if (!Username.emptyCheck(CheckEmail.getText())){ AlertBox.start("Error Message", "You must submit a username"); allGood = false;}
        if (!Username.alphabetCheck(CheckEmail.getText())) { AlertBox.start("Error Message", "Your Email must have a Letter"); allGood = false;}
        if (!Username.atCheck(CheckEmail.getText())){ AlertBox.start("Error Message", "Your Email must have an @ sign"); allGood = false;}
        if (!Username.dotcomCheck(CheckEmail.getText())){ AlertBox.start("Error Message", "Your Email must end with a .com"); allGood = false;}
        if (!Password.lengthCheck(CheckPassword.getText())){ AlertBox.start("Error Message", "Your Password must be at least 7 characters long"); allGood = false;}
        if (!Password.emptyCheck(CheckPassword.getText())){ AlertBox.start("Error Message", "You must submit a Password"); allGood = false;}
        if (!Password.alphabetCheck(CheckPassword.getText())){ AlertBox.start("Error Message", "Your Password must contain a Letter"); allGood = false;}
        if (!Password.numCheck(CheckPassword.getText())){ AlertBox.start("Error Message", "Your Password must contain a number"); allGood = false;}
        if (!Password.specCheck(CheckPassword.getText())){ AlertBox.start("Error Message", "Your Password must contain a Special Character"); allGood = false;}
        if (allGood){
            ConfirmationBox.start("Success", "You have entered a valid email and password");
        }
    }
}
