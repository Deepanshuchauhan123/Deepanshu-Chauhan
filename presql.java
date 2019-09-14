import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class abc implements ActionListener
{
Frame f;
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3,b4;
TextArea ta;
PreparedStatement ps;
Connection co;
Statement st;
ResultSet rs;
abc()
{
f=new Frame("Data");
l1=new Label("Name");
l2=new Label("Age");
l3=new Label("salary");
t1=new TextField();
t2=new TextField();
t3=new TextField();
b1=new Button("Insert");
b2=new Button("Show");
b3=new Button("delete");
b4=new Button("Update");
ta=new TextArea();
f.setLayout(null);
l1.setBounds(30,40,40,20);
l2.setBounds(30,80,40,20);
l3.setBounds(30,120,40,20);
t1.setBounds(80,40,80,20);
t2.setBounds(80,80,80,20);
t3.setBounds(80,120,80,20);
b1.setBounds(50,200,40,30);
b2.setBounds(100,200,40,30);
b3.setBounds(150,200,40,30);
b4.setBounds(200,200,40,30);
ta.setBounds(30,280,250,200);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(t3);
f.add(t1);
f.add(t2);
f.add(ta);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
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
if(e.getSource()==b1)
{
try
{
ps=co.prepareStatement("insert into emp(name,age,sal)values(?,?,?)");
String s1=t1.getText();
String s2=t2.getText();
String s3=t3.getText();
ps.setString(1,s1);
ps.setInt(2,Integer.parseInt(s2));
ps.setInt(3,Integer.parseInt(s3));
ps.executeUpdate();
ps.close();
}catch(Exception c)
{
System.out.print("Hai Error"+c);
}
}
else if(e.getSource()==b2)
{
try
{
ps=co.prepareStatement("select*from emp");
ResultSet rs=ps.executeQuery();
String s="";
while(rs.next())
{
s=(s+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+"\n");
}
ta.setText(s);
rs.close();
ps.close();
}catch(Exception ee)
{
System.out.print("Show"+ee);
}
}
else if(e.getSource()==b3)
{
try
{
String s1=t1.getText();
ps=co.prepareStatement("delete from emp where name =?");
ps.setString(1,s1);
ps.executeUpdate();
ps.close();
}catch(Exception w)
{
System.out.print("Show1"+w);
}
}
else if(e.getSource()==b4)
{
try
{
String s1=t1.getText();
String s2=t2.getText();
String s3=t3.getText();
ps=co.prepareStatement("update emp set age=?,sal=?   where name=?");
ps.setInt(1,Integer.parseInt(s2));
ps.setInt(2,Integer.parseInt(s3));
ps.setString(3,s1);
ps.executeUpdate();
ps.close();
}catch(Exception et)
{
System.out.print("Show4"+et);
}
}



}
public static void main(String ar[])
{
abc a1=new abc();
}
}