package me.inventosachingupta.chatserver.oddity;

/**
 * Created by Sachin Gupta on 22-12-2016.
 */
public class LogIn {
    private long ph_no;
    private String userId;
    private String password;
    //private boolean isValidUser;

    public void setUserID(String userId){
        this.userId=userId;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public String getUserID(){
        return userId;
    }
    public String getPassword(){
        return password;
    }

    public boolean isValidUser() {
        //Code to check forthe given id and password  in database
        return false;
    }
}
