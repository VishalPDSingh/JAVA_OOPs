package ch2_Encapsulation;

//import java.util.Scanner;

class BanckAccount
{
    private int acccountNum;
    private String accountName;
    private int blance;

    // setter
    public void setAccountNum(int acccountNum, String acccountName, int blance)
    {
        this.acccountNum = acccountNum;
        this.accountName = acccountName;
        this.blance = blance;
    }
     public void deposit()
    {
        System.out.println(blance);
    }

    // getter
    public int getAccountNum()
    {
        return acccountNum;
    }

    public String getAccountName()
    {
        return accountName;
    }

    public int getBlance()
    {
         return blance;
    }

    
    public void withdraw(int amm)
    {
        blance = blance-amm;
        System.out.println(blance);
    }
}

public class BanckAccountDemo5 {
    public static void main(String[] args) {
        
        BanckAccount b1 = new BanckAccount();
        b1.setAccountNum(123, "ABCR", 1000);
        System.out.println(b1.getBlance());
        b1.deposit();
        b1.withdraw(500);
    }
}
