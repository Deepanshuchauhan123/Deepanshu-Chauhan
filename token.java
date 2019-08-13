import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
class token implements ActionListener
{
Frame f1;
Button b1,b2;
TextField t1;
TextArea a1;
Label l1;
token()
{
f1=new Frame ("Token gui");
b1=new Button("Tofile");
b2=new Button("Token");
t1=new TextField();
a1=new TextArea();
l1=new Label("File");

f1.setLayout(null);

b1.setBounds(50,100,80,30);
b2.setBounds(180,100,80,30);
t1.setBounds(100,60,150,30);
a1.setBounds(50,150,250,200);
l1.setBounds(50,60,60,30);
f1.add(b1);
f1.add(b2);
f1.add(t1);
f1.add(a1);
f1.add(l1);
b1.addActionListener(this);
b2.addActionListener(this);
f1.setSize(350,400);
f1.setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
try
{
FileOutputStream s1=new FileOutputStream(t1.getText());
String s=a1.getText();
byte b[]=s.getBytes();
s1.write(b);
s1.close();
}catch (IOException w)
{
System.out.print("Exception");
}
}
if(e.getSource()==b2)
{
try{
FileInputStream f4=new FileInputStream(t1.getText());
int i=0;
String s="";
while((i=f4.read())!=-1)
{
s=s+String.valueOf((char)i);

}
StringTokenizer s1=new StringTokenizer(s,"=;");
while(s1.hasMoreTokens())
{
a1.append(s1.nextToken()+"      "+s1.nextToken()+"\n");
}
}catch (IOException w)
{
System.out.print("Exception");
}

}
}
public static void main(String ar[])
{
	token an=new token ();
}
}