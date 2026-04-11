package account.creation;

public class Login {
    
    // Check username
    public String checkUsername(String username) {
        if (username.contains("_") && username.length() <= 5) {
            return "Username successfully captured.";
        } else {
            return "Username is not correctly formatted.";
        }
    }

    // Check password
    public String checkPasswordComplexity(String password) {
        if (password.length() >= 8 &&
            password.matches(".*[A-Z].*") &&
            password.matches(".*[0-9].*") &&
            password.matches(".*[@#$%^&+=!].*")) {

            return "Password successfully captured.";
        } else {
            return "Password is not correctly formatted.";
        }
    }

    // Check cellphone number
    public String checkCellPhoneNumber(String number) {
        if (number.matches("^\\+27\\d{9}$")) {
            return "Cellphone number successfully captured.";
        } else {
            return "Cellphone number is incorrect.";
        }
    }

    // Register user (returns true/false)
    public boolean registerUser(String username, String password, String number) {

        boolean usernameOk = checkUsername(username).equals("Username successfully captured.");
        boolean passwordOk = checkPasswordComplexity(password).equals("Password successfully captured.");
        boolean phoneOk = checkCellPhoneNumber(number).equals("Cellphone number successfully captured.");

        return usernameOk && passwordOk && phoneOk;
    }

    // Login user (returns true/false)
    public boolean loginUser(String username, String password) {

        // Simple login check (demo)
        if (username.equals("ab_c") && password.equals("Pass@123")) {
            return true;
        } else {
            return false;
        }
    }
}