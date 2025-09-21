package ch3_Constructor;

class Customer {
    private int cId;
    private String cName;
    private long cNum;

    public Customer()
    {
        
    }


    public Customer(int cId, String cName, long cNum) {
       this();
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




public class Constructor_Chaining {
    public static void main(String[] args) {
     
        Customer c1 = new Customer(101, "aaaa", 95000);

        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getNum());
    }
}
