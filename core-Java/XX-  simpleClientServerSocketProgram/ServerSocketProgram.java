import java.io.*;
import java.net.*;

public class ServerSocketProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket = new ServerSocket(4444);
			Socket clientSocket = serverSocket.accept();
			
			BufferedReader serverIn = new BufferedReader(
					new InputStreamReader(clientSocket.getInputStream()));
			
			String input;
			PrintWriter serverOut = new PrintWriter(clientSocket.getOutputStream(),true);
			
			while ((input = serverIn.readLine()) != null) {
		//		System.out.println("Client Msg:" + input);
				serverOut.println("String Received:" + input);
				serverOut.println("String Received Length:" + input.length());
			}
		}catch(Exception e) {
			e.printStackTrace();			
		}
	}

}
