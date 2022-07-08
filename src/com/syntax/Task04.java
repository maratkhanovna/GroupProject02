package com.syntax;

public class Task04 {
    /*
    Create Registration Class in which you would have variables as email,
    userName and password that have an access scope only within its own class.
    After creating an object of the class user should be able to call methods and
    in each method separately pass values to set users email, username and password.
    Requirements:
    -Valid email consider to be only yahoo
    -Valid userName and password cannot be empty and should be of length larger than 6 characters.
    Also, valid password cannot contain userName.
     */
    public static void main(String[] args) {
        Registration myRegistration = new Registration();
        myRegistration.setEmail("gaukhar@yahoo.com");
        myRegistration.setUsername("Gaukhar");
        myRegistration.setPassword("Pass123");
    }
}
class Registration{
    private String email;
    private String userName;
    private String password;
    public void setEmail(String email){
        if(!email.contains("yahoo")){
            this.email = email;
            System.out.println("Valid email consider to be only yahoo");
        }else {
            System.out.println("Email accepted");
        }
    }
    public void setUsername(String userName){
        if(userName.isEmpty() && userName.length()<6){
            System.out.println("User names cannot be empty and should be of length larger than 6 characters");
            this.userName=userName;
        }else {
            System.out.println("Username accepted");
        }
    }
    public void setPassword(String password){
        if(password.isEmpty() && password.length()<6 && password.contains(userName)){
            System.out.println("Valid password cannot be empty, cannot contain userName and should be of length larger than 6 characters");
            this.password = password;
        }else {
            System.out.println("Password accepted");
        }
    }
}
