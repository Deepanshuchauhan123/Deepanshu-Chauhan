import java.io.*;
import java.net.*;
import java.util.*;
class server
{
ServerSocket soc;
Socket so;
DataOutputStream dou;
DataInputStream din;
server()
{
try
{
soc=new ServerSocket(100);
so=soc.accept();
System.out.print("Client connected");
din=new DataInputStream (so.getInputStream());
dou=new DataOutputStream (so.getOutputStream());

String s="";
do{
s=din.readUTF();
System.out.print("Client Message \n"+s+"\n");
dou.writeUTF("ok");
}while(!s.equals("stop"));
din.close();
dou.close();
so.close();
soc.close();
}catch(Exception z)
{
System.out.print("Exception");
}
}
public static void main(String ar[])
{
server s=new server();
}
}


