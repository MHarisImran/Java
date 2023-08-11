import java.util.Date;

public abstract class Shape {
    private static int nextID = 0;
    protected final int id;
    protected Date dateTime;
    public Shape(){
        this.id = nextID++;
        this.dateTime = new Date();
    }
    public int getId(){
        return this.id;
    }
    public Date getDateTime(){
        return this.dateTime;
    }
    public abstract String getArea();
    public abstract String draw();
    @Override
    public String toString(){
        return "ID: " + this.id + "\n" +
                "Date: " + this.dateTime + "\n" +
                "Area: " + getArea() + "\n" +
                "Draw: " + draw() + "\n";

    }



}