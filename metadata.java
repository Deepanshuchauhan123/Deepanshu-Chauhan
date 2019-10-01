import java.awt.*;
import java.sql.*;
import java.awt.event.*;
class abc implements ActionListener
{
Frame f;
Label l1,l2,l3;
TextField t1;
Choice c1,c2;
Button b1;
Connection co;
Statement st;
ResultSet rs;
ResultSetMetaData rsmd;
abc()
{
f=new Frame ("Meta Data");
l1=new Label(" Table Name");
l2=new Label("Field Name ");
l3=new Label("Field Type ");
t1=new TextField();
c1=new Choice();
c2=new Choice();
b1=new Button ("Show");
f.setLayout(null);
l1.setBounds(40,40,90,40);
l2.setBounds(40,100,70,40);
l3.setBounds(40,140,70,40);
b1.setBounds(100,200,50,50);
t1.setBounds(150,40,80,40);
c1.setBounds(120,100,80,40);
c2.setBounds(130,140,80,40);

f.add(l1);
f.add(l2);
f.add(l3);
f.add(b1);
f.add(t1);
f.add(c1);
f.add(c2);
b1.addActionListener(this);
f.setSize(400,400);
f.setVisible(true);
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
co=DriverManager.getConnection("jdbc:mysql://localhost:3306/nitin","root",null);

}catch(Exception e)
{
System.out.print("Connection"+e);
}
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
try
{
st=co.createStatement();
rs=st.executeQuery("select * from  "+t1.getText());
rsmd=rs.getMetaData();
int n=rsmd.getColumnCount();
for(int i=1;i<=n;i++)
{
c1.add(rsmd.getColumnName(i));
c2.add(rsmd.getColumnTypeName(i));
}
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
