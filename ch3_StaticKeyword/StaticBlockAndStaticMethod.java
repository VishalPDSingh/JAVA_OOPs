package ch3_StaticKeyword;

public class StaticBlockAndStaticMethod {

    static
    {
        System.out.println("Python");
    }

     static
    {
        System.out.println("Python");
    }
    static void name()
    {
        System.out.println("Vishal");
    }

     static
    {
        System.out.println("Python");
    }

    public static void main(String[] args) {
        System.err.println("JAVA");
        StaticBlockAndStaticMethod.name();
    }
}
