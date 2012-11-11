package com.ycc.stacksimulatequeue;
import java.util.*;
//Using two stack to implement the queue
public class myQueue <T>{
	Stack <T> s1,s2;
	public myQueue(){
		s1 = new Stack<T>();
		s2 = new Stack<T>();
	}
	
	public int size(){
		return s1.size()+s2.size();
	}
	
	public void add(T value){
		s1.push(value);
	}
	
	public T peek(){
		if(!s2.isEmpty())
			return s2.peek();
		while(!s1.isEmpty())
			s2.push(s1.pop());
		return s2.peek();
	}
	
	public T remove(){
		if(!s2.isEmpty())
			return s2.pop();
		while(!s1.isEmpty())
			s2.push(s1.pop());
		return s2.pop();
	}
}
