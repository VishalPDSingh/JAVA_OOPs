package ch_Multithreading;

class Test implements Runnable // step 1
{
    public void run() // step 2
    {

    }
}


public class MultithreadingUsing_Runnable {
    public static void main(String[] args) {
        
        Test t = new Test(); // step 3
        Thread th = new Thread(t); // step 4
        th.start(); // step 5
    }
}
