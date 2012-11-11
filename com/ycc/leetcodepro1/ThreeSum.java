package com.ycc.leetcodepro1;
//Find the three number from array and the sum is 0
import java.util.*;

public class ThreeSum {
	public ArrayList<ArrayList<Integer>> threeSum(int [] num){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(num.length < 3)
			return result;
		
		Arrays.sort(num);
		
		for(int i = 0 ; i < num.length; i++){
			int target = -1 * num[i];
			twoSumWithHole(num,target,i,result);
			while(i + 1 < num.length && num[i + 1] == num[i]){
				i++;
			}
		}
		return result;
	}
	
	public void twoSumWithHole(int [] num, int target, int i, ArrayList<ArrayList<Integer>> result){
		int l = i + 1;
		int r = num.length - 1;
		while(l < r){
			int sum = num[l] + num[r];
			if(sum == target){
				ArrayList <Integer> couple = new ArrayList <Integer>();
				couple.add(num[i]);
				couple.add(num[l]);
				couple.add(num[r]);
				while(l + 1 < r && num[l + 1] == num[l]){
					l++;
				}
				l++;
				while(r - 1 > l && num[r - 1] == num[r]){
					r--;
				}
				r--;
			}else if(sum < target){
				l++;
			}else{
				r--;
			}
		}
	}
	public static void main(String [] args){
		ThreeSum ts = new ThreeSum ();
		int [] num = {0,0,0};
		ArrayList<ArrayList<Integer>> result = ts.threeSum(num);
		for(int i = 0; i < result.size(); i ++){
			ArrayList<Integer> couple = result.get(i);
			for(int j = 0 ; j < couple.size(); j++){
				System.out.print(couple.get(j)+" ");
			}
			System.out.println();
		}
	}
}
