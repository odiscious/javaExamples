public class StartHi{
	public static void main(String[] args){
		
	}
	public boolean startHi(String str){
		if(str.isEmpty() || str.length() < 2){
			return false;
		}
		if(str.charAt(0) == 'h' && str.charAt(1) == 'i'){
			return true;
		}
		return false;
	}
}