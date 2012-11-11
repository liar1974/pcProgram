//Find the node which have n steps to the end
public class FindNode {

	/**
	 * @param args
	 */
	public Node findBackM(Node head, int m){
		Node p1 = head;
		Node p2 = head;
		while(m > 1){
			p2 = p2.next;
			m--;
		}
		
		while(p2.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNode fn = new FindNode();
		Node resultNode = null;
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		
		n1.setNextNode(n2);
		n2.setNextNode(n3);
		n3.setNextNode(n4);
		n4.setNextNode(n5);
		n5.setNextNode(n6);
		n6.setNextNode(n7);
		n7.setNextNode(n8);
		
		resultNode = fn.findBackM(n1,1);
		
		System.out.print(resultNode.getData());
	}

}
