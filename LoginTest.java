package account.creation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    Login login = new Login();

    // USERNAME TESTS
    @Test
    void testUsernameCorrect() {
        String result = login.checkUsername("ab_c");
        assertEquals("Username successfully captured.", result);
    }

    @Test
    void testUsernameTooLong() {
        String result = login.checkUsername("abcdef");
        assertEquals("Username is not correctly formatted.", result);
    }

    @Test
    void testUsernameNoUnderscore() {
        String result = login.checkUsername("abcde");
        assertEquals("Username is not correctly formatted.", result);
    }

    @Test
    void testUsernameEmpty() {
        String result = login.checkUsername("");
        assertEquals("Username is not correctly formatted.", result);
    }
}