class LastDigit{
	public static void main(String[] args){
		
	}
	public static boolean lastDigit(int a, int b){
		a %= 10;
		b %= 10;
		return(a == b);
		
		//a better way
		//return (a % 10 == b % 10);
	}
}