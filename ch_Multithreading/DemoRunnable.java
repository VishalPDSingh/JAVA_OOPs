package ch_Multithreading;

import java.util.*;
class Demo1 implements Runnable
{
     public void run()
    {
        System.out.println("Addition Work Started");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a = sc.nextInt();

        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        int c = a+b;
        System.out.println("Sum is "+c);
        System.out.println("Work is completed: ");
        sc.close();
    }
}

class Demo2 implements Runnable
{
     public void run()
    {
        System.out.println("Printing the charcter");

        for(char i='a'; i<='m'; i++)
        {
            System.out.println(i);
            try
            {
               Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Something went wrong");
            }
        }
        System.out.println("Work is completed: ");
    }
}

class Demo3 implements Runnable
{
    public void run()
    {
        System.out.println("Print counting ");

        for(int i=1; i<=20; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Some thing went wrong");
            }
        }
        System.out.println("Work is complted : ");
    }
}

public class DemoRunnable {
    public static void main(String[] args) {

        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d3);

        t1.start();
        t2.start();
        t3.start();
    }
}
