import java.net.*;
import java.io.*;
class Client 
{
public static void main(String s[])throws Exception
{

System.out.println("Client application is runing....");

System.out.println("Client is wating for connection");
Socket S=new Socket("localhost",2100);

PrintStream ps=new PrintStream(S.getOutputStream());

BufferedReader br1=new BufferedReader(new InputStreamReader (S.getInputStream()));

BufferedReader br2=new BufferedReader( new InputStreamReader(System.in));

String str1,str2;
System.out.println("Enter message for Server ");
while(!(str1=br2.readLine()).equals("end"))
{

ps.println(str1);
str2=br1.readLine();
System.out.println("Enter message for server");
System.out.println("Server says :"+str2);
 
}
System.out.println("Thank you  for using chat messanger....... "); 
}

}

// BufferedReader br=new bufferedReader(new InputStreamReader(System.in));