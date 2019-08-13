package h1;
import java.awt.*;
import java.awt.event.*;
import h2.*;
import h3.*;

public class hotel1 implements ActionListener
{

 Frame f1;

 Label l1,l2;

 static TextField t1,t2;
 Button b1;

public static String a,b;
public hotel1()
{
f1=new Frame("Hotel Ring Login");
l1=new Label("Name");
l2=new Label("Address");
t1=new TextField();
t2=new TextField();
b1=new Button("OK");

f1.setLayout(null);
l1.setBounds(40,40,70,30);
l2.setBounds(40,90,70,10);
t1.setBounds(120,40,120,30);
t2.setBounds(120,90,120,30);
b1.setBounds(120,150,50,40);

f1.add(l1);
f1.add(l2);
f1.add(b1);
f1.add(t1);
f1.add(t2);
b1.addActionListener(this);
f1.setSize(300,250);
f1.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{	
	if(e.getSource()==b1)
	{
	f1.setVisible(false);
                a=t1.getText();
                 b=t2.getText();
                
	hotel2 a2=new hotel2();
	}

	
}
}