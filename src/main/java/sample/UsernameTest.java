package sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsernameTest {
    String string = "GavinJames@gmail.com";

    @Test
    void alphabetCheck() {
        Assertions.assertTrue(Username.alphabetCheck(string));
    }

    @Test
    void atCheck() {
        Assertions.assertTrue(Username.atCheck(string));
    }

    @Test
    void dotcomCheck() {
        Assertions.assertTrue(Username.dotcomCheck(string));
    }

    @Test
    void emptyCheck() {
        Assertions.assertTrue(Username.emptyCheck(string));
    }
}