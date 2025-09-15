package ch3_Constructor;


class Customer
{
    private int cId;
    private String cName;
    private long cNum;


    public Customer()
    {
        cId = 5;
        cName = "Muskan";
        cNum = 535353;
    }
    public Customer(int cId, String cName, long cNum)
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


public class Demo1 {
    public static void main(String[] args) {
        


        Customer c1 = new Customer(5,"Vishal",566555);
       // c1.setData(2, "Vishal", 654);

        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getNum());

        System.out.println("------------------------------------------");
        Customer c2 = new Customer();

         System.out.println(c2.getId());
        System.out.println(c2.getName());
        System.out.println(c2.getNum());
    }
}
