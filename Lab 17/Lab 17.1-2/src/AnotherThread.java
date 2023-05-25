public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from " + currentThread().getName());
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Another thread wake me up");
            return;
        }
        System.out.println("3s have passed and Im awake");
    }
}
