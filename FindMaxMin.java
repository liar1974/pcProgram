//Find max and min value in the array in O(n)
public class FindMaxMin {

	/**
	 * @param args
	 */
	public void findMaxMinMethod(int [] a, int n){
		int finalMax = a[0];
		int finalMin = a[0];
		int tmpMax;
		int tmpMin;
		int i;
		
		for(i = 1; i < n-1; i++){
			if(a[i]>a[i+1]){
				tmpMax = a[i];
				tmpMin = a[i+1];
			}else{
				tmpMax = a[i+1];
				tmpMin = a[i];
			}
			
			if(tmpMax > finalMax)
				finalMax = tmpMax;
			if(tmpMin < finalMin)
				finalMin = tmpMin;
		}
		
		if(i == n - 1){
			if(finalMax < a[i])
				finalMax = a[i];
			else if(finalMin > a[i])
				finalMin = a[i];
		}
		
		System.out.print("Max number is "+finalMax+".Min number is "+finalMin);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMaxMin fm = new FindMaxMin();
		int [] a ={23,45,3,4,56,12,15,89,34,38,22,11};
		fm.findMaxMinMethod(a, a.length);

	}

}
