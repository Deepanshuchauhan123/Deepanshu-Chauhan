package bank1;
import java.awt.*;
import java.awt.event.*;
import bank2.*;
import bank3.*;
 public class firstbank implements ActionListener
{
Frame f;
Button b1,b2;
public firstbank()
{
f=new Frame ("User Type");
b1=new Button("New User");
b2=new Button("Existing User");
f.setLayout(null);
b1.setBounds(100,100,80,50);
b2.setBounds(100,200,80,50);
f.add(b1);
f.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
f.setSize(400,400);
f.setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
f.setVisible(false);
secondbank ba2=new secondbank();
}
if(e.getSource()==b2)
{
f.setVisible(false);
thirdbank ta =new thirdbank();
}
}
public static void main(String ar[])
{
firstbank f1=new firstbank();
}
}