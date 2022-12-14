package stronaglowna;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertNotNull;
import java.io.FileNotFoundException;
import org.junit.Test;

public class CarDatabaseTest {
    @Test
    public void carDatabaseTest {

        String filename = "cars.txt"

        try {
            CarDatabase.CarDatabase(filename);
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            assertNotNull(this.cars[0]);
        }
        catch (Exception e){
            fail("An error occurred.");
            e.printStackTrace();
        }
    }
}

