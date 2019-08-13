import java.io.*;
import java.awt.*;
import java.awt.event.*;
class can extends Canvas
{
int l,t,l1=350,t1,l2,t2=350,l3=350,t3=350;
public void paint (Graphics g)
{
g.drawOval(l,t,30,30);
g.drawOval(l1,t1,30,30);
g.drawOval(l2,t2,30,30);
g.drawOval(l3,t3,30,30);
}
}
class abc1 implements Runnable
{
Frame f;
can c;
abc1()
{
f=new Frame("Ball");
c=new can();
f.add(c);
f.setSize(400,420);
f.setVisible(true);
}
public void run()
{	int flag=0;
for(int i=1;i<=175;i++)
{
if(flag==0)
{
if(Thread.currentThread().getName().equals("one"))
{
c.l=c.l + 1;
c.t=c.t + 1;
c.l1=c.l1 - 1;
c.t1=c.t1 + 1;
c.l2=c.l2 + 1;
c.t2=c.t2 - 1;
c.l3=c.l3 - 1;
c.t3=c.t3 - 1;
if(i==175)
{
i=1;
flag=1;
}
}
}
if(flag==1 )
{

c.l=c.l - 1;
c.t=c.t - 1;
c.l1=c.l1 + 1;
c.t1=c.t1 - 1;
c.l2=c.l2 - 1;
c.t2=c.t2 + 1;
c.l3=c.l3 +1;
c.t3=c.t3 + 1;
if(i==175)
{
i=1;
flag=0;
}
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
abc1 a1=new abc1();
Thread t1=new Thread(a1,"one");
t1.start();

}
}