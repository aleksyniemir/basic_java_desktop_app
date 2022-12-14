package stronaglowna;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class GetUserFromStringTest {

    @Test
    public void testGetUserFromString(){
        String line = "dfjdfj@wp.pl Dm1$rrrr fddfj fdjdfd swibvhbd 555555555";
        try {
            UserDatabase database = new UserDatabase("users.txt");
            User myReturnedObject = database.getUserFromString(line);
            assertNotNull(myReturnedObject);
        }
        catch(Exception e){
            fail("An error occurred.");
            e.printStackTrace();
        }
    }
}