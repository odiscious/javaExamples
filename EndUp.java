class EndUp{
	public static void main(String[] args){
		
	}
	public static String endUp(String str){
		if(str.length() <= 3)return str.toUpperCase();
		
		int cut = str.length() - 3;
		String back = str.substring(cut);
		return str.substring(0, cut) + back.toUpperCase();
	}
}