package node;

public interface INode<T extends Comparable<T>> {

	/**
	 * gets data container
	 * @return
	 */
	public Data<T> getData();
	
	public int getLeftSubTreeSum();
	
	public int getRightSubTreeSum();
	
	public void setLeftSubTreeSum(int value);
	
	public void setRightSubTreeSum(int value);
}
