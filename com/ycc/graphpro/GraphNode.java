package com.ycc.graphpro;

import java.util.ArrayList;

public class GraphNode {
	private int state;
	private String nodeName;
	ArrayList <String> adjacentNode = null;
	public GraphNode(int state,String nodeName){
		this.setState(state);
		this.setNodeName(nodeName);
		adjacentNode = new ArrayList <String>();
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	public void addAjacentNode(String newNode){
		adjacentNode.add(newNode);
	}
}
