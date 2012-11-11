//check whether the array contains another array or not
public class SortArrayContains {

	/**
	 * @param args
	 */
	public static boolean containMethod(int [] a, int [] b){
		int alength = a.length;
		int blength = b.length;
		
		int i = 0;
		int j = 0;
		
		int count = 0;
		
		while(i < alength || j < blength){
			if(a[i] == b[j]){
				count ++;
				i++;
				j++;
			}else if(a[i] < b[j]){
				i++;
			}else
				j++;
		}
		if(count == Math.min(alength, blength))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,3,4,7,8,10,11,12,14,17};
		int [] b = {3,7,8,11,12};
		
		boolean condition = containMethod(a,b);
		
		System.out.print(condition);
	}

}
