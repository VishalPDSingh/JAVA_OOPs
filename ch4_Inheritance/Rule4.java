package ch4_Inheritance;

class Demoo1 extends Object
{
    void fun1()
    {
        System.out.println("Python");
    }
}
class Demoo2 extends Demoo1
{
    void fun2()
    {
        System.out.println("JAVA");
    }
}

class Demoo3 extends Demoo2
{
    void fun3()
    {
        System.out.println("JS");
    }
}



public class Rule4 {
    public static void main(String[] args) {
        
        Demoo3 d3 = new Demoo3();
        d3.fun1();
        d3.fun2();
        d3.fun3();
    }
}
