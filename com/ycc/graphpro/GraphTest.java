package com.ycc.graphpro;
import java.util.*;

public class GraphTest {
	public void printPath(GraphNode src, GraphNode dest){
		Stack <GraphNode> printStack = new Stack <GraphNode> ();
        printStack.push(src);
        src.setState(1);
        while(!printStack.isEmpty()){
        	for(GraphNode g : printStack.peek().nodeInfo){
            	if((!g.getNodeName().equals(dest.getNodeName())) && (g.getState()==0)){
            		g.setState(1);
            		System.out.print(" "+g.getNodeName());
            		printStack.push(g);
            		
            	}else if((!g.getNodeName().equals(dest.getNodeName())) && (g.getState()==1)){
            		continue;
            	}else if(g.getNodeName().equals(dest.getNodeName())){
            		System.out.println(" "+g.getNodeName()+" "+dest.getNodeName());
            	}
            }
            printStack.peek().setState(0);
            printStack.pop();
        }
	}
	public static void main(String [] args){
		GraphTest gt = new GraphTest();
		GraphNode a = new GraphNode(0,"a");
		GraphNode b = new GraphNode(0,"b");
		GraphNode c = new GraphNode(0,"c");
		GraphNode d = new GraphNode(0,"d");
		
		a.addAjacentNode(b);
		a.addAjacentNode(d);
		a.addAjacentNode(c);
		
		b.addAjacentNode(a);
		b.addAjacentNode(c);
		b.addAjacentNode(d);
		
		
		c.addAjacentNode(a);
		c.addAjacentNode(b);
		c.addAjacentNode(d);
		
	
		d.addAjacentNode(b);
		d.addAjacentNode(a);
		d.addAjacentNode(c);
		
		gt.printPath(a,d);
	}
}
