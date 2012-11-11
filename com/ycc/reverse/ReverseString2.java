package com.ycc.reverse;
//reverse the sentence for example  I am a boy --> boy a am I
public class ReverseString2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "I am a boy";
		String c ="";
		String [] b = a.split(" ");
		for(int i = b.length-1; i >= 0; i--)
			c = c + b[i]+" ";
        
		
		System.out.print(c);
	}

}
