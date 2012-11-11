package com.ycc.findMaxMin;
//Find the max and min value of the array in O(n)
public class findMaxMinValue {

	/**
	 * @param args
	 */
	public static void findMaxValue(int [] a){
		for(int i = 0; i < a.length-1; i++){
			if(a[i] > a[i+1]){
				int tmp = a[i];
				a[i] = a[i+1];
				a[i+1] = tmp;
			}
		}
		System.out.print(a[a.length-1]);
	}
	public static void findMinValue(int [] a){
		for(int i = 0; i < a.length-1; i++){
			if(a[i] < a[i+1]){
				int tmp = a[i];
				a[i] = a[i+1];
				a[i+1] = tmp;
			}
		}
		System.out.print(a[a.length-1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {34,2,45,3,6,44,23,1,56,23};
		findMaxValue(a);
		System.out.println();
		System.out.println("-----------------");
		findMinValue(a);

	}

}
