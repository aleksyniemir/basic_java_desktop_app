package stronaglowna;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class UserDatabaseTest {
    
    @Test
    public void testcheckIfEmail() {
        UserDatabase userDatabase = new UserDatabase("users.txt");
        assertTrue(userDatabase.checkIfEmail("mariusz@wp.pl"));
        assertFalse(userDatabase.checkIfEmail("mariuszwp.pl"));
    }

    @Test
    public void testcheckPassword() {
        UserDatabase userDatabase = new UserDatabase("users.txt");
        assertTrue(userDatabase.checkPassword("Qwerty1234$"));
        assertFalse(userDatabase.checkPassword("mariusz123"));
    }

    @Test
    public void testcheckName() {
        UserDatabase userDatabase = new UserDatabase("users.txt");
        assertTrue(userDatabase.checkName("mariusz"));
        assertFalse(userDatabase.checkName("Radomil Spytak"));
    }


}