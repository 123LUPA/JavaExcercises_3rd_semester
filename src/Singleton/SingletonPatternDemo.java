package Singleton;

/**
 * Created by Edgaras on 09/06/2016.
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();

      // SingleObject singleObject = new SingleObject();
        //here you cannot instanciate this class
    }
}
