import java.io.*;
import java.sql.*;
class abc
{
public static void main(String ar[])
{
try 
{
Class.forName("com.mysql.cj.jdbc.Driver");
}catch(Exception e)
{
System.out.print("Error"+e);
}
try
{
Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/nitin","root",null);
PreparedStatement ps=co.prepareStatement("insert into image(no,img)values(?,?)");
FileInputStream fi=new FileInputStream( "C:\\abc.jpg" );
ps.setInt(1,1);
ps.setBinaryStream(2,fi);
ps.executeUpdate();
ps.close();
PreparedStatement ps2=co.prepareStatement("select * from image");
ResultSet rs=ps2.executeQuery();
Blob bo=null;
while(rs.next())
{

bo=rs.getBlob(2);;
}
byte b[]=bo.getBytes(1,(int)bo.length());
FileOutputStream fo=new FileOutputStream( "D:\\abc.jpg"  );
fo.write(b);
fo.close();
ps2.close();
}catch(Exception ee)
{
System.out.print("Error"+ee);
}
}
}