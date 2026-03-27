
package loginapp;

import java.util.Scanner; 

public class Login{
    
   private String username;
   private String password;
   private String cellphone;
    
    //username
    public boolean checkusername(String username){
        return username.contains("_")&& username.length() <=5;
    }
    
    //password
    public boolean checkpassword(String password){
       boolean capital=false;
       boolean number=false;
       boolean special=false; 
       
               for (char c :password.toCharArray()){
        
            if (Character.isUpperCase(c)){capital=true;
        }
            if(Character.isDigit(c)){number=true;
            }
            if(!Character.isLetterOrDigit(c)){special=true;
            }
        
    }
        return password.length ()>=8 && capital && number && special;}
    
    //cellphonenumber
    public boolean checkcellphonenumber(String cellphone){
        return cellphone.startsWith("+27")&& cellphone.length()<=13; }
    
    //user registration
    
    public String userRegistration(String username, String password, String cellphone){
        
        if(!checkusername(username)){return "useranme must contain an underscore and be no more than 5 characters.";
        }
        
        if(!checkpassword(password)){
            return "password must contain 8 characters, a capital letter, a number and a special character.";
        }
        
        if(!checkcellphonenumber(cellphone)){
            return"Cellphone number must start with +27.";
        }

        this.username = username;
        this.password = password;
        this.cellphone = cellphone;
        
        return"Username successfully captured.User registerd successfully.";}
        
        //Loging user
        public boolean loginUser(String username, String password){
            return this.username.equals(username)&& this.password.equals(password);
        }
        //Return login status
        public String returnLoginStatus(boolean loginStatus){
            
            if(loginStatus){
                return"Login successfull. Welcome!";
            }else{
                return"Login failed. Username or password is incorect.";
            }
        }
            
        }
                
    
    
  