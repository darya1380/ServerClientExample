package single.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide
{
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();
//        System.out.println("hi, i'm the exciting single.server :)");
//        InputStreamReader reader = new InputStreamReader(s.getInputStream());
//        BufferedReader buff = new BufferedReader(reader);
//        String str = buff.readLine();
//        System.out.println("single.client says : " + str);
//        PrintWriter pr = new PrintWriter(s.getOutputStream());
//        pr.println("hi single.client! i can hear you too!");
//        pr.flush();


    }
}
