package com.ycc.pro0302;

public class StackMinTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StackWithMin  swm = new StackWithMin ();
        swm.push(24);
        swm.push(56);
        swm.push(34);
        swm.push(23);
        swm.push(45);
        
        System.out.print(swm.peek().min);
	}

}
