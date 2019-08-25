import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
class client1 implements ActionListener
{
Frame f;
TextArea ta;
TextField t1;
Label l1,l2;
Button b1;
ServerSocket soc;
Socket s1,s2;
DataOutputStream dou;
DataInputStream din;
client1()
{
f=new Frame("Client 1");
ta=new TextArea();
t1=new TextField();
l1=new Label("Incoming Message");
l2=new Label("Send Message");
b1=new Button("GO");
f.setLayout(null);
f.add(ta);
f.add(t1);
f.add(l1);
f.add(l2);
f.add(b1);

ta.setBounds(10,100,300,200);
t1.setBounds(10,350,300,30);
l1.setBounds(10,50,200,30);
l2.setBounds(10,320,200,20);
b1.setBounds(50,450,50,30);
b1.addActionListener(this);
f.setSize(500,500);
f.setVisible(true);

try
{
soc=new ServerSocket(101);
while(true)
{
s1=soc.accept();
din=new DataInputStream(s1.getInputStream());
String s=din.readUTF();
ta.append(s+"\n");
din.close();
s1.close();
}
}catch(Exception e)
{
System.out.println("Exception "+e);
}
}
public void actionPerformed(ActionEvent q)
{
if(q.getSource()==b1)
{
try
{
s2=new Socket("192.168.43.232",102);
dou=new DataOutputStream(s2.getOutputStream());
dou.writeUTF(t1.getText());
dou.close();
s2.close();
}catch(Exception z)
{
System.out.println("Exception "+z);
}
}
}
public static void main(String ar[])
{
client1 a=new client1();
}
}
