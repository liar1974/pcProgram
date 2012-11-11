
public class LinkedListTest {

	/**
	 * @param args
	 */
	public void printNodeValue(Node n){
		while(n != null){
			System.out.print(n.getData()+"-->");
			n = n.next;
		}
	}
	public Node reverseFunction(Node pHead){
		if(pHead == null || pHead.next == null)
			return null;
		
		Node pos1= pHead;
		Node pos2= null;
		Node bufnode;
		
		while(pos1 != null){
			bufnode = pos1;
			pos1 = pos1.next;
			bufnode.next = pos2;
			pos2 = bufnode;
		}
		return pos2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListTest llt = new LinkedListTest();
		Node reverseHead = null;
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		
		n1.setNextNode(n2);
		n2.setNextNode(n3);
		n3.setNextNode(n4);
		n4.setNextNode(n5);
		n5.setNextNode(n6);
	
		reverseHead = llt.reverseFunction(n1);
		llt.printNodeValue(reverseHead);
	}

}
