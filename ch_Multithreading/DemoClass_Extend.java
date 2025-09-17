package ch_Multithreading;

import java.util.Scanner;

class Demo1 extends Thread
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

class Demo2 extends Thread
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

class Demo3 extends Thread
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

public class DemoClass_Extend {
    public static void main(String[] args) {

        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();

        d1.start();
        d2.start();
        d3.start();
    }
}
