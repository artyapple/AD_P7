package tree;
import node.INode;

public interface BinaryTree <T extends Comparable<T>> {
	/*
	 * less than or equal to 
	 */
	public static final int LE = 0;
	/*
	 * greater than or equal to
	 */
	public static final int GE = 1;
	
	/**
	 * adds node to tree 
	 * @param node
	 */
	@SuppressWarnings({ "hiding", "rawtypes" })
	public <T> void add(INode node);
	
	/**
	 * gets sum of all values between "from" and "until"
	 * @throws IllegalArgumentException if from > until
	 *  
	 * @param from
	 * @param until
	 * @return sum
	 */
	public int getSumAllValues(int from, int until);
	
	/**
	 * prints data in order 
	 * @param node
	 */
	@SuppressWarnings({ "hiding", "rawtypes" })
	public <T> void inOrderTraverseTree(INode node);
	
	/**
	 * prints data in pre order
	 * @param node
	 */
	@SuppressWarnings({ "hiding", "rawtypes" })
	public <T> void preOrderTraverseTree(INode node);
	
	/**
	 * prints data in post order
	 * @param node
	 */
	@SuppressWarnings({ "rawtypes", "hiding" })
	public <T> void postOrderTraverseTree(INode node);

}
