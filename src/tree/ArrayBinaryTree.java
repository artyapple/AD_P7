package tree;

import java.util.Arrays;
import java.util.List;

import node.ArrayTreeNode;
import node.INode;

public class ArrayBinaryTree<T extends Comparable<T>> implements BinaryTree<T> {

	private static final int ROOT_INDEX = 1;
	private static final int SIZE = 20;
	private ArrayTreeNode[] abt = new ArrayTreeNode[SIZE];

	@Override
	public <T> void add(INode node) {

		ArrayTreeNode nd = (ArrayTreeNode) node;

		if (abt[ROOT_INDEX] == null) {
			nd.setIndex(ROOT_INDEX);
			abt[ROOT_INDEX] = nd;
		} else {
			// Set root as the Node we will start
			// with as we traverse the tree
			int focusNode = ROOT_INDEX;
			// Future parent for our new Node
			int parent;

			while (true) {
				// root is the top parent so we start
				// there
				parent = focusNode;
				// Check if the new node should go on
				// the left side of the parent node
				if (abt.length - 1 < focusNode * 2 + 1) {
					increaseSize(focusNode * 2 + 1);
				}

				if (nd.getData().compareTo(abt[focusNode].getData()) < 0) {
					abt[focusNode].setLeftSubTreeSum((Integer)node.getData().getValue());
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
					abt[focusNode].setRightSubTreeSum((Integer)node.getData().getValue());
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
	public int getSumAllValues(int from, int until) {
		if(from>until){
			throw new IllegalArgumentException("wrong argument");
		}
		return getSumUntilLastElement(from, abt[ROOT_INDEX], LE) - getSumUntilLastElement(until, abt[ROOT_INDEX], GE);
	}
	
	/**
	 * calculate sub sum
	 * 
	 * @param value
	 * @param inode
	 * @param type
	 * @return sum
	 */
	@SuppressWarnings("rawtypes")
	private int getSumUntilLastElement(int value, INode inode, int type) {
		ArrayTreeNode node = (ArrayTreeNode) inode;
		int sum = 0;
		
		if (node != null) {
			
			int nodeVal = (Integer) node.getData().getValue();
			if (nodeVal == value) {
				if(type == LE){
					sum = nodeVal + node.getRightSubTreeSum();
				} else {
					sum = node.getRightSubTreeSum();
				}				
			} else if(nodeVal > value){
				sum = nodeVal + node.getRightSubTreeSum();
				sum += getSumUntilLastElement(value, getLeft(node.getIndex()), type);
			} else if(nodeVal < value){
				sum = getSumUntilLastElement(value, getRight(node.getIndex()), type);
			}
		}

		System.out.println("SUM: "+sum);
		return sum;
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
		return getNode(2 * index);
	}

	/**
	 * gets right child of node from array
	 * 
	 * @param index
	 * @return node
	 */
	private INode getRight(int index) {
		return getNode(2 * index + 1);
	}
	
	/**
	 * get node by array index
	 * 
	 * @param index
	 * @return
	 */
	private INode getNode(int index){
		if(abt.length-1<index){
			return null;
		} else{
			return abt[index];
		}
	}

	/**
	 * increase Array size
	 * 
	 * @param incr
	 */
	private void increaseSize(int incr) {
		ArrayTreeNode newArray[] = Arrays.copyOf(abt, abt.length + incr);
		abt = newArray;
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
