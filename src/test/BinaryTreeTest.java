package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import node.ArrayTreeNode;
import node.Data;
import node.LinkedTreeNode;
import tree.ArrayBinaryTree;
import tree.LinkedBinaryTree;

public class BinaryTreeTest {
	
	private static final int[] TEST_DATA = {7, 2, 5, 8, 1, 4, 3, 9, 10, 6};
	private static final int[] IN_ORDER = {1,2,3,4,5,6,7,8,9,10};
	private static final int[] PRE_ORDER = {7,2,1,5,4,3,6,8,9,10};
	private static final int[] POST_ORDER = {1,3,4,6,5,2,10,9,8,7};
	
	private LinkedBinaryTree<Integer> lbt;
	private ArrayBinaryTree<Integer> abt;
	
	private LinkedTreeNode<Integer> rootLink;
	private ArrayTreeNode<Integer> rootArr;
	List<Integer> result = new ArrayList<>();
	
	@Before
	public void before(){
		lbt = new LinkedBinaryTree<>();
		abt = new ArrayBinaryTree<>();
		rootLink = new LinkedTreeNode<>(new Data<>(new Integer(TEST_DATA[0])));
		rootArr = new ArrayTreeNode<>(new Data<>(new Integer(TEST_DATA[0])));
		lbt.add(rootLink);
		abt.add(rootArr);
		for(int i = 1;i<TEST_DATA.length ; i++){
			lbt.add(new LinkedTreeNode<>(new Data<>(new Integer(TEST_DATA[i]))));
			abt.add(new ArrayTreeNode<>(new Data<>(new Integer(TEST_DATA[i]))));
		}
	}
	
	@Test
	public void testArrayBinaryTree() {
		abt.inOrderTraverseTree(rootLink, result);
		checkResult(result, IN_ORDER);
		abt.preOrderTraverseTree(rootLink, result);
		checkResult(result, PRE_ORDER);
		abt.postOrderTraverseTree(rootLink, result);
		checkResult(result, POST_ORDER);
	}
	
	@Test
	public void testLinkedBinaryTree() {
		lbt.inOrderTraverseTree(rootLink, result);
		checkResult(result, IN_ORDER);
		lbt.preOrderTraverseTree(rootLink, result);
		checkResult(result, PRE_ORDER);
		lbt.postOrderTraverseTree(rootLink, result);
		checkResult(result, POST_ORDER);	
	}
	
	private void checkResult(List<Integer>actualRes, int[] expectedRes){
		int j = 0;
		for(Integer i : actualRes){
			Assert.assertEquals(expectedRes[j], i.intValue());
			j++;
		}		
		actualRes.clear();
	}

}
