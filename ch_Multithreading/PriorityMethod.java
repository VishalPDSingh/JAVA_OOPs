package ch_Multithreading;

class Demo extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("chile thread");
    }
}



public class PriorityMethod {
    public static void main(String[] args) {
        // JVM provide the Priorites to each thread 

        // 1 = MIN_Prioriy
        // 5 = NOR_Priority
        // 10 = MAX_Priority

        System.out.println(Thread.currentThread().getPriority()); // 5

        Demo d = new Demo();
      System.out.println(d.getPriority()); // 5
      d.setPriority(8);
      d.start();
    }
}
