import java.util.regex.Pattern;

//Check whether the string is number or not
public class isDigit {

	/**
	 * @param args
	 */
	public static boolean isNumber1(String str){
		for(int i = 0; i < str.length(); i++){
			if(!Character.isDigit(str.charAt(i)))
				return false;
		}
		
		return true;
	}
	
	public static boolean isNumber2(String str){
		Pattern pattern = Pattern.compile("[0-9]*");
		return pattern.matcher(str).matches();
	}
	
	public static boolean isNumber3(String str){
		for(int i = 0; i < str.length(); i++){
			int n = (int) str.charAt(i);
			if(n < 48 || n > 57)
				return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String target = "10345";
		
		boolean isNumberValue1 = isNumber1(target);
		System.out.println(isNumberValue1);
		
		boolean isNumberValue2 = isNumber2(target);
		System.out.println(isNumberValue2);
		
		boolean isNumberValue3 = isNumber3(target);
		System.out.println(isNumberValue3);
	}

}
