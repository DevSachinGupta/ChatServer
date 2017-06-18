package me.sachingupta.oddity.additional;

/**
 * Created by Sachin Gupta on 28-12-2016.
 */
public class ShortMessageService {
    /**
     * Class to send Messsage to the recepeint like Hike
     */
    private long ph_no;
    private String body;

    public long getPh_no() {
        return ph_no;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setPh_no(long ph_no) {
        this.ph_no = ph_no;
    }

    public boolean sendMessage() {
        return false;
    }
}
