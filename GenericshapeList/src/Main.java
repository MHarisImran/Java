public class Main {
    public static void main(String[] args) {
        SinglyList l1 = new SinglyList();
        for (int i = 0; i < 100; i++) {
            l1.addShape(new Rectangle(i, i + 1));
            l1.addShape(new Square(i + 2));
        }

        l1.traverse();
    }
}