package com.ycc.deletedup;
//Delete the duplicate node of the linked list
public class DeleteDupNode {

	/**
	 * @param args
	 */
	public static Node deleteMethod(Node head){
		if(head == null) return null;
		
		Node current = head;
		while(current != null){
			Node runner = current;
			while(runner.next != null){
				if(runner.next.data == current.data){
					runner.next = runner.next.next;
				}else{
					runner = runner.next;
				}
			}
			current = current.next;
		}
		
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(1);
		n1.next = new Node(1);
		n1.next.next = new Node(1);
		n1.next.next.next = new Node(1);
		n1.next.next.next.next = new Node(1);
		n1.next.next.next.next.next = new Node(1);
		n1.next.next.next.next.next.next = new Node(1);
		n1.next.next.next.next.next.next.next = new Node(1);
		
		
		System.out.println();
		Node head2 = deleteMethod(n1);
		while(head2 != null){
			System.out.print(head2.data+"-->");
			head2 = head2.next;
		}
	}

}
