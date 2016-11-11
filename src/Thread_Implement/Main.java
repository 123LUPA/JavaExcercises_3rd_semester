
package Thread_Implement;
public class Main implements Runnable{

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Main());
        Thread thread2 = new Thread(new Main());

        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {

        int pause;

        for(int i=0;i<10;i++){
            try{
                System.out.println(Thread.currentThread().getName() + "being executed");

                pause=(int)(Math.random()*3000);

                Thread.sleep(pause);
            }

            catch (InterruptedException interruptEx){
                System.out.println(interruptEx);
            }
        }

    }
}
