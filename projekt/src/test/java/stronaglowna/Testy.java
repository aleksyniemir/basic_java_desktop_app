package stronaglowna;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class Testy{


    @Test
    public void testValidateInput1() {
        UserDatabase database = new UserDatabase("users.txt");
        assertEquals("correct", database.validateInput("email@email.com", "Haslo123#!", "Antek", "Olszewski", "adres", "123123123"));
    }

    @Test
    public void testValidateInput2() {
        UserDatabase database = new UserDatabase("users.txt");
        assertEquals("zle imie", database.validateInput("email@email.com", "Haslo123#!", "An tek", "Olszewski", "adres", "123123123"));
    }

    @Test
    public void testValidateInput3() {
        UserDatabase database = new UserDatabase("users.txt");
        assertEquals("zly email", database.validateInput("emailemail.com", "Haslo123#!", "Antek", "Olszewski", "adres", "123123123"));
    }

    @Test
    public void testValidateInput4() {
        UserDatabase database = new UserDatabase("users.txt");
        assertEquals("zle haslo", database.validateInput("email@email.com", "haslo123!", "Antek", "Olszewski", "adres", "123123123"));
    }

    @Test
    public void testValidateInput5() {
        UserDatabase database = new UserDatabase("users.txt");
        assertEquals("juz istnieje konto z tym emailem", database.validateInput("mail@mmm.pl", "Haslo123#!", "Antek", "Olszewski", "adres", "123123123"));
    }

    @Test
    public void testValidateInput6() {
        UserDatabase database = new UserDatabase("users.txt");
        assertEquals("zly numer", database.validateInput("email@email.com", "Haslo123#!", "Antek", "Olszewski", "adres", "1231231233"));
    }

    @Test
    public void testLogin1() {
        assertEquals("correct", User.login("antek@antek.com","Haslo123!")); }

    @Test
    public void testLogin2() {
        assertEquals("incorrect", User.login("zlyemail@antek.com","Haslo123!"));
    }

    @Test
    public void testLogin3() {
        assertEquals("incorrect", User.login("antek@antek.com","zlehaslo"));
    }

    @Test
    public void testCheckPassword1() {
        UserDatabase userDatabase = new UserDatabase("users.txt");
        assertTrue(userDatabase.checkPassword("Haslo123#!"));
    }

    @Test
    public void testCheckPassword2() {
        UserDatabase userDatabase = new UserDatabase("users.txt");
        assertFalse(userDatabase.checkPassword("haslo"));
    }

    @Test
    public void testCheckPassword3() {
        UserDatabase userDatabase = new UserDatabase("users.txt");
        assertFalse(userDatabase.checkPassword("ZaDlugieHaslo123123!!12323232"));
    }

    @Test
    public void testCheckPassword4() {
        UserDatabase userDatabase = new UserDatabase("users.txt");
        assertFalse(userDatabase.checkPassword("Haslo123"));
    }
}

