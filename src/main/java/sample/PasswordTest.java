package sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}