package ch2_Encapsulation;

class BankAccount
{
   private int bal; // only access inside the class not outside

   // setter and getter method
   public void setData(int x)
   {
     if(x>=0)
     {
        bal = x;
     }else
     {
        System.out.println("Balance is cannot be negative: ");
        System.exit(0); // The java program is closed
     }
   }

   public int getData()
   {
    return bal;
   }
}


public class Day25 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

     //   ba.bal = 100000; //Direct Access the bal
     //   System.out.println(ba.bal); 

    //    ba.bal = -100000; // Direct Access the bal
     //   System.out.println(ba.bal);


        ba.setData(-10000); // Contorled Access
        System.out.println(ba.getData()); // controled Access


    }
}
