package bank3;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import bank4.*;
import javax.swing.*;
public class thirdbank implements ActionListener
{
Frame f;
Label l1,l2;
TextField t1,t2;
Button b1;
 static String st1;
int c=0;
Connection co;
PreparedStatement ps;
ResultSet rs;
public thirdbank()
{
f=new Frame("Third Bank Form");
l1=new Label("Account");
l2=new Label("Password");
t1=new TextField();
t2=new TextField();
b1=new Button("Login");
f.setLayout(null);

l1.setBounds(30,40,70,20);
l2.setBounds(30,80,70,20);
t1.setBounds(120,40,80,20);
t2.setBounds(120,80,80,20);
b1.setBounds(100,200,40,30);
f.add(l1);
f.add(l2);
f.add(t1);
f.add(t2);
f.add(b1);
b1.addActionListener(this);
f.setSize(300,300);
f.setVisible(true);
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
co=DriverManager.getConnection("jdbc:mysql://localhost:3306/nitin","root",null);
}catch(Exception e)
{
System.out.print("Error"+e);
}
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
try
{
st1=t1.getText();
String st2=t2.getText();
String stt="";
int c=0;
ps=co.prepareStatement("select * from bank where  acno=? and password=? and status=?");
ps.setInt(1,Integer.parseInt(st1));
ps.setString(2,st2);
ps.setString(3,"active");
rs=ps.executeQuery();
while(rs.next())
{
c=c+1;
}
if(c!=0)
{
JOptionPane.showMessageDialog(f,"Login Sucessful");
f.setVisible(false);
fourthbank tb=new fourthbank();
}
else
JOptionPane.showMessageDialog(f,"Wrong Account number ya password");
rs.close();
ps.close();
}catch(Exception g)
{
System.out.print("Third error"+g);
}
}
}

public static int fun()

{
 int l=Integer.parseInt(st1);
return l;
}
}
