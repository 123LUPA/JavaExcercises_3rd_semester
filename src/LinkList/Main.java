
package LinkList;
public class Main {

    public static void main(String[] args) {

        LinkedList linkList = new LinkedList();



        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        linkList.add(4);
        linkList.add(5);
        linkList.add(6);
        linkList.add(7);
        linkList.add(7);

        System.out.println("Linked list after adding"+linkList);

        linkList.addAtFirst(88);

        System.out.println("Linked list after adding at first position"+linkList);

        linkList.addAtLast(33);

        System.out.println("Linked list after adding at last position"+linkList);

        linkList.removeFirst();

        System.out.println("Linked list after removing first element"+linkList);

        linkList.removeLast();

        System.out.println("Linked list after removing last element"+linkList);

        linkList.removeAtPosition(2);


        System.out.println("Linked list after removing at position 2"+linkList);


        linkList.removeWithData(1);

        System.out.println("Linked list after removing value 1"+linkList);

        linkList.replaceValueAtPosition(2,22);

        System.out.println("Linked list after replacing element at position 2 "+linkList);

        linkList.replaceAll(7,44);

        System.out.println("Linked list after replacing 7 with other element"+linkList);


        System.out.println("Get linkedList method"+ " "+ linkList.getLinkedList(1));


        System.out.println("Size before removing all is"+" "+linkList.size());

        //linkList.removeAll();

        System.out.println("Linked list after removing all"+linkList);

        System.out.println("Size after removing all is"+" "+linkList.size());

        //////////////////////////////////////////////////////////////////////////////////////////////
        /*RUNNING GENERICS*/

        System.out.println("****************************RUNNING GENERICS**************************************");

        LinkedListGeneric<String> linkedListString = new LinkedListGeneric<>();

        linkedListString.add("Dog");


        linkedListString.add("Elephant");

        linkedListString.add("Mouse");

        linkedListString.add("Donkey");

        linkedListString.add("Beer");

        System.out.println("Linked list after adding"+linkedListString);

        linkedListString.addAtFirst("Cat");

        System.out.println("Linked list adding at first"+linkedListString);

        linkedListString.addAtLast("Hamster");

        System.out.println("Linked list after adding at last position"+linkedListString);

        linkedListString.removeFirst();

        System.out.println("Linked list after removing first"+linkedListString);

        linkedListString.removeLast();

        System.out.println("Linked list after removing last"+linkedListString);


        linkedListString.replaceValueAtPosition(0,"Elephant");

        System.out.println("Linked list after replacing at position 0"+linkedListString);

        linkedListString.replaceAll("Elephant","Monkey");

        System.out.println("Linked list after replacing all elephants"+linkedListString);

        linkedListString.removeWithData("Monkey");

        System.out.println("Linked list after removing value monkeys"+linkedListString);

        //linkedListString.removeAtPosition(0);

        System.out.println("Linked list after removing at position 0"+linkedListString);

        System.out.println("Linked list size before removing all is"+" "+linkedListString.size());


        linkedListString.removeAll();

        System.out.println("Linked list after removing all"+linkedListString);

        System.out.println("Linked list size after removing all is"+" "+linkedListString.size());

        System.out.println("**********************************************");

        System.out.println("Printing with for-each LOOP");

        System.out.println("**********************************************");














    }
}
