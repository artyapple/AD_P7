package tree;

import java.util.List;

import node.INode;
import node.LinkedTreeNode;

public class LinkedBinaryTree<T extends Comparable<T>> implements BinaryTree<T> {

	private LinkedTreeNode root;

	@Override
	public <T> void add(INode node) {
		if (root == null) {
			root = (LinkedTreeNode) node;
		} else {

			// Set root as the Node we will start
			// with as we traverse the tree

			LinkedTreeNode focusNode = root;
			// Future parent for our new Node
			LinkedTreeNode parent;

			while (true) {

				// root is the top parent so we start
				// there
				parent = focusNode;
				// Check if the new node should go on
				// the left side of the parent node
				if (node.getData().compareTo(focusNode.getData()) < 0) {
					// Switch focus to the left child
					focusNode = (LinkedTreeNode) focusNode.getLeftChild();
					// If the left child has no children
					if (focusNode == null) {
						// then place the new node on the left of it
						parent.setLeftChild(node);
						return; // All Done
					}

				} else { // If we get here put the node on the right

					focusNode = (LinkedTreeNode) focusNode.getRightChild();
					// If the right child has no children
					if (focusNode == null) {
						// then place the new node on the right of it
						parent.setRightChild(node);
						return; // All Done
					}
				}
			}
		}
	}

	@Override
	public void inOrderTraverseTree(INode node) {
		if (node != null) {
			inOrderTraverseTree(((LinkedTreeNode) node).getLeftChild());
			System.out.println(node.getData());
			inOrderTraverseTree(((LinkedTreeNode) node).getRightChild());
		}
	}

	@Override
	public void preOrderTraverseTree(INode node) {
		if (node != null) {
			System.out.print(node.getData());
			preOrderTraverseTree(((LinkedTreeNode) node).getLeftChild());
			preOrderTraverseTree(((LinkedTreeNode) node).getRightChild());

		}
	}

	@Override
	public <T> void postOrderTraverseTree(INode node) {
		if (node != null) {
			postOrderTraverseTree(((LinkedTreeNode) node).getLeftChild());
			postOrderTraverseTree(((LinkedTreeNode) node).getRightChild());
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
			inOrderTraverseTree(((LinkedTreeNode) node).getLeftChild(), list);
			list.add((T) node.getData().getValue());
			inOrderTraverseTree(((LinkedTreeNode) node).getRightChild(), list);
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
			preOrderTraverseTree(((LinkedTreeNode) node).getLeftChild(), list);
			preOrderTraverseTree(((LinkedTreeNode) node).getRightChild(), list);
		}
	}

	/**
	 * only for test
	 * 
	 * @param node
	 * @param list
	 */
	public <T> void postOrderTraverseTree(INode node, List<T> list) {
		if (node != null) {
			postOrderTraverseTree(((LinkedTreeNode) node).getLeftChild(), list);
			postOrderTraverseTree(((LinkedTreeNode) node).getRightChild(), list);
			list.add((T) node.getData().getValue());
		}
	}

}
