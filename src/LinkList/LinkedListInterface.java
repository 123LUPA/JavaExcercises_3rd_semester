/**
 * Created by Palko on 13/03/2016.
 */
package LinkList;
public interface LinkedListInterface {



    public boolean  add(int value);

    public boolean  addAtFirst(int value);
    public boolean  addAtLast(int value);

    public boolean  removeFirst();
    public boolean  removeLast();
    public boolean  removeAtPosition(int position);
    public boolean  removeWithData(int value);
    public boolean  removeAll();


    public ListNode getLinkedList(int index);


    public boolean replaceValueAtPosition(int position, int newValue);
    public boolean  replaceAll(int value,int newValue);

    public int size();




}

