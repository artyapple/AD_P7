package node;
import tree.ArrayBinaryTree;
public class ArrayTreeNode<T extends Comparable<T>> implements INode {
	
	private Data<T> data;
	private int index;

	
	
	public ArrayTreeNode(Data data) {
		this.data = data;
	}

	@Override
	public INode getLeftChild() {
		
		
		return abt[1];
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
		return this.data;
	}
	public void setIndex(int index){
		this.index=index;
	}
	
}