package stronaglowna;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LoginTest {


    @Test
    public void testLogin1() {
        assertEquals("correct", User.login("olekniemirkapierogi@gmail.com","Haslo@123")); }

    @Test
    public void testLogin2() {
        assertEquals("incorrect", User.login("aaaaaaaaa","Haslo@123"));
    }

    @Test
    public void testLogin3() {
        assertEquals("incorrect", User.login("olekniemirkapierogi@gmail.com","aaaaaaaaaa"));
    }

    @Test
    public void testLogin4() {
        assertEquals("incorrect", User.login("aaaaaaaaaaaaa","aaaaaaaaaa"));
    }
}

