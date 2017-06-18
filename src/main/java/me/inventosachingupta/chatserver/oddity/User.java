package me.inventosachingupta.chatserver.oddity;

/**
 * Created by Sachin Gupta on 26-12-2016.
 */
public class User {
    private String phone_no;//Also acts as primary key
    private String first_name;
    private String middle_name;
    private String last_name;
    private byte[] avtar;
    private String authKey;
    private String status;
    private String email;
    private String password;

    public User() {
    }

    public User(String phone_no, String first_name, String middle_name, String last_name) {
        this.phone_no = phone_no;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getAvtar() {
        return avtar;
    }

    public void setAvtar(byte[] avtar) {
        this.avtar = avtar;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFullName(){
        String str;
        if(middle_name!=null)
            str=first_name+" "+middle_name+" "+last_name;
        else
            str=first_name+" "+last_name;
        return str;
    }
}
