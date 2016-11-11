package Sockets; /**
 * Example TCP Server
 */

import java.io.*;
import java.net.*;

public class TCPServer_0
{
    public static void main(String argv[]) throws Exception
    {
        System.out.println("starting main");
        String sentence;
        String userText;

        ServerSocket welcomeSocket = new ServerSocket(5454);
        System.out.println("we have a socket");
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("waiting for a connection");
        Socket connectionSocket = welcomeSocket.accept();
        System.out.println("we got a connection");
        BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
        DataOutputStream  outToClient = new DataOutputStream(connectionSocket.getOutputStream());
        sentence = inFromClient.readLine();
        while(!sentence.equals("close")){
            System.out.println("FROM CLIENT: " + sentence);
            System.out.print("Please type your text: ");
            //msg from server
            userText = inFromUser.readLine();

            outToClient.writeBytes(userText + '\n');
            sentence = inFromClient.readLine();
        }

        //  userText = inFromUser.readLine();
        //  outToClient.writeBytes(userText + '\n');

        // sentence = inFromClient.readLine();
        // System.out.println("FROM CLIENT: " + sentence);

        System.out.println("quitting and closing the socket");
        connectionSocket.close();
        welcomeSocket.close();
    }

}