package ArrayList;


/**
 * Created by Palko on 10/03/2016.
 */
public interface Array {


    void add(int value);
    void addAtPos(int value,int position);
    void deleteAtEnd();
    void deleteAtPostion(int position);
    void deleteValues(int value);

    void replaceAtPos(int val,int position);
    void replaceAll(int value,int newValue);
    void size();


}

