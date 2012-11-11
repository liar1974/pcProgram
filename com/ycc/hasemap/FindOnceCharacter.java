package com.ycc.hasemap;
import java.util.*;
// Find the character occur once in the string
public class FindOnceCharacter {

	/**
	 * @param args
	 */
	public static char firstNonrepeatedChar(String a){
		HashMap <Character, Integer> hm = new HashMap <Character,Integer>();
	    char [] tmp = a.toCharArray();
	    for(int i = 0; i < tmp.length; i++){
	    	if(hm.containsKey(tmp[i])){
	    		int tmpValue = hm.get(tmp[i]);
	    		tmpValue++;
	    		hm.put(tmp[i], tmpValue);
	    	}else
	    	    hm.put(tmp[i], 1);
	    }
	    
	    for(int i = 0; i < tmp.length; i++){
	    	if(hm.get(tmp[i]) == 1)
	    		return tmp[i];
	    }
	    
	    return 'n';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "teeter";
		char target;
    	target = firstNonrepeatedChar(a);
		System.out.print(target);
	}

}
