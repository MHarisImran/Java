public class Square extends Shape{
    private double lengthofSide;
    public Square(){
        super();
        this.lengthofSide = 0;
    }
    public Square(double lengthofSide){
        super();
        this.lengthofSide = lengthofSide;
    }
    public double getLengthofSide() {
        return lengthofSide;
    }
    public String draw(){
        return "This is a Square";
    }
    public String getArea() {
        return "Area of the Square is: "+ this.lengthofSide*this.lengthofSide;
    }

}