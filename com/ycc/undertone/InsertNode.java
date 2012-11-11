package com.ycc.undertone;
//Insert a sorted circular linked list and make sure it is always sorted
public class InsertNode {
	public static Node insertNodeMethod(Node firstNode, Node targetNode){
		if(targetNode == null)
	    	 return firstNode;
	     if(firstNode == null)
	    	 return null; 
		 Node runner = firstNode;
	     Node runner2 = firstNode.next;
	     
	     while(runner2 != firstNode){
	    	 if(runner.data < targetNode.data && targetNode.data < runner2.data)
	    		 break;
	    	 
	          runner = runner.next;
	          runner2 = runner2.next;
	     }
	     runner.next = targetNode;
	     targetNode.next = runner2;
	     
	     return firstNode; 
	}
	public static void main(String [] args){
		Node n1 = new Node(1);
		n1.next = new Node(3);
		n1.next.next = new Node(4);
		n1.next.next.next = new Node(5);
		n1.next.next.next.next = n1;

		Node test1 = n1;
		for(int i = 0; i <= 10; i++){
			System.out.print(test1.data+"-->");
			test1 = test1.next;
		}
		System.out.println();
		Node test2 = insertNodeMethod(n1,new Node(0));
		
		if(test2 == null)
			System.out.println("Error");
		else{
			for(int i = 0; i <= 10; i++){
				System.out.print(test2.data+"-->");
				test2 = test2.next;
			}
		}
		
	}
}
