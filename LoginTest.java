package account.creation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    void testUsernameCorrect() {
        Login login = new Login();

        String result = login.checkUsername("ab_c");

        assertEquals("Username successfully captured.", result);
    }

    @Test
    void testUsernameIncorrect() {
        Login login = new Login();

        String result = login.checkUsername("abcdef");

        assertEquals("Username is not correctly formatted.", result);
    }

    @Test
    void testPasswordCorrect() {
        Login login = new Login();

        String result = login.checkPasswordComplexity("Pass@123");

        assertEquals("Password successfully captured.", result);
    }

    @Test
    void testPasswordIncorrect() {
        Login login = new Login();

        String result = login.checkPasswordComplexity("pass");

        assertEquals("Password is not correctly formatted.", result);
    }

    @Test
    void testCellphoneCorrect() {
        Login login = new Login();

        String result = login.checkCellPhoneNumber("+27831234567");

        assertEquals("Cellphone number successfully captured.", result);
    }

    @Test
    void testCellphoneIncorrect() {
        Login login = new Login();

        String result = login.checkCellPhoneNumber("0831234567");

        assertEquals("Cellphone number is incorrect.", result);
    }

    @Test
    void testRegisterUser() {
        Login login = new Login();

        boolean result = login.registerUser("ab_c", "Pass@123", "+27831234567");

        assertTrue(result);
    }

    @Test
    void testLoginUser() {
        Login login = new Login();

        boolean result = login.loginUser("ab_c", "Pass@123");

        assertTrue(result);
    }
}