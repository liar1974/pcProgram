package com.ycc.stacksimulatequeue;

public class myQueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myQueue <Integer> mq = new myQueue<Integer> ();
		System.out.println(mq.size());
		mq.add(1);
		mq.add(2);
		mq.add(3);
		int q = mq.peek();
		System.out.println(q);
		mq.remove();
		System.out.println(mq.peek());
		mq.add(3);
		System.out.println(mq.peek());

	}

}
