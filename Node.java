
class Node{
    private int data;
	Node next = null;
	
	public Node(int d){
		this.setData(d);
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}
	
	public void setNextNode(Node next){
		this.next = next;
	}
}
