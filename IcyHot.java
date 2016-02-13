class IcyHot{
	public static void main(String[] args){
		
	}
	public boolean icyHot(int temp1, int temp2){
		if((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100)){
			return true;
		}
		return false;
	}
}