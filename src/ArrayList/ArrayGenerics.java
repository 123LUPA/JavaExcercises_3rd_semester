package ArrayList;


/**
 * Created by Palko on 23/03/2016.
 */
public interface ArrayGenerics<T> {


    void add(T value);
    void addAtPos(T value,int position);
    void deleteAtEnd();
    void deleteAtPostion(int position);
    void deleteValues(T value);

    void replaceAtPos(T val,int position);
    void replaceAll(T value,T newValue);
    void size();
}
