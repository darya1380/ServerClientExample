package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSide
{
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 4999);
        System.out.println("client says hi: no server here?");
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("hi server! i can hear you!");
        pr.flush();
        InputStreamReader reader = new InputStreamReader(s.getInputStream());
        BufferedReader buff = new BufferedReader(reader);
        String str = buff.readLine();
        System.out.println("server says : " + str);
    }
}
