package Heap;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Heap2 newHeap = new Heap2(7);

        newHeap.generateFilledArray(90);

        // Print out the array before it is sorted
        System.out.println("Original Array");
        System.out.println(Arrays.toString(newHeap.getTheHeap()));

        System.out.println();

        newHeap.printTree2(4);
        System.out.println();

        for (int j = newHeap.getMaxSize() / 2 - 1; j >= 0; j--) {

            newHeap.heapTheArray(j);

        }

        System.out.println("Heaped Array");

        System.out.println(Arrays.toString(newHeap.getTheHeap()) + "\n");

        newHeap.printTree2(4);

        System.out.println("HEAPED SORTED");

        newHeap.heapSort();

        // Print the sorted array
        System.out.println("\nSorted Array");
        System.out.println(Arrays.toString(newHeap.getTheHeap()));;
    }
}
