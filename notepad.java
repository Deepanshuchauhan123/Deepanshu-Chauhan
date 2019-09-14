import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
class notepad implements ActionListener
{	
	String s;
	int a,i=0;
	int hang=0,swag=0,tang=0;
	Runtime rt;
	String global="";
	int len;
	JFrame f;
	MenuBar mb;
         	String p="";
	JPanel panel;
	JLabel label;
	TextArea ta;
	Menu fi,ed,fo,fon,co,st,si,go;
	MenuItem ne,op,sa,ex,cu,cp,pa,it,pl,te,bo,tw,th,bac,foc,com,run;
notepad()
{
f= new JFrame("Notepad");
panel=new JPanel();
label=new JLabel();
ta=new TextArea();
mb=new MenuBar();
fi=new Menu("file");
ed=new Menu("edit");
fo=new Menu("Format");
go=new Menu("GO");
fon=new Menu("font");
co=new Menu("color");
st=new Menu("Style");
si=new Menu("Size");
ne =new MenuItem("New ");
op =new MenuItem("Open");
sa =new MenuItem("save As");
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
fi.add(sa);
fi.add(ex);
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
go.add(com);
go.add(run);
f.setMenuBar(mb);
f.add(ta); 
panel.add(label);
f.add(panel,BorderLayout.SOUTH);
ne.addActionListener(this);
op.addActionListener(this);
sa.addActionListener(this);
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
f.setSize(1000,800);
label.setPreferredSize(new Dimension(800,200));
f.setVisible(true);
panel.setVisible(false);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==ne)
{
if((global)=="")
{
hang=1;
}
else
{
ta.setText("");
global="";
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
hang=1;
}
else
if(e.getSource()==sa || hang==1)
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
hang=0;
}
else
if(e.getSource()==com)
{
if(global=="")
{
hang=1;
}
else
{
swag=1;
panel.setSize(1000,200);
panel.setVisible(true);
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
label.setText("Error"+q);
}
hang=0;
}
}
else 
if(e.getSource()==run)
{
if(swag==0)
{
label.setText("Please Compile First");
}
else
{
try
{
Process p1=rt.exec("java "+global.substring(0,len-5));
InputStream ir1=p1.getErrorStream();
int i1=0,c1=0;
String s1="";
while((i1=ir1.read())!=-1)
{c1=c1+1;
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
label.setText("Error");
}
}
global="";
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
public static void main(String ar[])
{
notepad n=new notepad();
}
}
		