package LinkList;

/**
 * Created by Palko on 13/03/2016.
 */
public class LinkedList implements LinkedListInterface {


    private ListNode front;


    public LinkedList(){

        front=null;
    }




    @Override
    public boolean add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }

            current.next = new ListNode(value);


        }
        return false;

    }

    @Override
    public boolean addAtFirst(int value) {
        {
            front = new ListNode(value, front);
            return true;

        }
    }

    @Override
    public boolean addAtLast(int value) {
        ListNode current = front;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new ListNode(value);
    return true;
}


    @Override
    public boolean removeFirst() {
       front=front.next;
       return true;
    }

    @Override
    public boolean removeLast() {


        ListNode current = getLinkedList(size()-1);
        current.next=current.next.next;


        return true;

    }

    @Override
    public boolean removeAtPosition(int position) {
        if(position==0){
            front=front.next;
        }
        else{
            ListNode current = getLinkedList(position);
            current.next = current.next.next;
            return true;
        }
    return false;
    }

    @Override
    public boolean removeWithData(int value) {

        while (front.data==value){
            front = front.next;

        }
        ListNode current = front;

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
        front=null;
        return true;
    }

    @Override
    public ListNode getLinkedList(int index) {

        ListNode current = front;
        for(int i=0;i<index-1;i++){
            current=current.next;
        }

        return current;
    }




    @Override
    public boolean replaceValueAtPosition(int position, int newValue) {

        ListNode current = front;
        if(position!=0) {
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }

            current.next=new ListNode(newValue,current.next.next);
            return true;

        }
        else{
            front=new ListNode(newValue,front.next);
            return true;

        }


    }

    @Override
    public boolean replaceAll(int value, int newValue) {
        ListNode current = front;

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

    public String toString(){
        if(front==null){
            return"[]";
        }
        else {
            String result ="["+ front.data;
            ListNode current = front.next;
            while (current!=null){
                result+=", " +current.data;
                current=current.next;
            }

            result += "]";
            return result;
        }
    }


    public int size(){
        int count =0;
        ListNode current = front;
        while(current!=null){
            current = current.next;
            count++;
        }
        return count;
    }














}
