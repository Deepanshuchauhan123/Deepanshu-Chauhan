import java.io.*;
import java.net.*;
import java.util.*;
class server
{
ServerSocket soc;
Socket s1,s2;
DataOutputStream dou;
DataInputStream din;
String a,b;
server()
{
try
{
soc=new ServerSocket(100);
while(true)
{
s1=soc.accept();
din=new DataInputStream(s1.getInputStream());
String s=din.readUTF();
StringTokenizer st=new StringTokenizer(s,":");
while(st.hasMoreTokens())
{
a=st.nextToken();
b=st.nextToken();
}
s2=new Socket("localhost",Integer.parseInt(b));

dou=new DataOutputStream(s2.getOutputStream());
dou.writeUTF(a);
dou.close();
}
}catch(Exception e)
{
System.out.println("Exception");
}
}

public static void main(String arr[])
{
server s=new server();
}
}