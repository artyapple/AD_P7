package node;
import tree.ArrayBinaryTree;

public class ArrayTreeNode<T extends Comparable<T>> extends AbstractTreeNode {
	
	private int index;
	
	public ArrayTreeNode(Data data) {
		super(data);
	}
	
	
	/**
	 * sets node index in array 
	 * 
	 * @param index
	 */
	public void setIndex(int index) {
		this.index = index;
	}	
	
	/**
	 * gets node index in array
	 * 
	 * @return
	 */
	public int getIndex(){
		return index;
	}	
}