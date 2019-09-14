import java.sql.*;
class abc
{
public static void main(String ar[])
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(ClassNotFoundException e)
{
System.out.print("hello "+e);
}

try
{
Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/nitin","root",null);

System.out.print("before deletion\n");
Statement st1=co.createStatement();
st1.executeUpdate("insert into emp(name,age,sal) values('aa',33,3333)");
Statement st=co.createStatement();
ResultSet rs=st.executeQuery("select * from emp");
while(rs.next())
{
System.out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+"\n");
}
System.out.print("after deletion\n");

Statement st2=co.createStatement();
st2.executeUpdate("delete from emp where name ='aa'");
Statement st3=co.createStatement();
ResultSet rs2=st3.executeQuery("select * from emp");
while(rs2.next())
{
System.out.print(rs2.getString(1)+" "+rs2.getString(2)+" "+rs2.getString(3)+"\n");
}
}catch(SQLException e)
{
System.out.print("hello 1"+e);
}
}
}