import java.io.*;
import java.net.*;
class ftpclient
{
public static void main(String ar[])
{
try
{
FileInputStream fi=new FileInputStream("ftpclient.java");
int i=0;
String s="";
while( (i=fi.read())!=-1)
{
s=s+String.valueOf((char)i);
}
s=s+":"+"niti.txt";

Socket so=new Socket("192.168.43.232",100);
DataOutputStream dou=new DataOutputStream(so.getOutputStream());
dou.writeUTF(s);
dou.close();
so.close();
}catch(Exception e)
{
System.out.print("hello "+e);
}
}
}