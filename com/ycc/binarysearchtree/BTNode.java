package com.ycc.binarysearchtree;

public class BTNode {
    private int key;
    private BTNode left;
    private BTNode right;
    public BTNode(int key) {
      this(key, null, null);
    }
    public BTNode(int key, BTNode left, BTNode right) {
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
    public BTNode getLeft() {
         return left;
    }
    public void setLeft(BTNode left) {
        this.left = left;
    }
    public BTNode getRight() {
        return right;
    }
    public void setRight(BTNode right) {
        this.right = right;
    }
}