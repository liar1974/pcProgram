import java.util.HashMap;
//Find two number in array , in order the sum is the target

public class SumToTarget {
	public static int [] function1(int [] arrayNumber, int sum){
		int begin = 0;
		int end = arrayNumber.length - 1;
		int [] result = new int[2];
		while((arrayNumber[begin]+arrayNumber[end]) != sum){
			if((arrayNumber[begin]+arrayNumber[end]) > sum)
				end--;
			else
				begin ++;
		}
		
		result[0] = arrayNumber[begin];
		result[1] = arrayNumber[end];
		
		return result;
	}
	
	public static int [] function2(int [] arrayNumber, int sum){
		HashMap <Integer,Integer> hm = new HashMap <Integer,Integer>();
		int [] result = new int [2];
		for(int i = 0; i < arrayNumber.length; i++){
			if(hm.containsValue(arrayNumber[i])){
				result[1] = arrayNumber[i];
				result[0] = sum - arrayNumber[i];
				return result;
			}else
				hm.put(arrayNumber[i], sum-arrayNumber[i]);
		}
		
		return result;
	}
	public static void main(String [] args){
		int [] arrayNumber = {1,3,5,7,8,9,12,34};
		int [] location1 = new int[2];
		int [] location2 = new int[2];
		location1 = function1(arrayNumber, 19);
		for(int i : location1)
			System.out.println(i);
		
		location2 = function2(arrayNumber,19);
		
		for(int i : location2)
			System.out.println(i);
		
	}
}
