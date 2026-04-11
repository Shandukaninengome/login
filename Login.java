package account.creation;

public class Login {

    private String storedUsername;
    private String storedPassword;
    private String storedNumber;

    // Check username
    public String checkUsername(String username) {
        if (username.contains("_") && username.length() <= 5) {
            return "Username successfully captured.";
        } else {
            return "Username is not correctly formatted.";
        }
    }

    // Check password
    public boolean checkPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*\\d.*");
    }

    // Check cellphone number
    public boolean checkCellphoneNumber(String number) {
        return number.startsWith("+27") && number.length() == 12;
    }

    // Register user
    public boolean registerUser(String username, String password, String number) {

        if (!checkUsername(username).equals("Username successfully captured.")) {
            return false;
        }

        if (!checkPassword(password)) {
            return false;
        }

        if (!checkCellphoneNumber(number)) {
            return false;
        }

        // Store details
        storedUsername = username;
        storedPassword = password;
        storedNumber = number;

        return true;
    }

    // Login user
    public boolean loginUser(String username, String password) {
        return username.equals(storedUsername) &&
               password.equals(storedPassword);
    }
}