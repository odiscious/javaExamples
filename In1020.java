class In1020{
	public static void main(String[] args){
		
	}
	public static boolean in1020(int a, int b){
		if((a >= 10 && a <= 20) && (b >= 10 && b <= 20)){
			return false;
		}
		if((a >= 10 && a <= 20) || (b >= 10 && b <= 20)){
			return true;
		}
		return false;
	}
}