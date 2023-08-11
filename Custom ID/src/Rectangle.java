public class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(){
        super();
        this.length = 0;
        this.width = 0;
    }
    public Rectangle(double length, double width){
        super();
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public String draw(){
        return "This is a Rectangle";
    }
    public String getArea() {
        return "Area of the Rectangle is: " + this.length * this.width;
    }
}