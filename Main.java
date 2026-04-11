package account.creation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create Login object
        Login login = new Login();

        // Scanner for input
        Scanner input = new Scanner(System.in);

        // ================= REGISTER =================
        System.out.println("=== User Registration ===");

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter cellphone number: ");
        String number = input.nextLine();

        // Register user
        boolean registered = login.registerUser(username, password, number);

        if (registered) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed. Please check your details.");
        }

        // ================= LOGIN =================
        System.out.println("\n=== Login ===");

        System.out.print("Enter username: ");
        String loginUser = input.nextLine();

        System.out.print("Enter password: ");
        String loginPass = input.nextLine();

        boolean loggedIn = login.loginUser(loginUser, loginPass);

        if (loggedIn) {
            System.out.println("Welcome back! Login successful.");
        } else {
            System.out.println("Login failed. Username or password incorrect.");
        }
    }
}


