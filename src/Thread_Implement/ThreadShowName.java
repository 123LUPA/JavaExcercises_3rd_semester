package Thread_Implement;

/**
 * Created by Palko on 07/05/2016.
 */
public class ThreadShowName extends Thread {

    public void run(){
        int pause;

        for(int i=0;i<10;i++){
            try {
                System.out.println(getName()+" being executed");

                pause=(int)(Math.random()*3000);

                sleep(pause);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            } ;
        }
    }
}
