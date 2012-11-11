package com.ycc.pro0202;
//Find the node n to the last one in the linked list
public class nToLast {

	/**
	 * @param args
	 */
	public static int nthTolast(Node head, int k){
		if(head == null)
			return 0;
		
		int i = nthTolast(head.next,k)+1;
		if(i == k){
			System.out.println(head.data);
		}
		
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next.next = new Node(8);
		
		nthTolast(head,3);
	}

}
