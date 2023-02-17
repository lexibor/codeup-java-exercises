package shapes;

public class Square extends Rectangle
{
    private int side;

    public Square(int side)
    {
       super(side, side);

       this.side = side;
    }

    public int getArea()
    {
        return side * side;
    }

    public int getPerimeter()
    {
        return side * 4;
    }

}
