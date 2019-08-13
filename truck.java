import java.io.*;
import java.awt.*;
import java.awt.event.*;
class can extends Canvas
{
int l,l1=45,l2,l3=50,l4=350,l5=350,l6=355,l7=365,l8=350 ,l9=335 ,l10=370 ,l11=385,x1,x2;
public void paint (Graphics g)
{
g.drawOval(l,110,30,30);
g.drawOval(l1,110,30,30);
g.drawRect(l2,90,50,30);
g.drawRect(l3,80,30,45);

g.drawOval(l4,75,20,20);
g.drawRect(l5,95,20,30);
g.drawLine(l6,125,l6,145);
g.drawLine(l7,125,l7,145);
g.drawLine(l8,104,l9,80);
g.drawLine(l10,104,l11,80);

g.drawString("Accident occured",x1,x2);
}
}
class pqr implements Runnable
{
Frame f;
can c;
pqr()
{
f=new Frame("Truck");
c=new can();
f.add(c);
f.setSize(400,420);
f.setVisible(true);
}
public void run()
{
for(int i=1;i<=134;i++)
{
if(Thread.currentThread().getName().equals("one"))
{
c.l=c.l + 1;
c.l1=c.l1 + 1;
c.l2=c.l2 + 1;
c.l3=c.l3 + 1;
}
else
if(Thread.currentThread().getName().equals("two"))
{
c.l4=c.l4 -1;
c.l5=c.l5 -1;
c.l6=c.l6 -1;
c.l7=c.l7 -1;
c.l8=c.l8-1;
c.l9=c.l9-1;
c.l10=c.l10-1;
c.l11=c.l11-1;
}
if(i==134)
{
c.x1=150;
c.x2=70;

}
try
{
Thread.sleep(10);
}catch(Exception e)
{
System.out.print("Exception");
}
c.repaint();
}

}
public static void main(String ar[])
{
pqr p1=new pqr();
Thread t1=new Thread(p1,"one");
Thread t2=new Thread(p1,"two");
t1.start();
t2.start();

}
}