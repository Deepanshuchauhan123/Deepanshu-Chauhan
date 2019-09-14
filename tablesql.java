import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class abc implements ActionListener
{
Frame f;
String s,s1;
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2;
Connection co;
Statement st;
ResultSet rs;
abc()
{
f=new Frame("create table");
l1=new Label("table");
l2=new Label("field name");
l3=new Label("field type");
t1=new TextField();
t2=new TextField();
t3=new TextField();
b1=new Button("add field");
b2=new Button("built table");
f.setLayout(null);
l1.setBounds(30,40,40,20);
l2.setBounds(30,80,60,20);
l3.setBounds(30,120,60,20);
t1.setBounds(100,40,100,20);
t2.setBounds(100,80,100,20);
t3.setBounds(100,120,100,20);
b1.setBounds(50,200,100,30);
b2.setBounds(150,200,100,30);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(t3);
f.add(t1);
f.add(t2);
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
if(e.getSource()==b1)
{
try
{
 s="";
String s2=t2.getText();
String s3=t3.getText();
s=(s+s2+"  "+s3+",");
int p=s.length();
s1=s.substring(0,p-1);
}catch(Exception e1)
{
System.out.print("Show"+e1);
}
}
else if(e.getSource()==b2)
{
try
{
st=co.createStatement();
st.executeUpdate("create table "+t1.getText()+"("+s1+")");
}catch(Exception q)
{
System.out.print("Show"+q);
}
}






}
public static void main(String ar[])
{
abc a1=new abc();
}
}
