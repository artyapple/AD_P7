package tree;

import java.util.List;

import node.INode;

public abstract class BinaryTreeAbstract<T extends Comparable<T>> implements BinaryTree<T> {

	public abstract <T> void add(INode node);

	@Override
	public void inOrderTraverseTree(INode node) {
		if (node != null) {

			inOrderTraverseTree(node.getLeftChild());
			System.out.println(node.getData());
			inOrderTraverseTree(node.getRightChild());
		}
	}

	@Override
	public void preOrderTraverseTree(INode node) {
		if (node != null) {

			System.out.print(node.getData());
			preOrderTraverseTree(node.getLeftChild());
			preOrderTraverseTree(node.getRightChild());

		}
	}

	@Override
	public <T> void postOrderTraverseTree(INode node) {
		if (node != null) {

			postOrderTraverseTree(node.getLeftChild());
			postOrderTraverseTree(node.getRightChild());
			System.out.print(node.getData());
		}
	}
	
	
	/**
	 * only for test
	 * 
	 * @param node
	 * @param list 
	 */
	public void inOrderTraverseTree(INode node, List<T> list) {
		if (node != null) {

			inOrderTraverseTree(node.getLeftChild(), list);
			list.add((T) node.getData().getValue());
			inOrderTraverseTree(node.getRightChild(), list);

		}
	}

	/**
	 * only for test
	 * 
	 * @param node
	 * @param list 
	 */
	public void preOrderTraverseTree(INode node, List<T> list) {
		if (node != null) {

			list.add((T) node.getData().getValue());
			preOrderTraverseTree(node.getLeftChild(), list);
			preOrderTraverseTree(node.getRightChild(), list);

		}
	}
	
	/**
	 * only for test
	 * 
	 * @param node
	 * @param list 
	 */
	public <T> void postOrderTraverseTree(INode node, List<T> list){
		if (node != null) {

			postOrderTraverseTree(node.getLeftChild(), list);
			postOrderTraverseTree(node.getRightChild(), list);
			list.add((T) node.getData().getValue());
		}
	}
}
