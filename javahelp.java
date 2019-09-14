import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.*;
class abc implements ActionListener
{
Frame f;
Label l1,l2,l3,l4,l5;
TextField t1,t2;
TextArea ta1,ta2,ta3;
Button b1;
abc()
{
f=new Frame("java Help");
l1=new Label("Package Name");
l2=new Label("Class Name");
l3=new Label("Fields");
l4=new Label("Methods");
l5=new Label("Constructor");
ta1=new TextArea();
ta2=new TextArea();
t1=new TextField();
t2=new TextField();
ta3=new TextArea();
b1=new Button("Show");
f.setLayout(null);
l1.setBounds(30,30,120,20);
l2.setBounds(30,80,120,20);
l3.setBounds(50,200,70,50);
l4.setBounds(250,200,50,50);
l5.setBounds(450,200,70,50);
ta1.setBounds(30,250,200,200);
ta2.setBounds(230,250,200,200);
t1.setBounds(150,30,100,30);
t2.setBounds(150,80,100,30);
ta3.setBounds(430,250,200,200);
b1.setBounds(100,150,40,45);

f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
f.add(l5);
f.add(ta1);
f.add(ta2);
f.add(t1);
f.add(t2);
f.add(ta3);
f.add(b1);
b1.addActionListener(this);
f.setSize(1000,800);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
try
{
Class c=Class.forName(t1.getText()+"."+t2.getText());
Field f1[]=c.getFields();
Method me[]=c.getMethods();
Constructor co[]=c.getConstructors();
String s1="",s2="",s3="";
for(int i=0;i<f1.length;i++)
{
s1=s1+f1[i].toString()+"\n";
}
for(int i=0;i<me.length;i++)
{
s2=s2+me[i].toString()+"\n";
}
for(int i=0;i<co.length;i++)
{
s3=s3+co[i].toString()+"\n";
}
ta1.setText(s1);
ta2.setText(s2);
ta3.setText(s3);
}catch(Exception w)
{
System.out.print(" Error"+w);
}
}
}
public static void main(String ar[])
{
abc a1=new abc();
}
}