package node;

public class LinkedTreeNode<T extends Comparable<T>> implements INode {

	private Data<T> data;
	private LinkedTreeNode<T> left;
	private LinkedTreeNode<T> right;

	public LinkedTreeNode(Data<T> data) {
		this.data = data;
	}

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

	@Override
	public Data getData() {
		return data;
	}
}
