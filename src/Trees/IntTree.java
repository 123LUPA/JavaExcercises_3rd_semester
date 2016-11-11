package Trees;

/**
 * Created by Palko on 02/05/2016.
 */
public class IntTree {

    private IntTreeNode overallRoot;


    public IntTree(int max) {
        if (max <= 0) {
            throw new IllegalArgumentException("max" + max);
        }

        overallRoot = buildTree(1, max);
    }

    private IntTreeNode buildTree(int n, int max) {
        if (n > max) {
            return null;
        } else {
            return new IntTreeNode(n, buildTree(2 * n, max), buildTree(2 * n + 1, max));
        }
    }

    public void printPreorder() {
        System.out.print("preorder:");
        printPreorder(overallRoot);
        ;
        System.out.println();
    }

    private void printPreorder(IntTreeNode root) {
        if (root != null) {
            System.out.print("" + root.data);
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    public void printInorder() {
        System.out.print("inorder:");
        printInorder(overallRoot);
        System.out.println();
    }

    private void printInorder(IntTreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(" " + root.data);
            printInorder(root.right);
        }
    }

    public void printPostOrder() {
        System.out.println("postorder:");
        printPostOrder(overallRoot);
        System.out.println();
    }


    private void printPostOrder(IntTreeNode root) {
        if (root != null) {
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print("" + root.data);
        }
    }

    public void printSideways() {
        printSideways(overallRoot, 0);
    }


    private void printSideways(IntTreeNode root, int level) {
        if (root != null) {
            printSideways(root.right, level + 1);

            for (int i = 0; i < level; i++) {
                System.out.print(" ");
            }

            System.out.println(root.data);
            printSideways(root.left, level + 1);
        }
    }


    public int countNodes() {
        return countNodes(overallRoot);
    }

    private int countNodes(IntTreeNode root) {

        if (root == null) {
            return 0;
        } else if (root.left == null & root.right == null) {
            return 1;
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);

        }
    }

    public int maxMin() {
        return maxMin(overallRoot);
    }


    int max;
    int min = 1;

    private int maxMin(IntTreeNode root) {

        if (root == null)
            return 0;
        if (root.data <= min) {
            min = root.data;
        }
        if (root.data > min)
            max = root.data;
        if (root.left != null && root.left.data > max)
            max = root.left.data;

        if (root.right != null && root.right.data > max)
            max = root.right.data;
        maxMin(root.left);
        maxMin(root.right);

        return min & max;
    }

    public int sum() {
        return sum(overallRoot);
    }

    int sum;

    private int sum(IntTreeNode overallRoot) {
        if (overallRoot == null) {
            return 0;
        } else if (overallRoot.left != null && overallRoot.right != null) {
            sum += overallRoot.left.data + overallRoot.right.data;
            sum(overallRoot.right);
            sum(overallRoot.left);
        }

        return sum + overallRoot.data;

    }

    public int countLeftLeave() {
       return countLeftLeave(overallRoot);


    }



    int count;
    private int countLeftLeave(IntTreeNode root){
        if(root==null){
            return 0;
        }
        else if(root.left!=null){
            return 1 +countLeftLeave(root.left);

        }
        else if(root.right!=null){


            return 1 +  countLeftLeave(root.left);
        }
        return count;
    }

    public int countBranches(){
        return countBranches(overallRoot);
    }

    int getNumber;

    private int countBranches(IntTreeNode root) {
        if (root == null) {

            return 1;

        } else if (root.left != null & root.right != null) {


            countBranches(root.right);
            countBranches(root.left);



        }
        return countBranches(root.right) + countBranches(root.left);

    }

}