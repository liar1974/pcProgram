package com.ycc.sumax;
//Find the max sum of the sub array. Greedy algorithm. O(n)
public class SubMax {

	/**
	 * @param args
	 */
	public int findSubMax1(int [] a){
		int maxSum = 0;
		int b = 0;
		for(int i = 0; i < a.length; i++){
			if(b < 0)
				b = a[i];
			else
				b += a[i];
			
			if(maxSum < b)
				maxSum = b;
		}
		return maxSum;
	}
	
	public int findSubMax2(int [] a){
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = i; j < a.length; j++){
				for(int k = i; k <= j; k++){
					sum += a[k];
				}
				if(sum > maxSum)
					maxSum = sum;
				
				sum = 0;
			}
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubMax sm = new SubMax();
		int [] a={1, -2, 3, 10, -4, 7, 2, -5};
		int sum1, sum2;
		
		sum1 = sm.findSubMax1(a);
		System.out.println(sum1);
         
		sum2 = sm.findSubMax2(a);
		System.out.println(sum2);
	}

}
