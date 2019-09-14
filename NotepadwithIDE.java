import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.reflect.*;
import java.io.*;
import java.net.*;
class note implements ActionListener
{	
	Frame f1;
	Label l1,l2,l3,l4,l5;
	TextField t1,t2;
	TextArea ta1,ta2,ta3;
	Button b1,b2;
	String s;
	String nglobal="";
	int a,i=0,nlen;
	int swag=0,tang=0;
	Runtime rt;
	String global="";
	int len;
	JFrame f;
	MenuBar mb;
         	String p="";
	JPanel panel;
	JLabel label;
	TextArea ta;
	Menu fi,ed,fo,fon,co,st,si,go,help; 
	MenuItem ne,op,sa,sa1,ex,cu,cp,pa,it,pl,te,bo,tw,th,bac,foc,com,run,mt;
	
note()
{
f= new JFrame("Notepad");
panel=new JPanel();
label=new JLabel();
ta=new TextArea();
mb=new MenuBar();
fi=new Menu("file");
help=new Menu("Help");
ed=new Menu("edit");
fo=new Menu("Format");
go=new Menu("GO");
fon=new Menu("font");
co=new Menu("color");
st=new Menu("Style");
si=new Menu("Size");
ne =new MenuItem("New ");
mt=new MenuItem("Java Help");
op =new MenuItem("Open");
sa =new MenuItem("save As");
sa1=new MenuItem("save");
ex =new MenuItem("exit");
cu =new MenuItem("cut");
cp =new MenuItem("copy");
pa =new MenuItem("paste");
bo =new MenuItem("bold");
it =new MenuItem("italic");
pl =new MenuItem("plain");
te =new MenuItem("10");
tw =new MenuItem("30");
th =new MenuItem("50");
bac =new MenuItem("back");
foc=new MenuItem("fore");
com=new MenuItem("Compile");
run=new MenuItem("Run");
fi.add(ne);
fi.add(op);
fi.add(sa1);
fi.add(sa);
fi.add(ex);
help.add(mt);
ed.add(cu);
ed.add(cp);
ed.add(pa);
st.add(bo);
st.add(it);
st.add(pl);
si.add(te);
si.add(tw);
si.add(th);
fon.add(st);
fon.add(si);
co.add(bac);
co.add(foc);
fo.add(fon);
fo.add(co);
mb.add(fi);
mb.add(ed);
mb.add(fo);
mb.add(go);
mb.add(help);
go.add(com);
go.add(run);
f.setMenuBar(mb);
f.add(ta); 
panel.add(label);
f.add(panel,BorderLayout.SOUTH);
ne.addActionListener(this);
op.addActionListener(this);
sa.addActionListener(this);
sa1.addActionListener(this);
ex.addActionListener(this);
cu.addActionListener(this);
cp.addActionListener(this);
pa.addActionListener(this);
bo.addActionListener(this);
it.addActionListener(this);
pl.addActionListener(this);
te.addActionListener(this);
tw.addActionListener(this);
th.addActionListener(this);
bac.addActionListener(this);
foc.addActionListener(this);
com.addActionListener(this);
run.addActionListener(this);
mt.addActionListener(this);
f1=new Frame("java Help");
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
b2=new Button("close");
f1.setLayout(null);
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
b2.setBounds(200,150,40,45);
f1.add(l1);
f1.add(l2);
f1.add(l3);
f1.add(l4);
f1.add(l5);
f1.add(ta1);
f1.add(ta2);
f1.add(t1);
f1.add(t2);
f1.add(ta3);
f1.add(b1);
f1.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
f1.setSize(1000,800);
f1.setVisible(false);
f.setSize(1000,800);
label.setPreferredSize(new Dimension(800,200));
f.setVisible(true);
panel.setVisible(false);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==ne)
{
JFileChooser jw=new JFileChooser();
jw.showSaveDialog(f);
global=jw.getSelectedFile().getName();
nlen=global.length();
nglobal=global.substring(0,nlen-5);
String ss="class "+nglobal+"\n { \n public static void main(String ar[])\n{ \n } \n}";
try
{
FileOutputStream fi1=new FileOutputStream(global);
byte b[]=ss.getBytes();
fi1.write(b);
FileInputStream go=new FileInputStream(global);
String sti2="";
while((i=go.read())!=-1)
{
sti2=sti2+((char)i);
ta.setText(sti2);
}
}catch(Exception q)
{
System.out.print("OPen Exception"+q);
}
}
else
if(e.getSource()==op)
{
if(p=="")
{
JFileChooser jc=new JFileChooser();
jc.showOpenDialog(f);
try
{
FileInputStream fi1=new FileInputStream(jc.getSelectedFile());
global=jc.getSelectedFile().getName();
len=global.length();
nglobal=global.substring(0,len-5);
String sti1="";
while((i=fi1.read())!=-1)
{
sti1=sti1+((char)i);
ta.setText(sti1);
}
}catch(Exception q)
{
System.out.print("OPen Exception"+q);
}
}
else
method1();
}
else if(e.getSource()==sa1)
{
if(global=="")
{
method1();
}
else
{
String s=ta.getText();
try{
FileOutputStream fou=new FileOutputStream(global);
byte[] b=s.getBytes();
fou.write(b);
}catch(Exception d)
{
System.out.println(d);
}
}
}
else
if(e.getSource()==sa )
{
JFileChooser jc=new JFileChooser();
jc.showSaveDialog(f);
String s=ta.getText();
try{
FileOutputStream fou=new FileOutputStream(jc.getSelectedFile().getName());
global=jc.getSelectedFile().getName();
len=global.length();
byte[] b=s.getBytes();
fou.write(b);
}catch(Exception d)
{
System.out.println(d);
}
}
else
if(e.getSource()==com)
{
if(global=="")
{
method1();
}
else
{
swag=1;
panel.setVisible(true);
panel.setBackground(Color.white);
try
{
rt=Runtime.getRuntime();
Process p=rt.exec("javac  "+global);
InputStream ir=p.getErrorStream();
int i=0,c=0;
String s="";
while((i=ir.read())!=-1)
{
c=c+1;
s=s+String.valueOf((char)i);
}
if(c!=0)
{
label.setText(s);
}
}catch(Exception q)
{
label.setText("Error Compile"+q);
}
}
}
else
if(e.getSource()==mt)
{
f1.setVisible(true);
}
else
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
else
if(e.getSource()==b2)
{
f1.setVisible(false);
}
else 
if(e.getSource()==run)
{
if(swag==0)
{
panel.setVisible(true);
panel.setBackground(Color.white);
label.setText("Please Compile First");
}
else
{
try
{
Process p1=rt.exec("java "+nglobal);
InputStream ir1=p1.getErrorStream();
int i1=0,c1=0;
String s1="";
while((i1=ir1.read())!=-1)
{
c1=c1+1;
s1=s1+String.valueOf((char)i1);
}
if(c1!=0)
{
label.setText(s1);
}
else
{
InputStream ir2=p1.getInputStream();
int i2=0;
String s2="";
while((i2=ir2.read())!=-1)
{
s2=s2+String.valueOf((char)i2);
}
label.setText(s2);
}
}catch(Exception z1)
{
label.setText("Error in Run");
}
}
}
else
if(e.getSource()==ex)
{
System.exit(0);
}
else 
if(e.getSource()==cu)
{
s= ta.getSelectedText();
int i=ta.getSelectionStart();
int j=ta.getSelectionEnd();
ta.replaceRange("",i,j);
}
else 
if(e.getSource()==cp)
{
s= ta.getSelectedText();
}
else 
if(e.getSource()==pa)
{
ta.insert(s,ta.getSelectionStart());
}
else 
if(e.getSource()==bo)
{
Font fo=new Font ("Arial",Font.BOLD,20);
ta.setFont(fo);
a=1;
}
if(e.getSource()==it)
{
Font fo=new Font ("Arial",Font.ITALIC,20);
ta.setFont(fo);
a=2;
}
if(e.getSource()==pl)
{
Font fo=new Font ("Arial",Font.PLAIN,20);
ta.setFont(fo);
a=3;
}
if(e.getSource()==te)
{	
if(a==1)
{
Font fo=new Font ("Arial",Font.BOLD,10);
ta.setFont(fo);
}
else if(a==2)
{
Font fo=new Font ("Arial",Font.ITALIC,10);
ta.setFont(fo);
}
else if(a==3)
{
Font fo=new Font ("Arial",Font.PLAIN,10);
ta.setFont(fo);
}
}
if(e.getSource()==tw)
{
if(a==1)
{
Font fo=new Font ("Arial",Font.BOLD,30);
ta.setFont(fo);
}
else if(a==2)
{
Font fo=new Font ("Arial",Font.ITALIC,30);
ta.setFont(fo);
}
else if(a==3)
{
Font fo=new Font ("Arial",Font.PLAIN,30);
ta.setFont(fo);
}
}
if(e.getSource()==th)
{
if(a==1)
{
Font fo=new Font ("Arial",Font.BOLD,50);
ta.setFont(fo);
}
else if(a==2)
{
Font fo=new Font ("Arial",Font.ITALIC,50);
ta.setFont(fo);
}
else if(a==3)
{
Font fo=new Font ("Arial",Font.PLAIN,50);
ta.setFont(fo);
}
}
if(e.getSource()==bac)
{
JColorChooser jc = new JColorChooser();
Color c =jc.showDialog(f,"base color",Color.red);
ta.setBackground(c);
}
if(e.getSource()==foc)
{
JColorChooser jc = new JColorChooser();
Color c =jc.showDialog(f,"fore color",Color.yellow);
ta.setForeground(c);
}
}
public void method1()
{
JFileChooser jc=new JFileChooser();
jc.showSaveDialog(f);
String s=ta.getText();
try{
FileOutputStream fou=new FileOutputStream(global);
global=jc.getSelectedFile().getName();
len=global.length();
byte[] b=s.getBytes();
fou.write(b);
}catch(Exception d)
{
System.out.println(d);
}
}
public static void main(String ar[])
{
note n=new note();
}
}
		