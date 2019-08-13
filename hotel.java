import java.awt.*;
import java.awt.event.*;
class hotel implements ItemListener ,ActionListener 
{
double amt,gst,total;
String a;
Frame f1,f2,f3;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
TextField t1,t2,t3,t4,t5,t6,t7;
Button b1,b2,b3,b4;
List li1,li2;
Choice c1;
hotel()
{
f1=new Frame("Hotel Ring Login");
f2=new Frame("Hotel Ring Meal");
f3=new Frame("Hotel Ring BILL");
l1=new Label("Name");
l2=new Label("Address");
l3=new Label("Meal");
l4=new Label("Menu");
l5=new Label("Order");
l6=new Label("Name");
l7=new Label("Address");
l8=new Label("Amount");
l9=new Label("GST");
l10=new Label("Total");
t1=new TextField();
t2=new TextField();
t3=new TextField();
t4=new TextField();
t5=new TextField();
t6=new TextField();
t7=new TextField();
b1=new Button("OK");
b2=new Button("Bill");
b3=new Button("OK");
b4=new Button("HOME");
li1=new List();
li2=new List();
c1=new Choice();
c1.add("Order");
c1.add("Breakfast");
c1.add("Lunch");
c1.add("Dinner");

f1.setLayout(null);
f2.setLayout(null);
f3.setLayout(null);
l1.setBounds(40,40,70,30);
l2.setBounds(40,90,70,10);
l3.setBounds(50,50,70,40);
l4.setBounds(50,150,70,20);
l5.setBounds(200,150,70,20);
l6.setBounds(40,40,70,40);
l7.setBounds(40,80,70,40);
l8.setBounds(40,120,70,40);
l9.setBounds(40,160,70,40);
l10.setBounds(40,200,70,40);
t1.setBounds(120,40,120,30);
t2.setBounds(120,90,120,30);
t3.setBounds(120,40,100,40);
t4.setBounds(120,80,100,40);
t5.setBounds(120,100,100,40);
t6.setBounds(120,160,100,40);
t7.setBounds(120,200,100,40);
b1.setBounds(120,150,50,40);
b2.setBounds(210,300,50,40);
b3.setBounds(50,210,40,30);
b4.setBounds(150,210,40,30);
li1.setBounds(30,180,100,60);
li2.setBounds(200,180,100,60);
c1.setBounds(50,90,85,20);
f1.add(l1);
f1.add(l2);
f1.add(b1);
f1.add(t1);
f1.add(t2);
f2.add(l3);
f2.add(l4);
f2.add(l5);
f2.add(li1);
f2.add(li2);
f2.add(c1);
f2.add(b2);
f3.add(l6);
f3.add(l7);
f3.add(l8);
f3.add(l9);
f3.add(l10);
f3.add(t3);
f3.add(t4);
f3.add(t5);
f3.add(t6);
f3.add(t7);
f3.add(b3);
f3.add(b4);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
li1.addItemListener(this);
li2.addItemListener(this);
c1.addItemListener(this);
f1.setSize(300,250);
f1.setVisible(true);
f2.setSize(400,400);
f3.setSize(400,400);

}
public void actionPerformed(ActionEvent e)
{	
	if(e.getSource()==b1)
	{
	f1.setVisible(false);
	f2.setVisible(true);
	}
	if(e.getSource()==b2)
	{
	f2.setVisible(false);
	f3.setVisible(true);
	}
}
public void itemStateChanged(ItemEvent e)
{	
	if(e.getSource()==c1)
	{
	if(c1.getSelectedItem()=="Breakfast")
	{
li1.removeAll();
	li1.add("Milk");
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

t3.setText(t1.getText());
t4.setText(t2.getText());
t5.setText("5%");	
}
public static void main(String ar[])
{
	hotel a1=new hotel ();
}
}