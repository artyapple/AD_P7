package node;

public abstract class AbstractTreeNode<T extends Comparable<T>> implements INode<T> {
	
	private Data<T> data;
	private int leftSubTreeSum;
	private int rightSubTreeSum;
	
	public AbstractTreeNode(Data<T> data) {
		this.data = data;
		this.leftSubTreeSum = 0;
		this.rightSubTreeSum = 0;
	}
	
	@Override
	public Data<T> getData() {
		return data;
	}
	
	@Override
	public int getLeftSubTreeSum(){
		return leftSubTreeSum;
	}
	
	@Override
	public int getRightSubTreeSum(){
		return rightSubTreeSum;
	}
	
	@Override
	public void setLeftSubTreeSum(int value){
		leftSubTreeSum += value;
	}
	
	@Override
	public void setRightSubTreeSum(int value){
		rightSubTreeSum += value;
	}
}
