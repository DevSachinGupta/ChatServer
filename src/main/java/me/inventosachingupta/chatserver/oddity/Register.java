package me.inventosachingupta.chatserver.oddity;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by Sachin Gupta on 22-12-2016.
 */
public class Register {
    private String userId;
    private String password;
    private byte[] avtar;

    public void setUserID(String userId){
        this.userId=userId;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setAvtar(java.io.File avtar)throws IOException{
        Path path=java.nio.file.Paths.get(avtar.getPath());
        this.avtar= Files.readAllBytes(path);
    }

    public String getUserID(){
        return userId;
    }
    public String getPassword(){
        return password;
    }
    public byte[] getAvtar(){
        return avtar;
    }

    public boolean isAutenicated(){
        return false;
    }
}
