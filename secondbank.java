package bank2;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.sql.*;
import bank1.*;
public class secondbank implements ActionListener
{
Frame f;
Label l1,l2,l3,l4,l5;
TextField t1,t2,t3,t4,t5;
Button b1,b2;
Connection co;
PreparedStatement ps;
ResultSet rs;
public secondbank()
{
f=new Frame("Second Bank Form");
l1=new Label("Name");
l2=new Label("Password");
l3=new Label("Address");
l4=new Label("Mobile");
l5=new Label("Amount");
t1=new TextField();
t2=new TextField();
t3=new TextField();
t4=new TextField();
t5=new TextField();
b1=new Button("Create");
b2=new Button("Back");
f.setLayout(null);

l1.setBounds(30,40,70,20);
l2.setBounds(30,80,70,20);
l3.setBounds(30,120,70,20);
l4.setBounds(30,160,70,20);
l5.setBounds(30,200,70,20);
t1.setBounds(120,40,80,20);
t2.setBounds(120,80,80,20);
t3.setBounds(120,120,80,20);
t4.setBounds(120,160,80,20);
t5.setBounds(120,200,80,20);
b1.setBounds(100,240,60,30);
b2.setBounds(200,240,60,30);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
f.add(l5);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(t4);
f.add(t5);
f.add(b1);
f.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
f.setSize(600,600);
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
if(e.getSource()==b2)
{
firstbank h1=new firstbank();
f.setVisible(false);
}
if(e.getSource()==b1)
{
try
{
String s1=t1.getText();
String s2=t2.getText();
String s3=t3.getText();
String s4=t4.getText();
String s5=t5.getText();
if(Integer.parseInt(s5)>1000)
{
ps=co.prepareStatement("insert into bank(name,password,address,mobile,amount)values(?,?,?,?,?)");
ps.setString(1,s1);
ps.setString(2,s2);
ps.setString(3,s3);
ps.setString(4,s4);
ps.setInt(5,Integer.parseInt(s5));
ps.executeUpdate();
ps.close();

ps=co.prepareStatement("select Max(acno) from bank");
rs=ps.executeQuery();
String s="";
while(rs.next())
{
s=rs.getString(1);
}
JOptionPane.showMessageDialog(f,"Account Created Succesfully and Account No. is "+s);
ps.close();
rs.close();
}
else
JOptionPane.showMessageDialog(f,"Invalid amount to open bank account ");
}catch(Exception c)
{
System.out.print("Hai Error"+c);
}
}
}
}
