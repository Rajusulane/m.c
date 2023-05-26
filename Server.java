import java.net.*;
import java.io.*;
class Server
{
public static void main(String s[])throws Exception
{

System.out.println("Server application is runing....");
ServerSocket ssobj=new ServerSocket(2100);
System.out.println("Server is running port no 2100");

Socket S=ssobj.accept();
System.out.println("Server and client connection is suuceful");
PrintStream ps = new PrintStream(S.getOutputStream());

BufferedReader br1 = new BufferedReader(new InputStreamReader(S.getInputStream()));

BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Chat messanget started....");
String str1,str2;
while((str1=br1.readLine())!=null)
{

System.out.println("Client says"+str1);
System.out.println("Enetr message for client ");
str2=br2.readLine();
ps.println(str2);
}
System.out.println("Thanks you for using message .....");
}
}