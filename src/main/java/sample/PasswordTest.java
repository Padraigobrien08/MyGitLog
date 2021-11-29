package sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordTest {
    String string  = "krgjwba4325!!";

    @Test
    void alphabetCheck() {
        Assertions.assertTrue(Password.alphabetCheck(string));
    }

    @Test
    void numCheck() {
        Assertions.assertTrue(Password.numCheck(string));
    }

    @Test
    void specCheck() {
        Assertions.assertTrue(Password.specCheck(string));
    }

    @Test
    void emptyCheck() {
        Assertions.assertTrue(Password.emptyCheck(string));
    }

    @Test
    void lengthCheck() {Assertions.assertTrue(Password.lengthCheck(string));}
}