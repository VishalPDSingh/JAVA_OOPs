package ch_Multithreading;

class Test extends Thread
{
    public void run()
    {
     //   Thread.currentThread().setName("Vishal Singh");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread task");
    }
}


public class NameingThread_Method {
    public static void main(String[] args) {
        
        // System.out.println("Hello World");

        //  System.out.println(Thread.currentThread().getName()); // this method name of cureent thread 

        //  Thread.currentThread().setName("Vishal"); // change the name of thread 
        //  System.out.println(Thread.currentThread().getName());
        //  System.out.println(10/0 );


        Test t = new Test();
        t.start();
        System.out.println(Thread.currentThread().getName());

        Test t2 = new Test();
        t2.start();

        System.out.println(Thread.currentThread().isAlive());
        System.out.println(t.isAlive());
    }
}
