package Sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Palko on 15/04/2016.
 */
class TCPClient_0 {
    public static void main(String argv[]) throws Exception {
        System.out.println("starting TCPClient main");
        String sentence = null;

        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("trying to connect");
        Socket clientSocket = new Socket("127.0.0.1", 5454);
        System.out.println("we are connected");

        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        while(true) {
            System.out.print("Please type your text: ");
            sentence = inFromUser.readLine();
            outToServer.writeBytes(sentence + '\n');

            sentence = inFromServer.readLine();
            System.out.println("FROM SERVER: " + sentence);
        }
         //   clientSocket.close();


    }
}
