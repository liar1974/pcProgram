package com.ycc.binarysearchpackage;
// binary search
public class binarySearch1 {
	
	public static int findNumber(int [] a, int first, int last, int target){
		if(a[first] > a[last])
			System.out.println("This is unsorted array");
		while(first < last){
			int mid = (first + last)/2;
			if(a[mid] == target)
				return mid;
			if(a[mid] > target)
				last = mid;
			if(a[mid] < target)
				first = mid;
		}
		
		return -1;
	}
	public static void main(String [] args){
		int [] a = {12,34,35,42,47,56,59,60,61,65,11};
		int target = 11;
		int location;
		
		location = findNumber(a,0,a.length-1,target);
		System.out.print(location);
	}
}
