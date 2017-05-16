package tree;
import node.INode;

public interface BinaryTree <T extends Comparable<T>> {
	
	/**
	 * adds node to tree 
	 * @param node
	 */
	@SuppressWarnings({ "hiding", "rawtypes" })
	public <T> void add(INode node);
	
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
