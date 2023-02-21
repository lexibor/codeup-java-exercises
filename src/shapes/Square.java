package shapes;

public class Square extends Quadrilateral
{
    protected double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }

//    private int side;
//
//    public Square(int side)
//    {
//       super(side, side);
//
//       this.side = side;
//    }
//
//    public int getArea()
//    {
//        return side * side;
//    }
//
//    public int getPerimeter()
//    {
//        return side * 4;
//    }

}
