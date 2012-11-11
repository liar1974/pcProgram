//quick sort
public class quickSort {
    public  void quick_sort(int [] a, int l, int r){
    	if(l < r){
    		int i = l;
    		int j = r;
    		int x = a[i];
    		while(i < j){
    			while(i < j && x < a[j])
    				j--;
    			if(i < j)
    				a[i++] = a[j];
    			while(i < j && x > a[i])
    				i++;
    			if(i < j)
    				a[j--] = a[i];
    		}
    		a[i] = x;
    		quick_sort(a,l,i-1);
    		quick_sort(a,i+1,r);
    	}
    }
	public static void main(String[] args) {
		int [] arr = {23,123,34,8,2,8,67,34,89,45,11};
        quickSort qs = new quickSort();		
		qs.quick_sort(arr, 0, arr.length-1);
		
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
			
	}

}
