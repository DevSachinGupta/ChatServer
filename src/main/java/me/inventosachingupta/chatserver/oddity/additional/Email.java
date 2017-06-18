package me.sachingupta.oddity.additional;

/**
 * Created by Sachin Gupta on 28-12-2016.
 */
public class Email {
    private String emailID;
    private String cc;
    private String bcc;
    private String subject;
    private String message;

    public String getBcc() {
        return bcc;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getCc() {
        return cc;
    }

    public String getMessage() {
        return message;
    }

    public String getSubject() {
        return subject;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean sendMail(){

        return false;
    }
}
