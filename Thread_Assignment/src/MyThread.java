public class MyThread extends Thread{
    private boolean isEven;
    public MyThread(String name, boolean isEven){
        super(name);
        this.isEven = isEven;
    }

    @Override
    public void run() {
        if (isEven){
            for(int i=0; i<100; i+=2){
                System.out.println(i);
            }
        }
        else {
            for(int i=1; i<100; i+=2) {
                System.out.println(i);
            }
        }
    }
}
