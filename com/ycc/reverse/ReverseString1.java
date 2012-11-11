package com.ycc.reverse;
//reverse string 
public class ReverseString1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a = "abcdefgh";
       char [] b = a.toCharArray();
     
    	   for(int i = 0; i < b.length / 2; i++){
    		   char tmp = b[i];
    		   b[i] = b[b.length-1-i];
    		   b[b.length-1-i] = tmp;
    	   }
    	   System.out.print(b);
       
	}

}
