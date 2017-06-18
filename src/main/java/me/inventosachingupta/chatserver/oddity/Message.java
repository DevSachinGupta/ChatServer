package me.inventosachingupta.chatserver.oddity;

import java.util.Date;

/**
 * Created by Sachin Gupta on 26-12-2016.
 */
public class Message {
    private String messageId;
    private String source;
    private String destination;
    private Object message;
    private Date dt;

    public Message() {
    }

    public Message(String messageId, String source, String destination, Object message, Date dt) {
        this.messageId = messageId;
        this.source = source;
        this.destination = destination;
        this.message = message;
        this.dt = dt;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId='" + messageId + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", message=" + message +
                ", dt=" + dt +
                '}';
    }
}
