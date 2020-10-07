package client;

import java.io.IOException;
import java.net.Socket;

public class ClientSide
{
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 4999);
        System.out.println("client says hi: no server here?");

    }
}
