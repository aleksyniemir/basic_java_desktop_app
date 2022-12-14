package stronaglowna;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class AddUserToDatabaseTest {

    @Test
    public void addUserToDatabase() {
        UserDatabase userdatabase = new UserDatabase("users.txt");
        try {
            userdatabase.addUserToDatabase("mail@gmail.com", "Haslo@123", "Jacek", "Kowalski", "ulica", "111222333");
        }
        catch ( Exception e){
            fail("An error occurred.");
            e.printStackTrace();
        }

        assertEquals("juz istnieje konto z tym emailem", userdatabase.addUserToDatabase("mail@gmail.com", "Haslo@123", "Jacek", "Kowalski", "ulica", "111222333"));
    }
}