package node;

public class LinkedTreeNode<T extends Comparable<T>> extends AbstractTreeNode {

	public LinkedTreeNode(Data data) {
		super(data);
	}

	private LinkedTreeNode<T> left;
	private LinkedTreeNode<T> right;

	/**
	 * gets left child node
	 * 
	 * @return
	 */
	public INode getLeftChild() {
		return left;
	}

	/**
	 * gets right child node
	 * 
	 * @return
	 */
	public INode getRightChild() {
		return right;
	}

	/**
	 * sets left child node
	 * 
	 * @return
	 */
	public void setLeftChild(INode node) {
		this.left = (LinkedTreeNode<T>) node;
	}

	/**
	 * sets left child node
	 * 
	 * @return
	 */
	public void setRightChild(INode node) {
		this.right = (LinkedTreeNode<T>) node;
	}

}
