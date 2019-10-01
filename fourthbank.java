package bank4;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import bank1.firstbank;
import bank3.thirdbank;
import bank5.*;
import bank6.*;
public class fourthbank implements ActionListener
{
Frame f;
Button b1,b2,b3,b4,b5,b6;
TextArea ta1;
Connection co;
PreparedStatement ps;
ResultSet rs;
public fourthbank()
{
f=new Frame ("Money");
b1=new Button("Deposit");
b2=new Button("WithDrawl");
b3=new Button("Show");
b4=new Button("Transfer");
b5=new Button("Details");
b6=new Button("Deactivate");
ta1=new TextArea();
f.setLayout(null);
b1.setBounds(100,100,80,50);
b2.setBounds(100,200,80,50);
b3.setBounds(200,200,80,50);
b4.setBounds(200,100,80,50);
b5.setBounds(300,100,80,50);
b6.setBounds(300,200,80,50);
ta1.setBounds(200,400,400,200);
f.add(ta1);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
f.setSize(800,800);
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
sixbank d=new sixbank();
f.setVisible(false);
}
if(e.getSource()==b2)
{
fivebank f1=new fivebank();
f.setVisible(false);
}


if(e.getSource()==b5)
{
try
{
int v1=thirdbank.fun();
ps=co.prepareStatement("select*from details where to_acc=?");
ps.setInt(1,v1);
 rs=ps.executeQuery();
String sw="";
while(rs.next())
{
sw=(sw+rs.getString(1)+"  "+rs.getString(2)+"   "+rs.getString(3)+"  "+rs.getString(4)+"     "+rs.getString(5)+"  "+rs.getString(6)+"\n");
}
ta1.setText(sw);
rs.close();
ps.close();
}catch(Exception ee)
{
System.out.print("Show"+ee);
}
}

if(e.getSource()==b6)
{
try
{
int vp=thirdbank.fun();
ps=co.prepareStatement("update bank set status=?  where acno=?");
ps.setString(1,"deactivate");
ps.setInt(2,vp);
ps.executeUpdate();
JOptionPane.showMessageDialog(f,"Account  Succesfully Deactivated");
ps.close();
f.setVisible(false);
thirdbank b=new thirdbank();
}catch(Exception c)
{
System.out.print("Hai Error"+c);
}
}

if(e.getSource()==b3)
{
try
{
int v=thirdbank.fun();
ps=co.prepareStatement("select*from bank where acno=?");
ps.setInt(1,v);
 rs=ps.executeQuery();
String s="";
while(rs.next())
{
s=(s+"Account No. "+rs.getString(1)+"\n"+"Name : "+rs.getString(2)+"\n "+"Password: "+rs.getString(3)+"\n"+"Address "+rs.getString(4)+"\n "+"Mobile No."+rs.getString(5)+"\n"+"Amount: "+rs.getString(6)+"\n");
}
ta1.setText(s);
rs.close();
ps.close();
}catch(Exception ee)
{
System.out.print("Show"+ee);
}
}
if(e.getSource()==b4)
{
try
{
sevenbank s7=new sevenbank();
f.setVisible(false);
}catch(Exception ee)
{
System.out.print("Show"+ee);
}
}
}
}