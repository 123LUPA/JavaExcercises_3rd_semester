package ArrayList;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Created by Palko on 10/03/2016.
 */
public class ArrayList implements Array {

    private int[] array;
    private int maxSize = 4;
    private int counter = 0;


    static Logger log = Logger.getLogger(ArrayList.class.getName());


    public ArrayList() {
        array = new int[maxSize];
    }

    @Override
    public void add(int value) {

        if (counter < array.length) {
            array[counter] = value;

            counter++;

            log.info("Counter after adding is" + " " + String.valueOf(counter));

        } else if (counter == array.length) {
            increaseSize();

            array[counter] = value;
            counter++;
            log.info("Counter after adding is" + " " + String.valueOf(counter));

        }

    }

    private int[] increaseSize() {
        int[] tem = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            tem[i] = array[i];
        }
        array = tem;

        return array;
    }


    @Override
    public void addAtPos(int value, int position) {

        if (position == 0) {
            shiftOneToRight();

            array[position] = value;
            counter++;
            log.info("Counter after adding at position 0 is" + " " + String.valueOf(counter));
        }

        else if (position < array.length) {

            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];

                if (i == position) {
                    array[position] = value;
                    counter++;
                    log.info("Counter after adding  at other position  is" + " " + String.valueOf(counter));


                    break;

                }
            }
        } else {
            System.out.println("There is no space");

        }
   /*
            } else {
                increaseSize();
                for (int i = array.length - 1; i > 0; i--) {
                    array[i] = array[i - 1];
                    if (i == position) {
                        array[position] = value;
                        counter=counter*2;
                        log.info("Counter after resizing is"+""+String.valueOf(counter));

                        break;

                    }
                }
            }*/
    }


    private int[] shiftOneToRight() {
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        return array;
    }

    @Override
    public void deleteAtEnd() {

        decreaseSizeByOne(); //just remove one at the end

    }

    private int[] decreaseSizeByOne() {
        int[] tem = new int[counter - 1];
        for (int i = tem.length-1; i < tem.length; i++) {
            tem[i] = array[i];
        }
        array = tem;
        counter--;
        log.info("Counter after deleting" + " " + String.valueOf(counter));

        return array;

    }

    @Override
    public void deleteAtPostion(int position) {
        if (position < array.length - 1) {
            for (int i = position; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
        }
        decreaseSizeByOne();

    }


    @Override
    public void deleteValues(int value) { //BETTER IF I COUNT THE VALUES TO DELETE AND HAVE ONE LOOP ONLY

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value && i != array.length - 1) {

                for (int k = i; k < array.length - 1; i++) {
                    array[i] = array[i + 1];
                    k++;

                }

            }
        }

        decreaseSizeByOne();
        counter--;
        log.info("Counter after deleting value is:"+" "+String.valueOf(counter));

    }


    @Override
    public void replaceAtPos(int val, int position) {
        for(int i=0;i<array.length;i++){
            if(i==position){
                array[i]=val;
                break;
            }
        }

    }

    @Override
    public void replaceAll(int value, int newValue) {
        for(int i=0;i<array.length;i++){
            if(array[i]==value) {
                array[i] = newValue;
            }
        }

    }

    @Override
    public void size() {

        int size = array.length;

        System.out.println(size);


    }

    public String toString(){

        return Arrays.toString(array);



    }


}
