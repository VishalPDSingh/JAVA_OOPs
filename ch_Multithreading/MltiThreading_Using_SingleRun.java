package ch_Multithreading;

import java.util.*;
class Demo implements Runnable
{
    public void run()
    {
        Thread t = Thread.currentThread();
        String s = t.getName();
        if(s.equals("ADD")== true)
        {
            add();
        }
        else if(s.equals("CHAR") == true)
        {
            charPrint();
        }
    }

      public void add()
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
        System.out.println("-------------------------------------------");
        sc.close();
    }

      public void charPrint()
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


public class MltiThreading_Using_SingleRun {
    public static void main(String[] args) {
        
        Demo d = new Demo();

        Thread t = new Thread(d);
        Thread t1 = new Thread(d);
        t.setName("ADD");
        t1.setName("CHAR");
        t.start();
        t1.start();

    }
}
