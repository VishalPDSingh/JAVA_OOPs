package ch_Multithreading;

class Test extends Thread // step 1
{
    public void run() // step 2
    {

    }
}

public class MultithreadingUsing_Class1 {
    public static void main(String[] args) {
        
        Test t = new Test(); // step 3
        t.start(); // step 4
    }
}
