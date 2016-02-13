public class EveryNth {
	public static void main(String[] args){
		System.out.println("Test: " + everyNth("Chocolate", 3));
	}
	public static String everyNth(String str, int n){
		if(n == 1){
			return "";
		}
		String temp = Character.toString(str.charAt(0));
		for(int i = n; i < str.length(); i += n){
			
				temp += Character.toString(str.charAt(i));
			
			
		}
		return temp;
	}

}