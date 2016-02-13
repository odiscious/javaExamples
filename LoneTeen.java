class LoneTeen{
	public static void main(String[] args){
		
	}
	public boolean loneTeen(int a, int b){
		if((a >= 13 && a <= 19) && (b >= 13 && b <= 19)){
			return false;
		}
		return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19));
	}
}