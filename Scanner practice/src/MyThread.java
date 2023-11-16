import java.util.Scanner;
import java.lang.Thread;

public class MyThread extends Thread{
    int num;
    int fic = 1;

    MyThread(){

    }

    void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        num = scanner.nextInt();

    }
    @Override
    public void run(){
        for (int i=1; i<=num; i++ ){
            fic= fic * i;
        }
        System.out.println("the fictorial is:"+ fic );
    }

}
