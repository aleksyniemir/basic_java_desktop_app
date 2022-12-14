package stronaglowna;

import static org.junit.Assert.fail;

import org.junit.Test;

public class ChangeAvailabilityTest {
    @Test
    public void changeAvailabilityTest {

        try {
            CarDatabase.changeAvailability(1, "NotAvaible", String "olekniemirkapierogi@gmail.com");
        }
        catch (Exception e){
            fail("An error occurred.");
            e.printStackTrace();
        }
        try {
            CarDatabase.changeAvailability(1, "Avaible", String "olekniemirkapierogi@gmail.com");
        }
        catch (Exception e){
            fail("An error occurred.");
            e.printStackTrace();
        }
        try {
            CarDatabase.changeAvailability(0, "Avaible", String "olekniemirkapierogi@gmail.com");
        }
        catch (Exception e){
            fail("An error occurred.");
            e.printStackTrace();
        }
        try {
            CarDatabase.changeAvailability(0, "NotAvaible", String "olekniemirkapierogi@gmail.com");
        }
        catch (Exception e){
            fail("An error occurred.");
            e.printStackTrace();
        }
    }
}
