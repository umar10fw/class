import java.io.*; 
import java.net.*;
import lang.*; 
class Server { 
	public static void main(String[] args) 
	{ 
		ServerSocket server = null; 

		try { 
			server = new ServerSocket(5000); 
			server.setReuseAddress(true); 
		
			while (true) { 
			
				Socket client = server.accept(); 
								
				ClientHandler clientSock=new ClientHandler(client); 
			
				new Thread(clientSock).start(); 
			} 
		} 
		catch (IOException e) { 
			e.printStackTrace(); 
		} 		
	} 
} 
	
	
	 class ClientHandler extends Thread { 
		private final Socket clientSocket; 

		public ClientHandler(Socket socket) 
		{ 
			this.clientSocket = socket; 
		} 
		public void run() 
		{ 
			PrintWriter out = null; 
			BufferedReader in = null; 
			try { 			
				
				out = new PrintWriter( 
					clientSocket.getOutputStream(), true); 
				 
				in = new BufferedReader( 
					new InputStreamReader( 
						clientSocket.getInputStream())); 

				String line; 
				while ((line = in.readLine()) != null) { 
				 
					System.out.printf( 
						" Sent from the client: %s\n", 
						line); 
					out.println(line); 
				} 
			} 
			catch (IOException e) { 
				e.printStackTrace(); 
			} 
			
			} 
		} 
	

