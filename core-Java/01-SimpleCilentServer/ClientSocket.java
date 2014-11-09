import java.io.*;
import java.net.*;

public class ClientSocket {
	
	public static void main(String[] args) {
		String hostName = "127.0.0.1";
		int portNumber = 4444;
		
		try {
			Socket clientSocket = new Socket(hostName, portNumber);
			PrintWriter clientOut = new PrintWriter(clientSocket.getOutputStream(), true);
			// Send the command line arguement to the server
			clientOut.println(args[0]);
			System.out.println("client Input:" + args[0]);
			BufferedReader clientIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));		
			
			String serverStr;
			
			while((serverStr = clientIn.readLine()) != null){
				System.out.println("Server Response:" + serverStr);
			}
			//	in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {			
		}
	}
}
