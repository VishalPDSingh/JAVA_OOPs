package ch4_Inheritance;


class Demo1
{
    int a = 100;
    int b = 200;

    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
}

class Demo2 extends Demo1
{
    
}

public class SingleClassInheritance {
    public static void main(String[] args) {
        
        Demo2 d1 = new Demo2();
        d1.disp();
    }
}
