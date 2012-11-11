//Insert node into linked list
public class InsertNodeTest {

	/**
	 * @param args
	 */
	public void printNodeValue2(Node n){
		while(n != null){
			System.out.print(n.getData()+"-->");
			n = n.next;
		}
	}
	public Node insertFunction(Node ph, int intValue){
		Node phead = ph;
		Node newNode = new Node(intValue);
		
		while(ph.getData() != 4)
			ph = ph.next;
		
		newNode.next = ph.next;
		ph.next = newNode;
		return phead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    InsertNodeTest iint = new InsertNodeTest();
		Node insertedHead = null;
		
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
	
		insertedHead = iint.insertFunction(n1,3);
		iint.printNodeValue2(insertedHead);
	}

}
