package tree;
import node.INode;
import node.LinkedTreeNode;

public class LinkedBinaryTree<T extends Comparable<T>> extends BinaryTreeAbstract<T> {

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
					if (focusNode == null){
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

	

}
