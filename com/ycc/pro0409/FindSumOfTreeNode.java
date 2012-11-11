package com.ycc.pro0409;
//Find the tree node whose sum is given number
public class FindSumOfTreeNode {

	/**
	 * @param args
	 */
	public static void findSum(TreeNode node, int sum){
		int depth = findDepth(node);
		int [] path = new int [depth];
		findSum(node, path, sum, 0);
	}
	
	public static int findDepth(TreeNode node){
		if(node == null)
			return 0;
		
		return 1 + Math.max(findDepth(node.getLeftNode()), findDepth(node.getRightNode()));
	}
	
	public static void print(int [] path, int begin, int end){
		for(int i = begin; i <= end; i++)
			System.out.print(path[i]+",");
		
		System.out.println();
	}
	public static void findSum(TreeNode node, int [] path, int sum, int level){
		if(node == null)
			return;
		
		path[level] = node.getData();
		int t = 0;
		
		for(int i = level; i >= 0; i--){
			t += path[i];
			if(t == sum)
				print(path, i,level);
		}
		
		findSum(node.getLeftNode(),path,sum,level+1);
		findSum(node.getRightNode(),path,sum,level+1);
		
		//path[level] =  Integer.MIN_VALUE;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(34);
		TreeNode t3 = new TreeNode(45);
		TreeNode t4 = new TreeNode(78);
		TreeNode t5 = new TreeNode(12);
		TreeNode t6 = new TreeNode(3);
		TreeNode t7 = new TreeNode(8);
		TreeNode t8 = new TreeNode(6);
		TreeNode t9 = new TreeNode(45);
		TreeNode t10 = new TreeNode(67);
		TreeNode t11 = new TreeNode(-78);
		TreeNode t12 = new TreeNode(-12);
		
		t1.setLeftNode(t2);
		t1.setRightNode(t3);
		
		t2.setLeftNode(t4);
		t2.setRightNode(t5);
		
		t3.setLeftNode(t6);
		t3.setRightNode(t7);
		
		t4.setLeftNode(t8);
		t4.setRightNode(t11);
		
		t5.setLeftNode(t9);
		t5.setRightNode(t10);
		
		t6.setLeftNode(t12);
	   	
		findSum(t1,36);
	}

}
