import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 class abc
{ 
  static String a,b;
  static Frame f1;
  static TextField t1,t2;
  Label l1,l2;
  static Button b1,b2;
  
 abc()
{  
   a=t1.getText();
   b=t2.getText();  
   f1=new Frame("abc welcome");
   t1=new TextField();
   t2=new TextField();
   l1=new Label("name");
   l2=new Label("ADDRESS");
   b1=new Button("ok");
   b2=new Button("cancle");
  
  f1.setLayout(null);
  l1.setBounds(20,40,40,30);
  t1.setBounds(70,40,50,50);
  l2.setBounds(20,90,50,30);
  t2.setBounds(70,90,50,30);
  b1.setBounds(70,140,30,30);
  b2.setBounds(120,140,30,30);
  b1.addActionListener(new hotel2());
  b2.addActionListener(new hotel2());
  f1.add(t1);
  f1.add(t2);
  f1.add(l1);
  f1.add(l2);
  f1.add(b1);
  f1.add(b2);
  f1.setSize(500,500);
  f1.setVisible(true);
}
public static void main(String arr[])
{
  abc a1=new abc();
}
}
class hotel2 implements ItemListener,ActionListener 
{ 
  static Frame f2;
  static List li1,li2,li3;
  static Button b3;
  hotel2()
{   f2=new Frame("meanu");
    li1=new List();
    li2=new List();
    li2=new List();
    //c1=new Choice();
    b3=new Button("bill");
    f2.setLayout(null);
    li1.setBounds(20,40,100,100);
    li2.setBounds(140,40,100,100);
    li3.setBounds(20,240,100,100);
    b3.setBounds(140,280,30,30);
    
   f2.add(li1);
   f2.add(li2);
   //f2.add(c1);
   f2.add(li3);
   f2.add(b3);
   
   li1.add("samosa=10");
   li1.add("poha=20");
   li1.add("pasta=20");
   li2.add("roti=7");
   li2.add("daal=10");
   li2.add("paneer=30");
   li3.add("dinner");
   li3.add("lunch");
   li3.add("breakfast");
   //c1.addItemListener(this);
   li1.addItemListener(this);
   li2.addItemListener(this);
   li3.addItemListener(this);
   b3.addActionListener(new hotel3());
   f2.setSize(500,400);
   f2.setVisible(true);
  }
 public void actionPerformed(ActionEvent e)
 { 
   if(e.getSource()==abc.b1)
  {
    abc.f1.setVisible(false);
    f2.setVisible(true);
   }
 else if(e.getSource()==abc.b2)
 {
   System.exit(0);
  }
   }
public void itemStateChanged(ItemEvent e)
{ 
   if(e.getSource()==li1)
  {
    li3.add(li1.getSelectedItem());
  }
  else if(e.getSource()==li3)
{  li3.remove(li3.getSelectedIndex());
}
  if(e.getSource()==li2)
{
   li3.add(li2.getSelectedItem());
}
 else if(e.getSource()==li3)
{  
    li3.remove(li3.getSelectedIndex());
}
}
}
class hotel3 implements ActionListener
{
  int a,gst,amt;
  float total;
  String s;  
  Frame f3;
  TextField t1,t2,t3,t4,t5;
  Label l1,l2,l3,l4,l5;
  Button b3,b4;
  hotel3()
{  
  f3=new Frame("bill");
  t1=new TextField();
  t2=new TextField();
  t3=new TextField();
  t4=new TextField();
  t5=new TextField();
  l1=new Label("name");
  l2=new Label("address");
  l3=new Label("gst");
  l4=new Label("ammount");
  l5=new Label("total");
  b3=new Button("ok");
  b4=new Button("back to home");
  f3.setLayout(null);
  l1.setBounds(20,40,40,30);
  l2.setBounds(20,80,40,40);
  l3.setBounds(20,140,40,40);
  l4.setBounds(20,200,40,40);
  l5.setBounds(20,260,40,40);
  t1.setBounds(90,40,40,40);
  t2.setBounds(90,80,40,40);
  t3.setBounds(90,140,40,40);
  t4.setBounds(90,200,40,40);
  t5.setBounds(90,260,40,40);
  b3.setBounds(90,290,30,30);
  b4.setBounds(120,290,30,30);
  f3.add(t1);
  f3.add(t2);
  f3.add(t3);
  f3.add(t4);
  f3.add(t5);
  f3.add(l1);
  f3.add(l2);
  f3.add(l3);
  f3.add(l4);
  f3.add(l5);
  f3.add(b3);
  f3.add(b4);
  f3.setSize(400,400);
  f3.setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
{  
  t1.setText(abc.a);
  t2.setText(abc.b);
    
  if(e.getSource()==hotel2.b3)
  {
     hotel2.f2.setVisible(false);
     f3.setVisible(true);
     for(a=0;a<hotel2.li3.countItems();a++)
     {
       hotel2.li3.select(a);
       s=hotel2.li3.getSelectedItem();
    if(s.equals("samosa"))
     {
        amt=amt+10;
         }
     else if(s.equals("poha"))
     { 
    amt=amt+20;
     }
    else if(s.equals("pasta"))
     {
     amt=amt+20;
     }
    else if(s.equals("roti"))
    { 
    amt=amt+7;
    }
     else if(s.equals("daaL"))
     {   
     amt=amt+20;
     }
   else if(s.equals("panner"))
   {   
    amt=amt+30;
   }
    else if(s.equals("chekken"))
   { 
   amt=amt+50;
   }
   t3.setText(Integer.toString(amt));
   t4.setText(Integer.toString(gst));
   t5.setText(Float.toString(total));
   gst=(amt*15)/100;
   total=amt+gst;
   
   }
   }
    
 if(e.getSource()==b4)
  {
    f3.setVisible(false);
    abc.f1.setVisible(true);
    t1.setText("");
    t2.setText("");
    t3.setText("");
    t4.setText("");
    t5.setText("");
    
    abc.t1.setText("");
    abc.t2.setText("");
  }
 else if(e.getSource()==b3)
  {  
    System.exit(0);
 }
 }
 } 
     
      
   

     
        
 
    
 
    
   