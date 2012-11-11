package com.ycc.maxsumofsubtree;
//Find the max sum of subtree
public class findMaxSumOfSubtree {

	/**
	 * @param args
	 */
    public int MAX = Integer.MIN_VALUE;
	public int findMethod(treeNode root){
		int valL = 0,valR = 0,res = root.getKey();
		  if(root.getLeft() != null ||root.getRight() != null)
		  {
		    if(root.getLeft() != null)
		    {
		      valL = findMethod(root.getLeft());
		    }
		    if(root.getRight() != null)
		    {
		      valR = findMethod(root.getRight());
		    }
		    res = res + valL + valR;
		    if(res > MAX)
		    {
		      
		      MAX = res;
		    }
		    return res; 
		  }
		  else
		  {
		    if(root.getKey() > MAX)
		    {
		      
		      MAX = root.getKey();
		    }
		    return root.getKey();
		  }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treeNode t4 = new treeNode(6);
		treeNode t5 = new treeNode(-1);
		treeNode t6 = new treeNode(-2);
		treeNode t7 = new treeNode(3);
		
		treeNode t2 = new treeNode(3,t4,t5);
		treeNode t3 = new treeNode(4,t6,t7);
		
		treeNode t1 = new treeNode(-15,t2,t3);
		
		int sum2 = new findMaxSumOfSubtree().findMethod(t1);
		
		System.out.print(sum2);
	}
}
