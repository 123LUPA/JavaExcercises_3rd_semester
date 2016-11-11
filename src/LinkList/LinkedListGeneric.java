/**
 * Created by Palko on 20/03/2016.
 */
package LinkList;
public class LinkedListGeneric<T>implements LinkedListInterfaceGeneric<T> {


    ListNodeGeneric front;

    LinkedListGeneric() {
        front = null;

    }

    @Override
    public boolean add(T value) {

        if (front == null) {
            front = new ListNodeGeneric(value);
            return true;
        } else {
            ListNodeGeneric current = front;
            while (current.next != null) {
                current = current.next;
            }

            current.next = new ListNodeGeneric(value);
            return true;

        }

    }

    @Override
    public boolean addAtFirst(T value) {
        front = new ListNodeGeneric(value, front);
        return true;
    }

    @Override
    public boolean addAtLast(T value) {  //Better point to the last one so i do not need to run loop all the time
        ListNodeGeneric current = front;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new ListNodeGeneric(value);
        return true;


    }


    @Override
    public boolean removeFirst() {
        front = front.next;
        return true;
    }


    @Override
    public boolean removeLast() {
        ListNodeGeneric current = getLinkedList(size() - 1);
        current.next = current.next.next;


        return true;

    }

    @Override
    public boolean removeAtPosition(int position) {
        if (position == 0) {
            front = front.next;
        } else {
            ListNodeGeneric current = getLinkedList(position);
            current.next = current.next.next;
            return true;
        }
        return false;

    }

    @Override
    public boolean removeWithData(T value) {

        while (front.data==value){
            front = front.next;

        }
        ListNodeGeneric current = front;

        while (current.next!=null){
            if(current.next.data==value){
                current.next = current.next.next;

            }else {
                current = current.next;
            }
        }
        return true;
    }


    @Override
    public boolean removeAll() {

        front = null;
        return true;
    }

    @Override
    public ListNodeGeneric getLinkedList(int index) {
        ListNodeGeneric current = front;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        return current;
    }

    @Override
    public boolean replaceValueAtPosition(int position, T newValue) {
        ListNodeGeneric current = front;
        if (position != 0) {
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }

            current.next = new ListNodeGeneric(newValue, current.next.next);
            return true;

        } else {
            front = new ListNodeGeneric(newValue, front.next);
            return true;
        }

    }

    @Override
    public boolean replaceAll(T value, T newValue) {
        ListNodeGeneric current = front;
        int index = 0;
        int numberOfOccurrences = 0;
        if (front.data == value) {
            front.data = newValue;

        }
        while (current.next != null) {

            if (current.next.data == value) {

                current.next.data = newValue;

            }


            current = current.next;


        }

        return true;


    }



    @Override
    public int size() {
        int count =0;
        ListNodeGeneric current = front;
        while(current!=null){
            current = current.next;
            count++;
        }
        return count;

    }

    public String toString(){
        if(front==null){
            return"[]";
        }
        else {
            String result ="["+ front.data;
            ListNodeGeneric current = front.next;
            while (current!=null){
                result+=", " +current.data;
                current=current.next;
            }

            result += "]";
            return result;
        }
    }

}
