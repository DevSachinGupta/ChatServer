package me.inventosachingupta.chatserver.oddity;

/**
 * Created by Sachin Gupta on 26-12-2016.
 */
public class StatusUpdate {
    private Object status;

    @Override
    public String toString() {
        return "StatusUpdate{" +
                "status=" + status +
                '}';
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public StatusUpdate() {

    }

    public StatusUpdate(Object status) {
        this.status = status;
    }
}
