package com.ycc.minheight;
//Create the mini height tree
import java.util.Stack;

public class MinHeightTreeTest {

	/**
	 * @param args
	 */
	public  BTNode addToTree(int [] a, int begin, int end){
		if(begin > end)
			return null;
		int mid = (begin + end)>>1;
		BTNode root = new BTNode(a[mid]);
		root.setLeft(addToTree(a,begin,mid-1));
		root.setRight(addToTree(a,mid+1,end));
		
		return root;
	}
	public BTNode createMinHeightTree(int [] a){
		
		return addToTree(a,0,a.length-1);
		
	}
	public void preOrder(BTNode root){
		if(root != null){
			System.out.print(" "+root.getKey());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}
	public void preOrderIterative(BTNode root){
		Stack <BTNode> st = new Stack<BTNode>();
		st.push(root);
		while(!st.isEmpty()){
			BTNode tmp = st.pop();
			if(tmp == null)
				break;
			System.out.print(" "+tmp.getKey());
			if(tmp.getRight() != null)
				st.push(tmp.getRight());
			if(tmp.getLeft() != null)
			    st.push(tmp.getLeft());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,3,4,6,34,67,78,89,90,91,92};
		MinHeightTreeTest mhtt = new MinHeightTreeTest();
		BTNode root;
		
		root = mhtt.createMinHeightTree(a);
		
		mhtt.preOrder(root);
		System.out.println();
		System.out.println("------------------------------");
		mhtt.preOrderIterative(root);
	}

}
