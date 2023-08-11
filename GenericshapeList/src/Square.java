public class Square extends Shape{
    private final int Length;


    public Square(){
        super();
        this.Length = 0;
    }

    public Square(int Length){
        super();
        this.Length = Length;

    }

    public int getLength() {
        return Length;
    }

    @Override
    public String draw() {
        return "This is a square";

    }

    @Override
    public String getArea() {
        return "The area is:" + this.Length*this.Length ;
    }
}
