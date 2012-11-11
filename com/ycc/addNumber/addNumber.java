package com.ycc.addNumber;
//add two strings which contains number
public class addNumber {
	public int getDigit(String s, int index){
		if(index < 0)
			return 0;
		if(s.charAt(index) == '1')
			return 1;
		else
			return 0;
	}
	public String addBinary(String a, String b){
		int alength = a.length();
		int blength = b.length();
		
		StringBuilder sb = new StringBuilder();
		
		int carry = 0;
		
		for(int i = 0 ; i < Math.max(alength, blength); i++){
			int sum = carry + getDigit(a,alength - i - 1) + getDigit(b,blength - i - 1);
		    sb.append(sum % 2);
		    carry = sum / 2;
		}
		if(carry == 1)
			sb.append(carry);
		
		return sb.reverse().toString();
	}
	public static void main(String [] args){
		addNumber an = new addNumber();
		String a = new String("1111");
		String b = new String("1");
		String result = an.addBinary(a, b);
		
		System.out.println(result);
	}
}
