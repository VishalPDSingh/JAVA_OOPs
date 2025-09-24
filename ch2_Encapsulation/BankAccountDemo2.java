package ch2_Encapsulation;

class BankAccount
{
    private int acccountNum;
    private float blance;

    // getter
    public void setAccountNum(int acccountNum)
    {
        this.acccountNum = acccountNum;
    }

    public void setBlance(float blance)
    {
        this.blance = blance;
    }

    // getter
    public int getAccountNum()
    {
        return acccountNum;
    }

    public float getBlance()
    {
        return blance;
    }
}

public class BankAccountDemo2 {
    public static void main(String[] args) {
        
        BankAccount b1 = new BankAccount();
        b1.setAccountNum(123456);
        b1.setBlance(589745.00f);

        System.out.println(b1.getAccountNum());
        System.out.println(b1.getBlance());

        BankAccount b2 = new BankAccount();
        b2.setAccountNum(987456);
        b2.setBlance(654123);

        System.out.println(b2.getAccountNum());
        System.out.println(b2.getBlance());
    }
}
