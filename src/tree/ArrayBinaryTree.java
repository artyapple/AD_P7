package tree;

import java.util.ArrayList;
import java.util.List;

import node.ArrayTreeNode;
import node.Data;
import node.INode;
import node.LinkedTreeNode;

public class ArrayBinaryTree<T extends Comparable<T>> implements BinaryTree<T> {

	private ArrayTreeNode[] abt = new ArrayTreeNode[100];
	// private int index;
	private int root_Index = 1;

	@Override
	public <T> void add(INode node) {

		ArrayTreeNode nd = (ArrayTreeNode) node;

		if (abt[root_Index] == null) {
			nd.setIndex(root_Index);
			abt[root_Index] = nd;
		} else {
			// Set root as the Node we will start
			// with as we traverse the tree
			int focusNode = root_Index;
			// Future parent for our new Node
			int parent;

			while (true) {
				// root is the top parent so we start
				// there
				parent = focusNode;
				// Check if the new node should go on
				// the left side of the parent node
				if (nd.getData().compareTo(abt[focusNode].getData()) < 0) {
					// Switch focus to the left child
					focusNode = focusNode * 2;
					// If the left child has no children
					if (abt[focusNode] == null) {
						// then place the new node on the left of it
						nd.setIndex(focusNode);
						abt[focusNode] = nd;
						return; // All Done
					}
				} else { // If we get here put the node on the right
					focusNode = focusNode * 2 + 1;
					// If the right child has no children
					if (abt[focusNode] == null) {

						// then place the new node on the right of it
						nd.setIndex(focusNode);
						abt[focusNode] = nd;
						return; // All Done
					}
				}
			}
		}
	}

	@Override
	public <T> void inOrderTraverseTree(INode node) {
		if (node != null) {
			inOrderTraverseTree(getLeft(((ArrayTreeNode) node).getIndex()));
			System.out.println(node.getData());
			inOrderTraverseTree(getRight(((ArrayTreeNode) node).getIndex()));
		}
	}

	@Override
	public <T> void preOrderTraverseTree(INode node) {
		if (node != null) {
			System.out.println(node.getData());
			preOrderTraverseTree(getLeft(((ArrayTreeNode) node).getIndex()));
			preOrderTraverseTree(getRight(((ArrayTreeNode) node).getIndex()));
		}
	}

	@Override
	public <T> void postOrderTraverseTree(INode node) {
		if (node != null) {
			postOrderTraverseTree(getLeft(((ArrayTreeNode) node).getIndex()));
			postOrderTraverseTree(getRight(((ArrayTreeNode) node).getIndex()));
			System.out.println(node.getData());
		}
	}

	/**
	 * gets left child of node from array
	 * 
	 * @param index
	 * @return node
	 */
	private INode getLeft(int index) {
		return abt[(2 * index)];
	}

	/**
	 * gets right child of node from array
	 * 
	 * @param index
	 * @return node
	 */
	private INode getRight(int index) {
		return abt[(2 * index + 1)];
	}

	/**
	 * only for test
	 * 
	 * @param node
	 * @param list
	 */
	public void inOrderTraverseTree(INode node, List<T> list) {
		if (node != null) {
			inOrderTraverseTree(getLeft(((ArrayTreeNode) node).getIndex()), list);
			list.add((T) node.getData().getValue());
			inOrderTraverseTree(getRight(((ArrayTreeNode) node).getIndex()), list);
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
			preOrderTraverseTree(getLeft(((ArrayTreeNode) node).getIndex()), list);
			preOrderTraverseTree(getRight(((ArrayTreeNode) node).getIndex()), list);

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
			postOrderTraverseTree(getLeft(((ArrayTreeNode) node).getIndex()), list);
			postOrderTraverseTree(getRight(((ArrayTreeNode) node).getIndex()), list);
			list.add((T) node.getData().getValue());
		}
	}
}
