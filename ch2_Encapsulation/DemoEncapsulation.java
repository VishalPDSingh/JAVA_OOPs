package ch2_Encapsulation;

class BankAccount
{
    private int bal;

    // setter and getter
    public void setData(int amount)
    {
       if(amount > 0)
       {
        bal = amount;
       }else
       {
        bal = 0;
       }
    }

    public int getData()
    {
        return bal;
    }
}

public class DemoEncapsulation {
    public static void main(String[] args) {
        
        BankAccount ba = new BankAccount();

        // Contorled Access
        ba.setData(-10000);
        System.out.println(ba.getData());

        // Direct Access the Account
        // ba.bal = 111000;
        // System.out.println(ba.bal);
    }
}
