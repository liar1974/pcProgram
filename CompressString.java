//Compress String e.g. from aaabb to a3b2
public class CompressString {
	public static String compressBetter(String str){
		int size = countCompression(str);
		if(size >= str.length()){
			return str;
		}
		
		StringBuffer myStr = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		
		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i) == last){
				count ++;
			}else{
				myStr.append(last);
				myStr.append(count);
				last = str.charAt(i);
				count = 1;
			}
		}
		myStr.append(last);
		myStr.append(count);
		
		return myStr.toString();
	}
	public static int countCompression(String str){
		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i) == last){
				count ++;
			}else{
				size += 1+String.valueOf(count).length();
				last = str.charAt(i);
				count = 1;
			}
		}
		size += 1+String.valueOf(count).length();
		
		return size;
	}
	public static void main(String [] args){
		String target = "aabbbbbbbccccccccceeeeeeeee";
		String result = compressBetter(target);
		
		System.out.println(result);
	}
}
