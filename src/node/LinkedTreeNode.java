package node;

public class LinkedTreeNode<T extends Comparable<T>> implements INode {

	private Data<T> data;
	private LinkedTreeNode<T> left;
	private LinkedTreeNode<T> right;
	
	public LinkedTreeNode(Data<T> data) {
		this.data = data;
	}

	@Override
	public INode getLeftChild() {
		return left;
	}

	@Override
	public INode getRightChild() {
		return right;
	}

	@Override
	public void setLeftChild(INode node) {
		this.left = (LinkedTreeNode<T>) node;
	}

	@Override
	public void setRightChild(INode node) {
		this.right = (LinkedTreeNode<T>) node;
	}

	@Override
	public Data getData() {
		return data;
	}
}
