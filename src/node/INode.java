package node;

public interface INode<T extends Comparable<T>> {

	/**
	 * gets left child node
	 * 
	 * @return
	 */
	public INode<T> getLeftChild();

	/**
	 * gets right child node
	 * 
	 * @return
	 */
	public INode<T> getRightChild();

	/**
	 * sets left child node
	 * @return
	 */
	public void setLeftChild(INode<T> node);

	/**
	 * sets right child node
	 * @return
	 */
	public void setRightChild(INode<T> node);

	/**
	 * gets data container
	 * @return
	 */
	public Data<T> getData();
}
