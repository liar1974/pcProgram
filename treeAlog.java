//make a sorted array to be the mini height of BST
public class treeAlog {
	public TreeNode addToTree(int [] arr, int start, int end){
		if (start > end)
			return null;
		int mid = (start + end)/2;
		TreeNode n = new TreeNode(arr[mid]);
		n.left = addToTree(arr, start, mid-1);
		n.right = addToTree(arr, mid+1, end);
		
		return n;
	}
	
	public TreeNode createMinimalBST(int array[]){
		return addToTree(array, 0, array.length-1);
	}
	
	public void travel(TreeNode root){
	
		if(root != null){
			
			travel(root.left);
			
			travel(root.right);
			System.out.println(root.getData());
		}
		return;
	}
	public static void main(String [] args){
		int [] arr = {1,3,5,6,2,8,45};
		TreeNode tn;
		treeAlog ta = new treeAlog();
		tn = ta.createMinimalBST(arr);
		ta.travel(tn);
		
	}

}
