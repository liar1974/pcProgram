//Find common ancestor of two nodes
public class FindCommonAncestor {

	/**
	 * @param args
	 */
	public static boolean covers(TreeNode root, TreeNode p){
		if(root == null)
			return false;
		if(root == p)
			return true;
		
		return covers(root.getLeftNode(),p) || covers(root.getRightNode(),p);
	}
	public static TreeNode commonAncestorHelper(TreeNode root, TreeNode p, TreeNode q){
		if(root == null)
			return null;
		if(p == null || q == null)
			return null;
		if(root == p || root == q)
			return root;
		boolean is_p_on_left = covers(root.getLeftNode(),p);
		boolean is_q_on_left = covers(root.getLeftNode(),q);
		
		if(is_p_on_left != is_q_on_left)
			return root;
		
		TreeNode child_side = is_p_on_left ? root.getLeftNode():root.getRightNode();
		
		return commonAncestorHelper(child_side,p,q);
	}
	public static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q){
		if(!covers(root,p) || !covers(root,q))
			return null;
		
		return commonAncestorHelper(root,p,q);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(34);
		TreeNode t3 = new TreeNode(45);
		TreeNode t4 = new TreeNode(78);
		TreeNode t5 = new TreeNode(12);
		TreeNode t6 = new TreeNode(3);
		TreeNode t7 = new TreeNode(8);
		TreeNode t8 = new TreeNode(6);
		TreeNode t9 = new TreeNode(45);
		TreeNode t10 = new TreeNode(67);
		
		t1.setLeftNode(t2);
		t1.setRightNode(t3);
		
		t2.setLeftNode(t4);
		t2.setRightNode(t5);
		
		t3.setLeftNode(t6);
		t3.setRightNode(t7);
		
		t4.setLeftNode(t8);
		t5.setLeftNode(t9);
		t5.setRightNode(t10);
		
		TreeNode tn = commonAncestor(t1,t4,t5);
		
		System.out.print(tn.getData());
	}

}
