package ch3_Constrcutor;

class Dog {
    private String name;
    private String colour;

    public Dog(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    void disp() {
        System.out.println("Name is " + name);
        System.out.println("Colour is " + colour);
    }
}

public class Parametrized_Constuctor {
    public static void main(String[] args) {
        Dog d1 = new Dog("Tommy", "Black");
        d1.disp();
    }
}
