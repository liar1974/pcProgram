package com.ycc.maxsumofsubtree;

public class treeNode {
	private int key;
    private treeNode left;
    private treeNode right;
    public treeNode(int key) {
      this(key, null, null);
    }
    public treeNode(int key, treeNode left, treeNode right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }
    public int getKey() {
         return key;
    }
    public void setKey(int key) {
         this.key = key;
    }
    public treeNode getLeft() {
         return left;
    }
    public void setLeft(treeNode left) {
        this.left = left;
    }
    public treeNode getRight() {
        return right;
    }
    public void setRight(treeNode right) {
        this.right = right;
    }
}
