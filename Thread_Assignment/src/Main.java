public class Main {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("Even", true);
        MyThread mt2 = new MyThread("Odd", false);

        mt1.start();
        mt2.start();

    }
}