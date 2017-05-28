package node;

public interface INode<T extends Comparable<T>> {

	/**
	 * gets data container
	 * @return
	 */
	public Data<T> getData();
	
	/**
	 * gets the sum of the left subtree
	 * @return sum
	 */
	public int getLeftSubTreeSum();
	
	/**
	 * gets the sum of the right subtree
	 * @return sum
	 */
	public int getRightSubTreeSum();
	
	/**
	 * sets the sum of the left subtree
	 * @param value
	 */
	public void setLeftSubTreeSum(int value);
	
	/**
	 * sets the sum of the right subtree
	 * @param value
	 */
	public void setRightSubTreeSum(int value);
}
