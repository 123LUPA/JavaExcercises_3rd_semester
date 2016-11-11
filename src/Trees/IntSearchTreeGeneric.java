package Trees;

/**
 * Created by Palko on 13/05/2016.
 */
public class IntSearchTreeGeneric<E extends Comparable<E>>{

    /**
     * Created by Palko on 13/05/2016.
     */
        private IntTreeNodeGeneric<E> overallRoot;


        public IntSearchTreeGeneric(){
            overallRoot = null;
        }

        public void add(E value){
            overallRoot = add(overallRoot,value);
        }

        private  IntTreeNodeGeneric<E> add(IntTreeNodeGeneric<E> root,E value){

            if(root==null){
                root = new IntTreeNodeGeneric<E>(value);
            }
            else if(value.compareTo(root.data)<=0){
                root.left = add(root.left,value);
            }
            else{
                root.right = add(root.right,value);
            }
            return root;
        }

        public boolean contains(E value){
            return contains(overallRoot,value);
        }

        private boolean contains(IntTreeNodeGeneric<E> root,E value){


            int compare= value.compareTo(root.data);
            if(root==null){
                return false;
            }
            if(compare==0){
                return true;
            }
            else if(compare<0){
                return contains(root.left,value);

            }
            else {
                return contains(root.right,value);
            }

        }

        private void printInorder(IntTreeNodeGeneric<E> root){
            if(root!=null){
                printInorder(root.left);
                System.out.println(root.data+" ");
                printInorder(root.right);
            }
        }

        public void printSideways(){
            printSideways(overallRoot,0);
        }

        private void printSideways(IntTreeNodeGeneric<E> root,int level){

            if(root!= null){
                printSideways(root.right,level+1);
                for(int i=0;i<level;i++){
                    System.out.print("  ");
                }

                System.out.println(root.data);
                printSideways(root.left,level+1);
            }
        }



}
