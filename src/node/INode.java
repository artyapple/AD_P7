package node;

public interface INode<T extends Comparable<T>> {

	/**
	 * gets data container
	 * @return
	 */
	public Data<T> getData();
}
