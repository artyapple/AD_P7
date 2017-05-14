package node;
public class ArrayTreeNode<T extends Comparable<T>> implements INode {
	
	private Data<T> data;
	
	public ArrayTreeNode(Data data) {
		this.data = data;
	}

	@Override
	public INode getLeftChild() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public INode getRightChild() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLeftChild(INode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRightChild(INode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Data getData() {
		// TODO Auto-generated method stub
		return null;
	}
	
}