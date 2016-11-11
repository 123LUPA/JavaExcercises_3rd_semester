package ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList arrayList = new ArrayList();


        //Trying adding function
        arrayList.add(1);
        arrayList.add(2);

        System.out.println("Array list after adding" + arrayList);


        //Trying adding at position
        arrayList.addAtPos(3, 2);
        arrayList.addAtPos(4, 3);

        System.out.println("Array list after adding at position" + arrayList);


        //Trying deleting at the end
        arrayList.deleteAtEnd();
        System.out.println("Array list deleting at the end" + arrayList);


        //Trying deleting at the position
        arrayList.deleteAtPostion(0);

        System.out.println("Array list deleting at the position" + arrayList);


        //Trying to replace all old value with new value
        arrayList.replaceAll(2, 22);
        System.out.println("Array after replacing values" + arrayList);

        //Deleting values
        arrayList.deleteValues(22);
        System.out.println("Array list after deleting values" + arrayList);


        //Replacing at position
        arrayList.replaceAtPos(40, 0);
        System.out.println("After replacing at position" + arrayList);


        //Checking size of arrayList
        arrayList.size();

        System.out.println("**********************************TESTING GENERIC CLASS****************************************************************");

        ArrayListGenerics<String> arrayListGenerics = new ArrayListGenerics();

        arrayListGenerics.add("cat");
        arrayListGenerics.add("monkey");
        arrayListGenerics.add("snake");
        arrayListGenerics.add("snake");
        arrayListGenerics.add("rat");
        arrayListGenerics.addAtPos("mouse",0);

        System.out.println("Array list after adding "+arrayListGenerics);

        arrayListGenerics.deleteAtEnd();

        System.out.println("Array list after deleting at the end"+arrayListGenerics);

        arrayListGenerics.deleteAtPostion(2);

        System.out.println("Array list after deleting at position 2"+arrayListGenerics);

        arrayListGenerics.deleteValues("cat");

        System.out.println("Array list after deleting cat"+arrayListGenerics);

        arrayListGenerics.replaceAtPos("orangutan",0);

        System.out.println("Array list after replacing orangutan at position 0"+arrayListGenerics);


        arrayListGenerics.replaceAll("snake","cat");

        System.out.println("Array list after replacing snake with cat"+arrayListGenerics);

        arrayListGenerics.size();



    }
}
