package h2;
import java.awt.*;
import java.awt.event.*;

import h1.*;
import h3.*;

public class hotel2  implements ItemListener ,ActionListener
{
public int amt;
public String a;
public Frame f2;
public Label l1,l2,l3;
public Button b1;
public List li1,li2;
public Choice c1;
public hotel2()
{
f2=new Frame("Hotel Ring Meal");
l1=new Label("Meal");
l2=new Label("Menu");
l3=new Label("Order");
b1=new Button("Bill");
li1=new List();
li2=new List();
c1=new Choice();
c1.add("Order");
c1.add("Breakfast");
c1.add("Lunch");
c1.add("Dinner");
f2.setLayout(null);
l1.setBounds(50,50,70,40);
l2.setBounds(50,150,70,20);
l3.setBounds(200,150,70,20);
b1.setBounds(210,300,50,40);
li1.setBounds(30,180,100,60);
li2.setBounds(200,180,100,60);
c1.setBounds(50,90,85,20);
f2.add(b1);
f2.add(l1);
f2.add(l2);
f2.add(l3);
f2.add(li1);
f2.add(li2);
f2.add(c1);
b1.addActionListener(this);
li1.addItemListener(this);
li2.addItemListener(this);
c1.addItemListener(this);
f2.setVisible(true);
f2.setSize(400,400);
}
public void actionPerformed(ActionEvent e)
{	
	if(e.getSource()==b1)
	{
	f2.setVisible(false);
	hotel3 a3=new hotel3();
	hotel3.t1.setText(hotel1.a);
	hotel3.t2.setText(hotel1.b);
	hotel3.t3.setText(Integer.toString(amt));
	hotel3.t5.setText(Integer.toString(amt+25));
	}
	//package p1;
//import p1.8;
}
public void itemStateChanged(ItemEvent e)
{	
	if(e.getSource()==c1)
	{
	if(c1.getSelectedItem()=="Breakfast")
	{
li1.removeAll();
	li1.add("MIlk");
 	li1.add("Sandwich");
	li1.add("Juice");
	li1.add("salad");
	li1.add("Fruits");
	}	
	else if(c1.getSelectedItem()=="Lunch")
	{
	li1.removeAll();
	li1.add("Dal");
 	li1.add("Rice");
	li1.add("Roti");
	li1.add("curd");
	li1.add("paneer");
	}
	else if(c1.getSelectedItem()=="Dinner")
	{
	li1.removeAll();
	li1.add("Khichdi");
 	li1.add("Naan");
	li1.add("Sweets");
	li1.add("Momos");
	li1.add("Fries");
	}
}

	if(e.getSource()==li1)
	{
	li2.add(li1.getSelectedItem());
	if(li1.getSelectedItem()=="Milk")
	amt=amt+40;
	else
	if(li1.getSelectedItem()=="Sandwich")
	amt=amt+15;
	else
	if(li1.getSelectedItem()=="Juice")
	amt=amt+75;
	else
	if(li1.getSelectedItem()=="Fruits")
	amt=amt+70;
	else
	if(li1.getSelectedItem()=="Dal")
	amt=amt+70;
	else
	if(li1.getSelectedItem()=="Fruits")
	amt=amt+70;
	else
	if(li1.getSelectedItem()=="Fruits")
	amt=amt+70;
	else
	if(li1.getSelectedItem()=="Fruits")
	amt=amt+70;
	}
	else
	{
	li1.add(li2.getSelectedItem());	
	}

}
}