class abc implements Runnable
{
public void run()
{
if(Thread.currentThread().isDaemon())

System.out.println(Thread.currentThread().getName()+"Daemon run \n");
else
System.out.println(Thread.currentThread().getName()+"main thread run \n");
}
}
class aa
{
public static void main(String ar[])
{
abc a1=new abc();
Thread t1=new Thread(a1,"One ");
Thread t2=new Thread(a1,"Two ");
Thread t3=new Thread(a1,"Three ");
t1.setDaemon(true);
t1.start();

t2.start();
t3.start();
}
}