package com.ycc.permutestringtwoway;
// Permute string it works for duplicate char
public class permuteString {
	public static void swap(char [] array, int index, int i){
		char tmp = array[index];
		array[index] = array[i];
		array[i] = tmp;
	}
	public static void permuteMethod(char [] array, int index){
		int i = 0;
		if(index == array.length){
			System.out.println(new String(array));
			return ;
		}
		
		for(i = index; i < array.length; i++){
			if(i != index && array[i] == array[index])
				continue;
			swap(array,index,i);
			permuteMethod(array,index+1);
			swap(array,index,i);
		}
	}
	public static void main(String [] args){
		String str = new String("aac");
		char [] arr = str.toCharArray();
	    permuteMethod(arr,0);	
	}
}
