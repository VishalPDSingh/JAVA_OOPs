package ch2_Encapsulation;

class Circle
{
    private float rad;

    public void setRad(float rad)
    {
        this.rad = rad;
    }

    public float getRad()
    {
        return rad;
    }

    // method
    public void calculateArea()
    {
      //  this.rad = rad;
        int area = (int)(Math.PI*rad*rad);
        System.out.println(area);
    }

    public void perimeterCirlce()
    {
      // this.rad = rad;
       int perimeter = (int)(2*Math.PI*rad);
       System.out.println(perimeter);
    }
}

public class CircleDemo4 {
    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        c1.setRad(4);
        System.out.println(c1.getRad());
        c1.calculateArea();
        c1.perimeterCirlce();
    }
}
