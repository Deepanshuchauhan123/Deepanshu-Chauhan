import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
class abc implements ActionListener
{
Frame f1;
Button b1;
DataOutputStream dou;
abc()
{
f1=new Frame("Client3");
b1=new Button("OFF");
f1.setLayout(null);
b1.setBounds(40,40,40,40);
f1.add(b1);
b1.addActionListener(this);
f1.setSize(500,400);
f1.setVisible(true);
try
{
Socket so=new Socket("localhost",100);
dou=new DataOutputStream(so.getOutputStream());
String s="103";
dou.writeUTF(s);
}catch(Exception q)
{
System.out.print("error"+q);
}
}
public void actionPerformed(ActionEvent e)
{
try
{
if(e.getSource()==b1)
{
String s="103OFF";
dou.writeUTF(s);

}
}catch(Exception q1)
{
System.out.print("error"+q1);
}

}
public static void main(String ar[])
{
abc a1=new abc();
}
}
