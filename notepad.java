import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class note implements ActionListener
{	
String s;
int a;
	Frame f;
	MenuBar mb;
	TextArea ta;
	Menu fi,ed,fo,fon,co,st,si;
	MenuItem ne,op,sa,ex,cu,cp,pa,it,pl,te,bo,tw,th,bac,foc;
note()
{
f= new Frame("Notepad");
ta=new TextArea();
mb=new MenuBar();
fi=new Menu("file");
ed=new Menu("edit");
fo=new Menu("Format");
fon=new Menu("font");
co=new Menu("color");
st=new Menu("Style");
si=new Menu("Size");
ne =new MenuItem("New ");
op =new MenuItem("Open");
sa =new MenuItem("save");
ex =new MenuItem("exit");
cu =new MenuItem("cut");
cp =new MenuItem("copy");
pa =new MenuItem("paste");
bo =new MenuItem("bold");
it =new MenuItem("italic");
pl =new MenuItem("plain");
te =new MenuItem("10");
tw =new MenuItem("20");
th =new MenuItem("30");
bac =new MenuItem("back");
foc=new MenuItem("fore");

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

f.setMenuBar(mb);
f.add(ta);
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
f.setSize(800,600);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==ne)
{
ta.setText("");
}
else
if(e.getSource()==op)
{
JFileChooser jc=new JFileChooser();
jc.showOpenDialog(f);
}
else
if(e.getSource()==sa)
{
JFileChooser jc=new JFileChooser();
jc.showSaveDialog(f);
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
Font fo=new Font ("Arial",Font.BOLD,20);
ta.setFont(fo);
}
else if(a==2)
{
Font fo=new Font ("Arial",Font.ITALIC,20);
ta.setFont(fo);
}
else if(a==3)
{
Font fo=new Font ("Arial",Font.PLAIN,20);
ta.setFont(fo);
}

}
if(e.getSource()==th)
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
note n=new note();
}
}
		