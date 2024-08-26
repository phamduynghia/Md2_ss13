package practice4_ss13;

public class TreeNode {
    protected E element;
    protected  TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e){
        element = e;
    }

    public interface Tree<E>{
        public boolean insert(E e);
        public void inrder();
        public int getSize();

        void inorder();
    }

    public abstract class AbstractTree<E> implements Tree<E>{
    @Override
        public void inorder(){
    }
    }


}
