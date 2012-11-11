//given two sorted arrays. Write a method to merge B into A in sorted order. A has a large enough buffer at the end to
// hold B
public class SortPro1 {

	/**
	 * @param args
	 */
	public void problem1(int []a, int[]b,int n, int m){
		int k = m+n-1;
		int i = n-1;//array a
		int j = m-1;//array b
		
		while(i >= 0 && j >= 0){
			if(a[i] > b[j])
				a[k--] = a[i--];
			else
				a[k--] = b[j--];
		}
		while(j >= 0)
			a[k--] = b[j--];
        
		for(int cc : a)
			System.out.print(cc+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SortPro1 sp1 = new SortPro1();
        int [] a = {2,56,78,88,89,91,92,0,0,0,0,0,0,0,0,0};
        int [] b = {3,5,21,32,37,40,45,100,101};
        sp1.problem1(a,b,7,9);
	}

}
