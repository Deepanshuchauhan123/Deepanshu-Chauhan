import java.awt.*;
import java.awt.event.*;
class abc implements ItemListener
{
Frame f;
Checkbox c1,c2,c3;
TextField t1;
abc()
{
f=new Frame("Font");
c1=new Checkbox("Bold");
c2=new Checkbox("Italic");
c3=new Checkbox("Plain");

t1=new TextField("Hello");
f.setLayout(null);
c1.setBounds(12,12,30,20);
c2.setBounds(12,25,30,20);
c3.setBounds(12,45,30,20);
t1.setBounds(60,35,50,20);
f.add(c1);
f.add(c2);
f.add(c3);
f.add(t1);
c1.additemListener(this);
c2.additemListener(this);
c3.additemListener(this);
t1.additemListener(this);

f.setSize(300,400);
f.setVisible(true);
}
}
public void ItemStateChanged(itemEvent e)
{
	if(e.getSelectedText()==c1)
		{
		if(c1.getState()==true)
		
		Font f0=new Font("arial",font.bold,10);
		t1.setFont(f0);
		
		}
		else if(e.getSelectedText()==c2)
		{
		if(c2.getState()==true)
		
		Font f0=new Font("arial",font.bold,10);
		t1.setFont(f0);
		}
		else if(e.getSelectedText()==c3)
		{
		if(c3.getState()==true)
		
		Font f0=new Font("arial",font.bold,10);
		t1.setFont(f0);
		}
}
