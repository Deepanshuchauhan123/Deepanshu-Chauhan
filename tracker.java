import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
class abc
{
ServerSocket soc;
Socket so;
DataInputStream din;
Frame f1;
Label l1,l2,l3,l4;
TextField t1,t2,t3,t4;
abc()
{
f1=new Frame("Tracker");

l1=new Label("Client 1");
l2=new Label("Client 2");
l3=new Label("Client 3");
l4=new Label("Client 4");
t1=new TextField();
t2=new TextField();
t3=new TextField();
t4=new TextField();
f1.setLayout(null);
t1.setBounds(20,40,40,40);
t2.setBounds(80,40,40,40);
t3.setBounds(20,120,40,40);
t4.setBounds(80,120,40,40);
l1.setBounds(20,80,50,30);
l2.setBounds(80,80,50,30);
l3.setBounds(20,180,50,30);
l4.setBounds(80,180,50,30);
f1.add(l1);
f1.add(l2);
f1.add(l3);
f1.add(l4);
f1.add(t1);
f1.add(t2);
f1.add(t3);
f1.add(t4);


f1.setSize(250,250);
f1.setVisible(true);
JColorChooser jc=new JColorChooser();
t1.setBackground(Color.red);
t2.setBackground(Color.red);
t3.setBackground(Color.red);
t4.setBackground(Color.red);
try
{
soc=new ServerSocket(100);
while(true)
{
so=soc.accept();
din=new DataInputStream (so.getInputStream());

String s="";
s=din.readUTF();
JColorChooser jc1=new JColorChooser();
if(s.equals("101"))
t1.setBackground(Color.green);
 if(s.equals("102"))
t2.setBackground(Color.green);
 if(s.equals("103"))
t3.setBackground(Color.green);
if(s.equals("104"))
t4.setBackground(Color.green);
if(s.equals("101OFF"))
t1.setBackground(Color.red);
 if(s.equals("102OFF"))
t2.setBackground(Color.red);
 if(s.equals("103OFF"))
t3.setBackground(Color.red);
if(s.equals("104OFF"))
t4.setBackground(Color.red);
din.close();
so.close();
}
}catch(Exception z)
{
System.out.print("Exception");
}
}


public static void main(String ar[])
{
abc aq=new abc();
}
}