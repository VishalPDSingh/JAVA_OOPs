package ch3_Constructor;

class Customer {
    private int cId;
    private String cName;
    private long cNum;

    public Customer(int cId, String cName, long cNum) {
        this.cId = cId;
        this.cName = cName;
        this.cNum = cNum;
    }

    public Customer()
    {
        cId = 102;
        cName = "bbb";
        cNum = 52525;
    }
    public int getId() {
        return cId;
    }

    public String getName() {
        return cName;
    }

    public long getNum() {
        return cNum;
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Customer c1 = new Customer(101, "aaaa", 95000);

        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getNum());

        Customer c2 = new Customer();

        System.out.println(c2.getId());
        System.out.println(c2.getName());
        System.out.println(c2.getNum());
    }
}
