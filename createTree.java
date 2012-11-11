
public class createTree {

	/**
	 * @param args
	 */
	public void printTreeInOrder(TreeNode root){

        if(root != null){
        	printTreeInOrder(root.getLeftNode());
        	System.out.println(root.getData());
        	printTreeInOrder(root.getRightNode());
        }
	}
	public void printTreePosOrder(TreeNode root){
        
		if(root != null){
        	printTreeInOrder(root.getLeftNode());
        	
        	printTreeInOrder(root.getRightNode());
        	System.out.println(root.getData());
        }
	}
	public void printTreePreOrder(TreeNode root){
		if(root != null){
			System.out.println(root.getData());
        	printTreeInOrder(root.getLeftNode());
        	
        	printTreeInOrder(root.getRightNode());
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createTree ct = new createTree();
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(34);
		TreeNode t3 = new TreeNode(45);
		TreeNode t4 = new TreeNode(78);
		TreeNode t5 = new TreeNode(12);
		TreeNode t6 = new TreeNode(3);
		TreeNode t7 = new TreeNode(8);
		
		t1.setLeftNode(t2);
		t1.setRightNode(t3);
		
		t2.setLeftNode(t4);
		t2.setRightNode(t5);
		
		t3.setLeftNode(t6);
		t3.setRightNode(t7);
		
		ct.printTreeInOrder(t1);
		System.out.println("---------------");
		ct.printTreePosOrder(t1);
		System.out.println("---------------");
		ct.printTreePreOrder(t1);
		System.out.println("---------------");
	}

}
