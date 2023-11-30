package project;
import java.io.*;
import java.net.*;

class MyClient{


	public static void main(String p[])throws Exception{
	Socket s;
	BufferedReader in;
	PrintWriter out;
	String str;
	s=new Socket("127.0.0.1",5000);
	in=new BufferedReader(new InputStreamReader(System.in));
	out=new PrintWriter(s.getOutputStream(),true);

			while((str=in.readLine())!=null){

			out.println(str);
			out.flush();


			}


	}


}