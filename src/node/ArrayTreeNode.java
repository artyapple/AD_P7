package node;
import tree.ArrayBinaryTree;

public class ArrayTreeNode<T extends Comparable<T>> implements INode {
	
	private Data<T> data;
	private int index;
	
	public ArrayTreeNode(Data data) {
		this.data = data;
	}

	@Override
	public Data getData() {
		return data;
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