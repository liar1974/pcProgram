//Merge sort
public class Msort {

	public void mergeSort(int [] a, int first, int last, int [] tmp){
		if(first < last){
			int mid = (first + last) >> 1;
		    mergeSort(a,first,mid,tmp);
		    mergeSort(a,mid+1,last,tmp);
		    mergeArray(a,first,mid,last,tmp);
		}
	}
	
	public void mergeArray(int [] a, int first, int mid, int last, int [] tmp){
		int m = first, n = mid;
		int i = mid + 1, j = last;
		int k = 0;
		while(m <= n && i <= j){
			if(a[m] < a[i])
				tmp[k++] = a[m++];
			else
				tmp[k++] = a[i++];
		}
		
		while(m <= n)
			tmp[k++] = a[m++];
		while(i <= j)
			tmp[k++] = a[i++];
		
		for(int p = 0; p < k; p++)
			a[first+p] = tmp[p];
	} 
	public static void main(String[] args) {
		int [] p = {1,4,2,9,3,0,6,65,34,45,56,78,45,56};
		int [] tmp = new int [14];
		Msort ms = new Msort();
		ms.mergeSort(p, 0, 13, tmp);
		
		for(int i = 0; i < p.length; i++)
			System.out.println(p[i]);
	}

}
