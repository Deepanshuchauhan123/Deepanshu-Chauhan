package h3;
import h1.*;
import h2.*;

import java.awt.*;
import java.awt.event.*;
public class hotel3 implements ActionListener
{

public Frame f3;

public Label l1,l2,l3,l4,l5;

public static TextField t1,t2,t3,t4,t5;

public Button b1,b2;
public hotel3()
{
f3=new Frame("Hotel Ring BILL");
b1=new Button("OK");
b2=new Button("HOME");
t1=new TextField();
t2=new TextField();
t3=new TextField();
t4=new TextField("25");
t5=new TextField();
l1=new Label("Name");
l2=new Label("Address");
l3=new Label("Amount");
l4=new Label("GST");
l5=new Label("Total");
f3.setLayout(null);
l1.setBounds(40,40,70,40);
l2.setBounds(40,80,70,40);
l3.setBounds(40,120,70,40);
l4.setBounds(40,160,70,40);
l5.setBounds(40,200,70,40);
b1.setBounds(50,270,40,30);
b2.setBounds(150,270,40,30);
t1.setBounds(120,40,100,40);
t2.setBounds(120,80,100,40);
t3.setBounds(120,120,100,40);
t4.setBounds(120,160,100,40);
t5.setBounds(120,200,100,40);
f3.add(l1);
f3.add(l2);
f3.add(b1);
f3.add(b2);
f3.add(t1);
f3.add(t2);
f3.add(t3);
f3.add(t4);
f3.add(t5);
f3.add(l3);
f3.add(l4);
f3.add(l5);
b1.addActionListener(this);
b2.addActionListener(this);
f3.setVisible(true);
f3.setSize(400,400);
}
public void actionPerformed(ActionEvent e)
{	
	if(e.getSource()==b1)
	{
	f3.setVisible(false);
	}


	
}	
public static void main(String ar[])
{
	hotel1 a1=new hotel1 ();
}
}

