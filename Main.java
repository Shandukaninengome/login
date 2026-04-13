package account.creation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Login login = new Login();

        // REGISTRATION
        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter cellphone number (e.g. +27123456789): ");
        String number = input.nextLine();

        boolean registered = login.registerUser(username, password, number);

        if (registered) {
            System.out.println("Registration successfull!");
        } else {
            System.out.println("Registration failed. Please check your details.");
            return;
        }

        // LOGIN
        System.out.println("\n=== Login ===");

        System.out.print("Enter username: ");
        String loginUsername = input.nextLine();

        System.out.print("Enter password: ");
        String loginPassword = input.nextLine();

        boolean loggedIn = login.loginUser(loginUsername, loginPassword);

        if (loggedIn) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Username or password incorrect.");
        }
    }
}
