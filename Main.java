
package loginapp;

import loginapp.Login;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args){
        
         Scanner input=new Scanner(System.in);
        Login user=new Login();
        
        System.out.println("Register your account");
        
        System.out.println("please enter your username");
        String username=input.nextLine();
        
        System.out.println("please enter your password");
        String password=input.nextLine();
        
        System.out.println("please enter your SA cellphone number");
        String cellphone=input.nextLine();
        
        String results = user.userRegistration( username, password,cellphone);
        System.out.println(results);
        
        System.out.println("Login");
         
        System.out.println("please enter your username");
        String loginUser=input.nextLine();
        
        System.out.println("please enter your password");
        String loginPass=input.nextLine();
        
        boolean login= user.loginUser(loginUser,loginPass);
        
        
        
        System.out.println(user.returnLoginStatus(login));
    }
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    


    }
   
