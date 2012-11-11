package com.ycc.pro0302two;
import java.util.Stack;
//Implement the stack to always to return the min value
@SuppressWarnings("serial")
public class StackWithMin2 extends Stack<Integer>{
	Stack<Integer> s2;
	public StackWithMin2(){
		s2 = new Stack<Integer>();
	}
	public void push(int value){
		super.push(value);
		if(s2.isEmpty())
			s2.push(value);
		else{
			if(s2.peek()>= value)
				s2.push(value);
		}
	}
	public Integer pop(){
		int value = super.pop();
		if(value == s2.peek())
			s2.pop();
		
		return value;
	}
	public int returnMinValue(){
		if(s2.isEmpty())
			System.out.println("Please push into value");
		int minValue = s2.peek();
		return minValue;
	}
}
