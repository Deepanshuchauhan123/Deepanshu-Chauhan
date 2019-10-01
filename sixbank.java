package bank6;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;
import bank3.thirdbank;
import bank4.fourthbank;
public class sixbank implements ActionListener
{
Frame f;
Label l1;
TextField t1;
Button b1,b2;
PreparedStatement ps;
Connection co;
Statement st;
ResultSet rs;
public sixbank()
{
f=new Frame("Deposit Related");
l1=new Label("Ammount");
t1=new TextField();
b1=new Button("Deposit");
b2=new Button("Back");
f.setLayout(null);

l1.setBounds(50,100,60,30);
t1.setBounds(120,100,100,30);
b1.setBounds(100,200,80,30);
b2.setBounds(200,200,80,30);
f.add(l1);
f.add(t1);
f.add(b1);
f.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
f.setSize(300,300);
f.setVisible(true);
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
co=DriverManager.getConnection("jdbc:mysql://localhost:3306/nitin","root",null);
}catch(Exception op)
{
System.out.print("Error"+op);
}
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b2)
{
fourthbank n1=new fourthbank();
f.setVisible(false);
}
if(e.getSource()==b1)
{
try
{
String d="Deposit";
int v11=thirdbank.fun();
ps=co.prepareStatement("insert into details(to_acc,from_acc,type,amount)values(?,?,?,?)");
ps.setInt(1,v11);
ps.setInt(2,v11);
ps.setString(3,d);
ps.setInt(4,Integer.parseInt(t1.getText()));
ps.executeUpdate();
ps.close();

int v1=thirdbank.fun();
ps=co.prepareStatement("select * from bank where acno=?");
ps.setInt(1,v1);
ResultSet rs=ps.executeQuery();
String so="";
while(rs.next())
{
so=rs.getString(6);
}
rs.close();
ps.close();
int z2=Integer.parseInt(t1.getText());
int z1=Integer.parseInt(so);
int z=(z1+z2);
ps=co.prepareStatement("update bank set amount=?  where acno=?");
ps.setInt(1,z);
ps.setInt(2,v1);
ps.executeUpdate();
JOptionPane.showMessageDialog(f,"Account  Succesfully updated and Your Current balance is "+z);
ps.close();
}catch(Exception b)
{
System.out.print("Deposit error"+b);
}
}
}
}
