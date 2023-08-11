public class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(){
        super();
        this.base = 0;
        this.height = 0;
    }
    public Triangle(double base, double height){
        super();
        this.base = base;
        this.height = height;
    }
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
    public String draw(){
        return "This is a Triangle";
    }
    public String getArea() {
        return "Area of the Triangle is: " + 0.5 * this.base * this.height;
    }
}