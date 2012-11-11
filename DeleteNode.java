//delete node from linked list
public class DeleteNode {

	/**
	 * @param args
	 */
	public void printNodeValue3(Node n){
		while(n != null){
			System.out.print(n.getData()+"-->");
			n = n.next;
		}
	}
	public Node deleteFunction(Node n, int deleteValue){
		Node pHead = n;
		Node nextNode = n.next;
		if(n.getData() == deleteValue){
			return n.next;
		}else{
			while(nextNode.getData() != deleteValue){
				n = n.next;
				nextNode = nextNode.next;
			}
			n.next = nextNode.next;
			return pHead;
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteNode dn = new DeleteNode();
		Node deletedHead = null;
		
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
	
		deletedHead = dn.deleteFunction(n1,1);
		dn.printNodeValue3(deletedHead);
	}

}
