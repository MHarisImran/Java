public class Rectangle extends Shape{

    private final int Length;
    private final int Breath;

    public Rectangle(){
        this.Length=0;
        this.Breath=0;
    }

    public Rectangle(int Length, int Breath){
        this.Length=Length;
        this.Breath=Breath;
    }

    public int getLength() {
        return Length;
    }

    public int getBreath() {
        return Breath;
    }

    public String draw(){
        return "This is a Rectangle";
    }

    public String getArea(){
        return "The area is :" + this.Length*this.Breath;
    }

}
