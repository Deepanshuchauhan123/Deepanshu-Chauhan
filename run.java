class abc extends Thread
{
abc(String s)
{
super(s);
start();
}
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println((Thread.currentThread()).getName()+"     "+i);
try
{
Thread.sleep(1000);
}catch(Exception e)
{
System.out.println("exception");
}
}
}
public static void main(String ar[])
{
abc a1=new abc("zone");
Thread t1=new Thread(a1,"one");
Thread t2=new Thread(a1,"two");
t1.start();
t2.start();
}
}