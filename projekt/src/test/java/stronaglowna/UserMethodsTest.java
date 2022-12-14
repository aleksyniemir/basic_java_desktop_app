/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stronaglowna;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 *
 * @author konra
 */
public class UserMethodsTest {
    
    private UserDatabase bd;
    
    public UserMethodsTest() {
        
    }

    /**
     * Test of addUserToDatabase method, of class UserDatabase.
     */
    @Test
    public void testAddUserToDatabase() {
    }

    /**
     * Test of checkName method, of class UserDatabase.
     */
    @Test
    public void testCheckName() {
        bd = new UserDatabase("users.txt");
        assertTrue(bd.checkName("Romek"));
        assertFalse(bd.checkName("Ro mek"));
    }

    /**
     * Test of checkPhone method, of class UserDatabase.
     */
    @Test
    public void testCheckPhone() {
        bd = new UserDatabase("users.txt");
        assertTrue(bd.checkPhone("700700700"));
        assertFalse(bd.checkPhone("12345678"));
    }

    /**
     * Test of IsEmailAlreadyRegistered method, of class UserDatabase.
     */
    @Test
    public void testIsEmailAlreadyRegistered() {
        bd = new UserDatabase("users.txt");
        int expected = -1;
        int result = bd.IsEmailAlreadyRegistered("banan@wp.pl");
        assertEquals(expected, result);
    }
    
}
