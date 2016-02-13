class MixStart{
	public static void main(String[] args){
		
	}
	public static boolean mixStart(String str){
		return (str.length() >= 3 && str.substring(1,3).equals("ix"));
	}
}