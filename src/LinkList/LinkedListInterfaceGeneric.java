/**
 * Created by Palko on 20/03/2016.
 */

package LinkList;
public interface LinkedListInterfaceGeneric<T>{


     boolean  add(T value);

     boolean  addAtFirst(T value);
     boolean  addAtLast(T value);

     boolean  removeFirst();
     boolean  removeLast();
     boolean  removeAtPosition(int position);
     boolean  removeWithData(T value);
     boolean  removeAll();


     ListNodeGeneric getLinkedList(int index);


     boolean replaceValueAtPosition(int position, T newValue);
     boolean  replaceAll(T value,T newValue);

     int size();



}
