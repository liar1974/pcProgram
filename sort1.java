//bubble sort insert sort
public class sort1 {

	/**
	 * @param args
	 */
	public int[] bubbleSort(int [] a, int length){
		boolean flag = true;
		int count = length - 1;
		int tmp;
		while(flag){
			flag = false;
			for(int i = 0; i < count; i++){
				if(a[i] > a[i+1]){
					tmp = a[i];
					a[i] = a[i+1];
					a[i+1] = tmp;
					flag = true;
				}
			}
			count --;
		}
		
		return a;
	}
	public int[] insertSort(int [] a, int length){
		int tmp;
		int j;
		for(int i = 1; i < length; i++){
			if(a[i] < a[i-1]){
				tmp = a[i];
				for(j = i-1; j > 0 && tmp < a[j]; j--)
					a[j+1] = a[j];
				a[j+1] = tmp;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		sort1 s1 = new sort1();
		int [] a = {23,3,56,2,3,4,34,12};
		int [] b = new int [8];
		int [] c = new int [8];
		b=s1.bubbleSort(a, a.length);
		c=s1.insertSort(a, a.length);
        for(int n : b)
        	System.out.print(n+" ");
        System.out.println();
        for(int n : c)
        	System.out.print(n+" ");
	}

}
