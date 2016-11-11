package Trees;

/**
 * Created by Palko on 13/05/2016.
 */
public class IntTreeNodeGeneric<E> {


        public E data;
        public IntTreeNodeGeneric<E> left;
        public IntTreeNodeGeneric<E> right;

        public IntTreeNodeGeneric(E data){
            this(data,null,null);
        }

        public IntTreeNodeGeneric(E data,IntTreeNodeGeneric<E> left, IntTreeNodeGeneric<E> right){

            this.data=data;
            this.left=left;
            this.right=right;
        }


}
