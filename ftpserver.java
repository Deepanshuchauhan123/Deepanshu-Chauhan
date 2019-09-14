import java .io.*;
import java.net.*;
import java.util.*;
class ftpserver
{
public static void main(string ar[])
{
try
{
ServerSocket soc=new ServerSocket(100);
socket so=soc.accept();
DataInputStream din=new DataInputStream(so.getInputstream());
String s=din.readUTF();
String a="",b="";
StringTokenizer
