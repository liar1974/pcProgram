package com.ycc.pro0409;

public class TreeNode {
	private TreeNode left;
	private TreeNode right;
	private int data;
	
	public TreeNode(int d){
		this.setData(d);
	}
    public void setData(int d){
    	this.data = d;
    }
    
    public int getData(){
    	return this.data;
    }
    
    public void setLeftNode(TreeNode left){
    	this.left = left;
    }
    
    public void setRightNode(TreeNode right){
    	this.right = right;
    }
    
    public TreeNode getLeftNode(){
    	return this.left;
    }
    public TreeNode getRightNode(){
    	return this.right;
    }
}

