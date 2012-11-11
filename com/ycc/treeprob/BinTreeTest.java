package com.ycc.treeprob;

import java.util.*;
//Find the common ancestor tree node
public class BinTreeTest {

	/**
	 * @param args
	 */
	public BTNode commonAncestor(BTNode root, BTNode p, BTNode q){
		if(cover(root.getLeft(),p) && cover(root.getLeft(),q))
			return commonAncestor(root.getLeft(),p,q);
		if(cover(root.getRight(),p) && cover(root.getRight(),q))
			return commonAncestor(root.getRight(),p,q);
		return root;
	}
	
	public boolean cover(BTNode root, BTNode p){
		if(root == null) return false;
		if(root == p)return true;
		return cover(root.getLeft(),p) || cover(root.getRight(),p);
	}
	
	public void printNodeLevelByLevel(BTNode root){
		Queue<BTNode> qt = new LinkedList <BTNode>();
	//	int level = 1;
		if(root == null)
			System.out.println("Root node is empty");
		
		qt.add(root);
		while(qt.size()!=0){
			int tmpCount = qt.size();
			for(int i = 0; i < tmpCount; i++){
				BTNode tmpNode = qt.poll();
				if(tmpNode.getLeft() != null)
					qt.add(tmpNode.getLeft());
				if(tmpNode.getRight() != null)
					qt.add(tmpNode.getRight());
				//if(tmpNode.getLeft() == null && tmpNode.getRight() == null)
				//	continue;
				System.out.print(tmpNode.getKey()+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinTreeTest btt = new BinTreeTest();
	       BTNode tmp;
	       
	       BTNode nine = new BTNode(9);
	       BTNode eight = new BTNode(8);
	       BTNode seven = new BTNode(7);
	       BTNode six = new BTNode(6,nine,null);
	       BTNode five = new BTNode(5,eight,null);
	       BTNode four = new BTNode(4,seven,null);
	       BTNode three = new BTNode(3,null,six);
	       BTNode two = new BTNode(2,four,five);
	       BTNode one = new BTNode(1,two,three);
	       
	       tmp = btt.commonAncestor(one, six, nine);
	       System.out.print(tmp.getKey());
	       System.out.println();
	       btt.printNodeLevelByLevel(one);
	       
	}

}
