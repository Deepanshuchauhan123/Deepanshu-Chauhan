import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
class abc implements ActionListener
{
Frame f1;
Label l1,l2;
TextArea ta;
TextField t1;
Button b1;
Choice c1;
String st1,st2,st3;
ServerSocket soc;
Socket s1,s2;
DataInputStream din;
DataOutputStream dau;
abc()
{
f1=new Frame("clint 1");
c1=new Choice();
l1=new Label("incoming message");
l2=new Label("send message");
t1=new TextField();
ta=new TextArea();
b1=new Button("go");
f1.setLayout(null);
l1.setBounds(20,40,150,30);
l2.setBounds(20,150,100,30);
ta.setBounds(20,80,250,50);
t1.setBounds(20,200,100,30);
b1.setBounds(100,240,40,20);
c1.setBounds(20,240,40,20);
f1.add(l1);
f1.add(l2);
f1.add(t1);
f1.add(ta);
f1.add(b1);
//c1.add("101");
c1.add("102");
c1.add("103");
//c1.add("104");
f1.add(c1);
b1.addActionListener(this);
f1.setSize(500,400);
f1.setVisible(true);
try
{
soc=new ServerSocket(101);
while(true)
{
s1=soc.accept();
System.out.print("clint connected");
din=new DataInputStream(s1.getInputStream());
String s=din.readUTF();
ta.append(s+"\n");
din.close();
s1.close();
}
}catch(Exception e)
{
System.out.print("hello");
}
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
try
{
s2=new Socket("localhost",100);
dau=new DataOutputStream(s2.getOutputStream());
dau.writeUTF(t1.getText()+":"+c1.getSelectedItem());
dau.close();
s2.close();
}catch(Exception f)
{
System.out.print("client 1 send "+f);
}
}
}
public static void main(String ar[])
{
abc a1=new abc();
}
}