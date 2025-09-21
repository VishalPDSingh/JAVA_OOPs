package ch2_Encapsulation;

class Customer
{
    private int cId;
    private String cName;
    private long cNum;

    public void setData(int cId, String cName, long cNum)
    {
        this.cId = cId;
        this.cName = cName;
        this.cNum = cNum;
    }

    public int getId()
    {
        return cId;
    }

    public String getName()
    {
        return cName;
    }

    public long getNum()
    {
        return cNum;
    }
}

public class Demothis {
     public static void main(String[] args) {
        
        Customer c1 = new Customer();
        c1.setData(10, "aaaa", 132654);
        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getNum());
    }
}
