import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class can extends Canvas
{
	int v,l,t,w,h,x1,x2,y1,y2;
	public void update(Graphics g)
	{
		if(v==0)
		{
		}
		else if(v==1)
		{
		g.drawRect(l,t,w,h);
		}
		else if(v==2)
		{
		g.drawOval(l,t,w,h);
		}
		else if(v==3)
		{
		g.drawLine(x1,y1,x2,y2);
		}
	}
}
class paint implements ActionListener,MouseListener
{
	Frame f;
	Panel p;
	Button b1,b2,b3;
	can c;
	paint()
	{
	f=new Frame("Paint Brush");
	p=new Panel();
	b1=new Button("R");
	b2=new Button("O");
	b3=new Button("L");
	
	p.setLayout(new GridLayout(3,1));
	p.add(b1);
	p.add(b2);
	p.add(b3);
	
	c=new can();
	f.add(p, BorderLayout.WEST);
	f.add(c);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
	c.addMouseListener(this);
	f.setSize(500,500);
	f.setVisible(true);
}

public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==b1)
	c.v=1;
	else if(e.getSource()==b2)
	c.v=2;
	else if(e.getSource()==b3)
	c.v=3;
	}

	
	
public void mousePressed(MouseEvent e)
	{
	
	c.l=c.x1=e.getX();
	
	c.t=c.y1=e.getY();
	
	}
	public void mouseReleased(MouseEvent e)
	{
	
	c.x2=e.getX();
	c.y2=e.getY();


	if(c.x1<c.x2&&c.y1<c.y2)
	{
	c.w=c.x2-c.l;
	c.h=c.y2-c.t;
	c.l=c.x1;
	c.t=c.y1;
	}else
	if(c.x1>c.x2&&c.y1>c.y2)
	{
	c.w=c.l -c.x2;
	c.h=c.t-c.y2;
	c.l=c.x2;
	c.t=c.y2;
	}
	if(c.x1>c.x2&&c.y1<c.y2)
	{
	c.w=c.l-c.x2;
	c.h=c.y2-c.t;
	c.l=c.x2;
	c.t=c.y1;
	}
	if(c.x1<c.x2&&c.y1>c.y2)
	{
	c.w=c.x2-c.l ;
	c.h=c.t-c.y2;
	c.l=c.x1;
	c.t=c.y2;
	}
	
	c.repaint();
	}
	public void mouseClicked(MouseEvent e)
	{
	}
	public void mouseEntered(MouseEvent e)
	{
	}
	public void mouseExited(MouseEvent e)
	{
	}


public static void main(String ar[])
{  paint p=new paint();
}
}	