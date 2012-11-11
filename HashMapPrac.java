import java.util.Collection;
import java.util.*;

//it is used for practise hash map
public class HashMapPrac {

	/**
	 * @param args
	 */
	public int findNum(int [] a, int len){
		int maxIndex = 0;
		int finalValue = 0;
		int interValue = 0;
		HashMap <Integer, Integer> mm = new HashMap<Integer, Integer>();
		for(int i = 0; i < len; i++){
			if(mm.containsKey(a[i])){
				int tmpValue = mm.get(a[i]);
				tmpValue++;
				mm.put(a[i], tmpValue);
			}else{
				mm.put(a[i], 1);
			}
		}
		Collection <Integer> valueCol =mm.values();
		Iterator <Integer> ite = valueCol.iterator();
		while(ite.hasNext()){
	        interValue = ite.next();
			if(interValue > 6)
				maxIndex = interValue;
		}
		for(int j = 0; j < len; j++){
			if(maxIndex == mm.get(a[j]))
				finalValue = a[j];
		}
		return finalValue;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapPrac hm = new HashMapPrac();
		int []a = {3,3,4,4,3,4,4,4,4,5,4,56};
		int b;
		b = hm.findNum(a,a.length);
		
		System.out.print(b);

	}

}
