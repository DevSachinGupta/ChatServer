package me.inventosachingupta.chatserver;

import me.inventosachingupta.chatserver.aid.AssistDB;
import me.inventosachingupta.chatserver.aid.ChatUtils;
import me.inventosachingupta.chatserver.aid.Constraints;
import me.inventosachingupta.chatserver.oddity.*;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Sachin Gupta on 05-01-2017.
 */

public class ChatServer implements Runnable,Constraints{

    private Thread thread;
    private boolean isDone=true;

    private ServerSocket _socket=null;
    private static DataOutputStream dos=null;
    private DataInputStream dis=null;
    private byte[] data=null;
    private Socket socket;
    private AssistDB db;
    private static Connection con;

    public ChatServer() throws IOException, SQLException, ClassNotFoundException {

        thread=new Thread(this);
        thread.start();
    }

    @Override
    public void run() {

        try
        {

        }
        catch (Exception e) {
        }
    }

    public static void processClientRequest(DataPacket dp) {
        
    }

    private static void processMessage(DataPacket dp)
    {

    }

    private static synchronized void processStatus(DataPacket dp)
    {

    }




    private static void NotifyUser(DataPacket dp)
    {

    }

    private static void processSignUp(Register signup)
    {

    }

    private static void processLogin(LogIn login)
    {

    }
}

class Service implements Runnable,Constraints {

    private Socket _socket;
    private DataInputStream dis=null;
    private byte[] data=null;

    public Service(Socket socket) throws IOException {
        _socket = socket;
        dis=new DataInputStream(socket.getInputStream());
        Thread thread=new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try
        {

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}