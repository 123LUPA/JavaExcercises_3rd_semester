package Trees;

public class Main {

    public static void main(String[] args) {


    IntTree intTree = new IntTree(8);


        IntSearchTree intSearchTree = new IntSearchTree();

        System.out.println("Tree structure");
//
        intTree.printSideways();
        intTree.printPreorder();
        intTree.printInorder();
        intTree.printPostOrder();

        System.out.println("Sum is:"+intTree.sum());

        System.out.println("Left nodes  are"+intTree.countLeftLeave());

        System.out.println("Number of empty branches is"+intTree.countBranches());


        intSearchTree.add(120);
        intSearchTree.add(30);
        intSearchTree.add(50);
        intSearchTree.add(433);



        intSearchTree.add(140);
        intSearchTree.add(20);
        intSearchTree.contains(433);
        intSearchTree.printSideways();




        System.out.println(intTree.countNodes());
        System.out.println(intTree.maxMin());


//        IntSearchTreeGeneric intSearchTreeGeneric = new IntSearchTreeGeneric();
//        intSearchTreeGeneric.add("hello");
//        intSearchTreeGeneric.add("dog");
//        intSearchTreeGeneric.add("monkey");
//
//        intSearchTreeGeneric.printSideways();
//        intSearchTreeGeneric.contains("dog");


    }

}
