package ch3_StaticKeyword;

class Car
{
    static double milsToKM(float miles)
    {
        return miles * 1.6;
    }
}

class Human
{
    static void avgHeartBeat()
    {

    }

    void bodyTemp()
    {

    }
}



public class Demo2 {
    public static void main(String[] args) {
        
        // Car c1 = new Car();
        // Car c2 = new Car();
        // Car c3 = new Car();

        System.out.println(Car.milsToKM(521.5f));
    }
}
