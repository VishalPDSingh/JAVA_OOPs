package ch2_Encapsulation;

class Customer
{
    private int cId;
    private String cName;
    private long cNum;

    public void setData(int x, String name, long no)
    {
        cId = x;
        cName = name;
        cNum = no;
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

public class Website {
    public static void main(String[] args) {
        
        Customer c1 = new Customer();
        c1.setData(2, "Vishal", 654);

        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getNum());
    }
}
