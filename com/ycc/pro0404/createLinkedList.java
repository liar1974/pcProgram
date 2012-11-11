package com.ycc.pro0404;

import java.util.*;
//Store the node of the tree into linkedlist level by level
public class createLinkedList {

	/**
	 * @param args
	 */
	ArrayList<LinkedList<BTNode>> findLevelLinkList(BTNode root){
		int level = 0;
		ArrayList<LinkedList<BTNode>> result = new ArrayList<LinkedList<BTNode>>();
		LinkedList<BTNode> list = new LinkedList<BTNode>();
		list.add(root);
		result.add(level,list);
		while(true){
			list = new LinkedList<BTNode>();
			for(int i = 0; i < result.get(level).size(); i++){
				BTNode n = (BTNode) result.get(level).get(i);
				if(n != null){
					if(n.getLeft() != null)
						list.add(n.getLeft());
					if(n.getRight() != null)
						list.add(n.getRight());
				}
			}
			if(list.size() > 0){
				result.add(level+1,list);
			}else
				break;
			
			level++;
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BTNode seven = new BTNode(7);
        BTNode eight = new BTNode(8);
        BTNode nine = new BTNode(9);
        BTNode ten = new BTNode(10);
        BTNode four = new BTNode(4,null,seven);
        BTNode five = new BTNode(5,eight,nine);
        BTNode six = new BTNode(6,ten,null);
        BTNode two = new BTNode(2,four,null);
        BTNode three = new BTNode(3,five,six);
        BTNode one = new BTNode(1,two,three);
        
        createLinkedList cll = new createLinkedList();
        
        ArrayList<LinkedList<BTNode>> al = new ArrayList<LinkedList<BTNode>>();
        al = cll.findLevelLinkList(one);
        for(int i = 0; i < al.size(); i++){
        	System.out.print("Level"+i+":");
        	for(int j = 0; j < al.get(i).size(); j++)
        		System.out.print(al.get(i).get(j).getKey()+" ");
        	
        	System.out.println();
        }
	}

}
