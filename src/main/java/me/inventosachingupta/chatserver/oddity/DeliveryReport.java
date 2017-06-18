package me.inventosachingupta.chatserver.oddity;

/**
 * Created by Sachin Gupta on 26-12-2016.
 */
public class DeliveryReport {
    private String messageId;
    private int dreport;

    public void setMessageID(String messageId){
        this.messageId=messageId;
    }
    public void setDreport(int dreport){
        this.dreport=dreport;
    }

    public String getMessageID(){
        return messageId;
    }
    public int getDreport(){
        return  dreport;
    }
}
