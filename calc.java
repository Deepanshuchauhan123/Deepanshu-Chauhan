import java.awt.*;
import java.awt.event.*;
class calc implements ActionListener
{
	Frame f;
	int a,b,c;
	String opt;
	TextField t1;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bm,bd,be,bsi,bc,bt,bdot,bon,boff;
calc()
{
f=new Frame("Calculator");

t1=new TextField();

b0= new Button("0");
b1= new Button("1");
b2= new Button("2");
b3= new Button("3");
b4= new Button("4");
b5= new Button("5");
b6= new Button("6");
b7= new Button("7");
b8= new Button("8");
b9= new Button("9");
ba= new Button("+");
bs= new Button("-");
bm= new Button("*");
bd= new Button("/");
be= new Button("=");
bsi=new Button("sin");
bc=new Button("cos");
bt=new Button("tan");
bdot=new Button(".");
bon=new Button("ON");
boff=new Button("OFF");

f.setLayout(null);

t1.setBounds(30,40,150,20);

b1.setBounds(20,70,30,30);
b2.setBounds(60,70,30,30);
b3.setBounds(100,70,30,30);
b4.setBounds(140,70,30,30);
b5.setBounds(20,110,30,30);
b6.setBounds(60,110,30,30);
b7.setBounds(100,110,30,30);
b8.setBounds(140,110,30,30);
b9.setBounds(20,150,30,30);
b0.setBounds(60,150,30,30);
be.setBounds(100,150,70,30);
ba.setBounds(20,190,30,30);
bs.setBounds(60,190,30,30);
bm.setBounds(100,190,30,30);
bd.setBounds(140,190,30,30);
bsi.setBounds(20,230,30,30);
bc.setBounds(60,230,30,30);
bt.setBounds(100,230,30,30);
bdot.setBounds(140,230,30,30);
bon.setBounds(140,270,30,30);
boff.setBounds(20,270,30,30);

f.add(t1);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(b0);
f.add(ba);
f.add(bs);
f.add(bm);
f.add(bd);
f.add(be);
f.add(bsi);
f.add(bc);
f.add(bt);
f.add(bdot);
f.add(bon);
f.add(boff);

b0.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
ba.addActionListener(this);
bs.addActionListener(this);
bm.addActionListener(this);
bd.addActionListener(this);
be.addActionListener(this);
bsi.addActionListener(this);
bc.addActionListener(this);
bt.addActionListener(this);
bdot.addActionListener(this);
bon.addActionListener(this);
boff.addActionListener(this);


f.setSize(205,330);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();
if(s.equals("sin"))
{
double d=Double.parseDouble(t1.getText());
double dd=Math.sin(d);
t1.setText(Double.toString(dd));
}
else
if(s.equals("cos"))
{
double d=Double.parseDouble(t1.getText());
double dd=Math.cos(d);
t1.setText(Double.toString(dd));
}
else if(s.equals("+"))
{
a=Integer.parseInt(t1.getText());

t1.setText("");
opt="+";
}
else if(s.equals("-"))
{
a=Integer.parseInt(t1.getText());
t1.setText("");
opt="-";
}
else if(s.equals("*"))
{
a=Integer.parseInt(t1.getText());
t1.setText("");
opt="*";
}
else if(s.equals("/"))
{
a=Integer.parseInt(t1.getText());
t1.setText("");
opt="/";
}
else if(s.equals("="))
{
	b=Integer.parseInt(t1.getText());
	if(opt.equals("+"))
		c=a+b;
	else if(opt.equals("-"))
		c=a-b;
	else if(opt.equals("*"))
		c=a*b;
	else if(opt.equals("/"))
		c=a/b;
	t1.setText(Integer.toString(c));
}
else
{
	t1.setText(t1.getText()+s);
}
}
public static void main(String ar[])
{
calc c=new calc();
}
}




