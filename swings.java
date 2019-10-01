import javax.swing.*;
import java.awt.event.*;
class abc 
{
JFrame f;
JTabbedPane jp;
abc()
{
f=new JFrame();
jp=new JTabbedPane();
JPanel p1=new JPanel();
JPanel p2=new JPanel();
JPanel p3=new JPanel(); 
jp.add("C",p1);
jp.add("C++",p2);
jp.add("JAVA",p3);
f.add(jp);
jp.setVisible(true);
f.setSize(200,200);
f.setVisible(true);
}
public static void main(String ar[])
{
abc a1=new abc();
}
}