//Find the mirror of the tree
public class MirrorRecursively {

	/**
	 * @param args
	 */
	public BTNode mirrorMethod(BTNode pNode){
		if(pNode == null)
			return null;
		if(pNode.getLeft() == null && pNode.getRight() == null)
			return null;
		
		BTNode tmp = pNode.getLeft();
		
		pNode.setLeft(pNode.getRight());
		pNode.setRight(tmp);
		
		if(pNode.getLeft()!= null)
			mirrorMethod(pNode.getLeft());
		if(pNode.getRight() != null)
			mirrorMethod(pNode.getRight());
		
		return pNode;
	}
	public void preOrderTravel(BTNode btRoot){
		if(btRoot != null){
			System.out.print(btRoot.getKey()+" ");
			preOrderTravel(btRoot.getLeft());
			preOrderTravel(btRoot.getRight());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MirrorRecursively mr = new MirrorRecursively();
        BTNode rRoot = null;
        BTNode d = new BTNode('D');
        BTNode e = new BTNode('E');
        BTNode f = new BTNode('F');
        BTNode g = new BTNode('G');
        BTNode b = new BTNode('B',d,e);
        BTNode c = new BTNode('C', f, g);
        BTNode a = new BTNode('A', b, c);
        
        rRoot = mr.mirrorMethod(a);
        mr.preOrderTravel(rRoot);
	}

}
