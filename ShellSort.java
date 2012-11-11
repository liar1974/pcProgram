//shell sort
public class ShellSort {

	/**
	 * @param args
	 */
	public int [] shellSort(int [] array, int arrayLength){
		int gap, i, tmp;
		for(gap = arrayLength >> 1; gap > 0; gap = gap >> 1){
			for(i = gap; i < arrayLength; i++){
				if(array[i]<array[i-gap]){
					tmp = array[i];
					int k = i - gap;
					while(k >= 0 && array[k] > tmp){
						array[k+gap] = array[k];
						k= k-gap;
					} 
					array[k+gap] = tmp;
				}
			}
		}
		return array;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShellSort ss = new ShellSort();
		int [] a = {12,3,34,5,23,67,89,32,345,22,5,96,12,56,8,87};
		int [] b = new int[a.length];
		b = ss.shellSort(a,a.length);
		for(int c : b)
			System.out.print(c+" ");

	}

}
