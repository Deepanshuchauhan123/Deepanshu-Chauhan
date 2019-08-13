import java.awt.*;
import java.io.*;
import java.awt.event.*;
class emp implements Serializable 
{
String name;
int age ;
double sal;
emp(String n,int a,double s)
{
name =n;
age=a;
sal=s;
}
String getName()
{
return name;
}
int getAge()
{
return age;
}
double getSal()
{
return sal;
}
}
class gui implements ActionListener
{

Frame f1;
Button b1,b2;
TextField t1,t2,t3,t4;
Label l1,l2,l3,l4;
gui()
{
f1=new Frame ("Information");
b1=new Button("Insert");
b2=new Button("Show");
t1=new TextField();
t2=new TextField();
t3=new TextField();
t4=new TextField();
l1=new Label("Name");
l2=new Label("Age");
l3=new Label("Salary");
l4=new Label("File");
f1.setLayout(null);
b1.setBounds(30,220,70,30);
b2.setBounds(130,220,80,30);
t1.setBounds(80,80,150,30);
t2.setBounds(80,120,150,30);
t3.setBounds(80,160,150,30);
t4.setBounds(80,40,150,30);
l1.setBounds(30,80,40,30);
l2.setBounds(30,120,40,30);
l3.setBounds(30,160,40,30);
l4.setBounds(30,40,40,30);
f1.add(b1);
f1.add(b2);
f1.add(t1);
f1.add(t2);
f1.add(t3);
f1.add(t4);
f1.add(l1);
f1.add(l2);
f1.add(l3);
f1.add(l4);
b1.addActionListener(this);
b2.addActionListener(this);
f1.setSize(300,300);
f1.setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
{
try
{
emp e1=new emp(t1.getText(),Integer.parseInt(t2.getText()),Double.parseDouble(t3.getText()));
FileOutputStream f0=new FileOutputStream(t4.getText());
ObjectOutputStream d=new ObjectOutputStream(f0);
d.writeObject(e1);
d.flush();
d.close();
f0.close();
}catch (IOException w)
{
System.out.print("Exception "+w);
}
}
if(e.getSource()==b2)
{
try
{
FileInputStream f=new FileInputStream(t4.getText());
ObjectInputStream o=new ObjectInputStream(f);
emp e1=(emp) o.readObject();
t1.setText(e1.getName());
t2.setText(Integer.toString(e1.getAge()));
t3.setText(Double.toString(e1.getSal()));
o.close();
f.close();
}catch(Exception ee)
{
System.out.print("exception");
} 
}
}
public static void main(String ar[])
{
	gui a1=new gui ();

	
}
}