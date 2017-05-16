package tree;
import node.INode;
import node.LinkedTreeNode;

public interface BinaryTree <T extends Comparable<T>> {
	
	/**
	 * adds node to tree 
	 * @param node
	 */
	public <T> void add(INode node);
	
	/**
	 * prints data in order 
	 * @param node
	 */
	public <T> void inOrderTraverseTree(INode node);
	
	/**
	 * prints data in pre order
	 * @param node
	 */
	public <T> void preOrderTraverseTree(INode node);
	
	/**
	 * prints data in post order
	 * @param node
	 */
	public <T> void postOrderTraverseTree(INode node);

}
