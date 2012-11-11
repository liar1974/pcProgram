package com.ycc.pro0204;


//Split one linked list to two linked list by some value
public class SplitLinkList {

	/**
	 * @param args
	 */
	public static Node partition(Node node, int x){
		Node beforeStart = null;
		Node beforeEnd = null;
		Node afterStart = null;
		Node afterEnd = null;
		
		while(node != null){
			Node next = node.next;
			node.next = null;
			if(node.data < x){
				if(beforeStart == null){
					beforeStart = node;
					beforeEnd = beforeStart;
				}else{
					beforeEnd.next = node;
					beforeEnd = node;
				}
			}else{
				if(afterStart == null){
					afterStart = node;
					afterEnd = afterStart;
				}else{
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			
			node = next;
		}
		
		if(beforeStart == null)
			return afterStart;
		
		beforeEnd.next = afterStart;
		
		return beforeStart;
	}
	public static void main(String[] args) {
		Node head = new Node(7);
		head.next = new Node(5);
		head.next.next = new Node(3);
		head.next.next.next = new Node(1);
		head.next.next.next.next = new Node(9);
		head.next.next.next.next.next = new Node(4);
		head.next.next.next.next.next.next = new Node(5);
		head.next.next.next.next.next.next.next = new Node(10);
		
		Node newHead = partition(head,1);
		
		while(newHead != null){
			System.out.print(newHead.data+"-->");
			newHead = newHead.next;
		}
	}

}
