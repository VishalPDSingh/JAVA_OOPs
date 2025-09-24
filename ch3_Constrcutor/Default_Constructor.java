package ch3_Constrcutor;

class Cat
{
    private String name;
    private int age;

    public Cat()
    {
        this.name = "Unknown";
        this.age = 25;
    }

    void disp()
    {
        System.out.println("Name is "+name);
        System.out.println("Age is"+age);
    }
}


public class Default_Constructor {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.disp();
    }
}
