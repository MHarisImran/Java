import java.util.Date;

public class Square {
    private int Length;
    private Date Date_time;

    public Square(){
        this.Length = 0;
        this.Date_time = new Date();
    }

    public Square(int Length){
        this.Length = Length;
        this.Date_time = new Date();
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    public Date getDate_time() {
        return Date_time;
    }

    public void setDate_time(Date date_time) {
        Date_time = date_time;
    }

    public int getArea(){
        return this.Length*this.Length;
    }

    @Override
    public String toString() {
        return "The length of the sides are:" + this.Length + "\n Area of the Square:" +getArea() + "\n Date & Time of creation:" +this.Date_time;
    }
}
