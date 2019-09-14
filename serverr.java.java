import java.util.*;
import java.io.*;
import java.net.*;
class server
{
public static void main(String arr[])
{
try
{
ServerSocket soo=new ServerSocket(100);
Socket so=soo.accept();
DataInputStream din=new DataInputStream(so.getInputStream());
String s=din.readUTF();
String a="",b="";
StringTokenizer st=new StringTokenizer(s,":");
while(st.hasMoreTokens())
{
a=st.nextToken();
b=st.nextToken();
}
FileOutputStream fout=new FileOutputStream(b);
byte bb[]=a.getBytes();
fout.write(bb);
din.close();
fout.close();
so.close();
soo.close();
}catch(Exception ee)
{
System.out.print("error"+ee)
}
}
}