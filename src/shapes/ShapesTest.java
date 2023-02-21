package shapes;

public class ShapesTest
{
    public static void main(String[] args)
    {

        Measurable myShape = new Square(5.5);

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
//        System.out.println(myShape.getLength());

//        Rectangle box1 = new Rectangle(5, 4);
//        Rectangle box2 = new Square(5);
//
//        System.out.println("Square Area: " + box2.getArea());
//        System.out.println("Square Perimeter: " + box2.getPerimeter());
//
//        System.out.println("Rectangle Area: " + box1.getArea());
//        System.out.println("Rectangle Perimeter: " + box1.getPerimeter());
    }
}
