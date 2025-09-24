package ch2_Encapsulation;

class Person
{
    private String name;
    private float age;
    private String country;

    // Setter to set the value
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(float age)
    {
        this.age = age;
    }

    public void setCountary(String country)
    {
        this.country = country;
    }

    // getter
    public String getName()
    {
        return name;
    }

    public float getAge()
    {
        return age;
    }

    public String getContry()
    {
        return country;
    }
}

public class EncapsulationDemo1 {
    public static void main(String[] args) {
        // object 
        Person s1 = new Person();
        s1.setName("Vishal Singh");
        s1.setAge(22);
        s1.setCountary("India");

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getContry());

        Person s2 = new Person();
        s2.setName("Muskan Singh");
        s2.setAge(21.5f);
        s2.setCountary("Nepal");

        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getContry());
    }
}
