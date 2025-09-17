package ch_Multithreading;


class Demo extends Thread
{
    public void run()
    {
        System.out.println("Denmon Thread ");
    }
}

public class DemanThreadMethod {
    public static void main(String[] args) {
        
        System.out.println("Main Thread");
        Demo d = new Demo();
        d.setDaemon(true);
        d.start();
    }
}
