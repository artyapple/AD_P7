package tree;

import java.util.ArrayList;
import java.util.List;

import node.ArrayTreeNode;
import node.Data;
import node.INode;

public class ArrayBinaryTree<T extends Comparable<T>> extends BinaryTreeAbstract<T> {

	static ArrayTreeNode[] abt= new ArrayTreeNode[100];
	private int index;

	public INode getNode(int index) {
		return abt[index];
	}

	@Override
	public <T> void add(INode node) {
		
		index = 1;
		if (abt[index] == null) {

			abt[index] = (ArrayTreeNode) node;

		} else {

			// Set root as the Node we will start
			// with as we traverse the tree

			ArrayTreeNode focusNode = abt[index];

			// Future parent for our new Node

			ArrayTreeNode parent;

			while (true) {

				// root is the top parent so we start
				// there

				parent = focusNode;

				// Check if the new node should go on
				// the left side of the parent node
				if(node.getData().compareTo(focusNode.getData()) < 0){
				while (node.getData().compareTo(focusNode.getData()) < 0) {
					index = index * 2;
					// Switch focus to the left child
					focusNode = abt[index];
					// If the left child has no children
					if (focusNode == null) {
						// then place the new node on the left of it
						
						abt[index] = (ArrayTreeNode) node;
						abt[index].setIndex(index);
						return; // All Done
					}
				}

				}
				else{
				while (node.getData().compareTo(focusNode.getData()) > 0) {
					// If we get here put the node on the right
					index = index * 2 + 1;
					focusNode = abt[index];

					// If the right child has no children

					if (focusNode == null) {

						// then place the new node on the right of it
						
						abt[index] = (ArrayTreeNode) node;
						abt[index].setIndex(index);
						return; // All Done

					}
				}

				
				}
			}

		}
	}
	public static void main(String[]args){
		
		int[] TEST_DATA = {7, 2, 5, 8, 1, 4, 3, 9, 10, 6};
		ArrayBinaryTree<Integer> abt;
		
	
		ArrayTreeNode<Integer> rootArr;
		List<Integer> result = new ArrayList<>();
		abt = new ArrayBinaryTree<>();
		
		rootArr = new ArrayTreeNode<>(new Data<>(new Integer(TEST_DATA[0])));
	
		abt.add(rootArr);
		for(int i = 1;i<TEST_DATA.length ; i++){
			abt.add(new ArrayTreeNode<>(new Data<>(new Integer(TEST_DATA[i]))));
		}
	
	}
		
}
