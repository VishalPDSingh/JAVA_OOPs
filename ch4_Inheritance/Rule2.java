package ch4_Inheritance;

class BankAccount
{
    protected int accNum = 12358;
    protected int pin = 9999;
}

class Hacker extends BankAccount
{
    void dis()
    {
        System.out.println(accNum);
        System.out.println(pin);
    }

    void changeData()
    {
        accNum = 4245;
        pin = 1235;

    }
}


public class Rule2 {
    public static void main(String[] args) {
        
        Hacker h = new Hacker();
        h.dis();

        h.changeData();
        h.dis();
    }
}
