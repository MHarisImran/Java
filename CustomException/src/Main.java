public class Main {

    public static void main(String[] args) {
        int[] numbers = {10,25,30,45,50};
        for(int x:numbers) {
            try {
                myfunc(x);
            } catch (MySpecialNumberException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Processed Number: " + x);
            }

        }
    }
    public static void myfunc(int x) throws MySpecialNumberException{
        if(x==10||x==20||x==30){
            throw new MySpecialNumberException("This number cannot be used as parameter");
        }

    }
}