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

if(e.getSource()==b2)
{
try
{
st=co.createStatement();
ResultSet rs=st.executeQuery("select*from emp");
String s="";
while(rs.next())
{
s=(s+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+"\n");
}
ta.setText(s);
rs.close();
st.close();
}catch(Exception ee)
{
System.out.print("Show"+ee);
}
}
else if(e.getSource()==b4)
{
try
{
st=co.createStatement();
String s1=t1.getText();
String s2=t2.getText();
String s3=t3.getText();
st.executeUpdate("update emp set age="+s2+",sal="+s3+"  where name="+"'"+s1+"'");
st.close();
}catch(Exception et)
{
System.out.print("Show4"+et);
}
}
else if(e.getSource()==b3)
{
try
{
st=co.createStatement();
st.executeUpdate("delete from emp where name ="+"'"+t1.getText()+"'");
st.close();
}catch(Exception w)
{
System.out.print("Show1"+w);
}
}
else if(e.getSource()==b1)
{
try
{
st=co.createStatement();
String s1=t1.getText();
String s2=t2.getText();
String s3=t3.getText();
st.executeUpdate("insert into emp(name,age,sal)values("+"'"+s1+"'"+","+s2+","+s3+")");
st.close();
}catch(Exception c)
{
System.out.print("Hai Error"+c);
}
}
}
public static void main(String ar[])
{
abc a1=new abc();
}
}