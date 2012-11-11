package com.ycc.pro0302;

import java.util.*;
//Implement stack to always return the min value of the whole stack
public class StackWithMin extends Stack<NodeWithMin> {
	
	public void push(int value){
		int newMinValue = Math.min(value,min());
		super.push(new NodeWithMin(value,newMinValue));
	}
	
	public int min(){
		if(this.isEmpty())
			return Integer.MAX_VALUE;
		else
			return peek().min;
	}
}
