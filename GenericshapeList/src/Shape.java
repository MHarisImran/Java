public abstract class Shape {
    public Shape(){

    }

    public abstract String draw();
    public abstract String getArea();

    @Override
    public String toString() {
        return draw() + "\n" + getArea() + "\n";
    }
}
