package Thread_Extends;

public class Main extends Thread{

    public static void main(String[] args) {

        ThreadShowName thread1,thread2;

        thread1=new ThreadShowName();
        thread2=new ThreadShowName();

        thread1.start();
        thread2.start();
    }


}
