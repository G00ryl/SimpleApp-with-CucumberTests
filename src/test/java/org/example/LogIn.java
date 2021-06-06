package org.example;

public class LogIn {
    private String currentUser;
    private String currentPassword;
    private String message;
    private boolean isLoggedIn;

    public void setUserinDatabase(String userName, String password){
        this.currentUser = userName;
        this.currentPassword = password;
    }

    public boolean login(String userName, String password){
        if (userName.equals(currentUser) && password.equals(currentPassword)){
            this.message = "Udało się zalogować";
            this.isLoggedIn = true;
        }
        else {
            this.message = "Nie udało się Ci zalogować";
            this.isLoggedIn = false;
        }
        return isLoggedIn;
    }
    public String getMsg(){
        return message;
    }
    public boolean isLoggedIn(){
        return isLoggedIn;
    }
}
