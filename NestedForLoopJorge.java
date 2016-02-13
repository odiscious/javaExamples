class NestedForLoopJorge{
	public static void main(String[] args){
		
		int spaceTimes = 0;
		final int NUM_LINES = 7;
		final int LAST_LINE = 40;
		
		while(spaceTimes < NUM_LINES){
			int spaceCounter = 0;
			System.out.print("*");
			while(spaceCounter < spaceTimes){
				spaces();
				spaceCounter++;
			}
			spaceCounter = 0;
			lineOne();
			
			System.out.print("*");
			while(spaceCounter < spaceTimes){
				spaces();
				spaceCounter++;
			}
			spaceCounter = 0;
			lineTwo();
			
			System.out.print("*");
			while(spaceCounter < spaceTimes){
				spaces();
				spaceCounter++;
			}
			lineThree();
			spaceTimes++;
			
		}
		for(int i = 0; i <= LAST_LINE; i++){
			System.out.print("*");
		}
	}
	public static void fiveStars(){
		System.out.print("*****");
	}
	public static void spaces(){
		System.out.print("     ");
	}
	public static void lineOne(){
		fiveStars();
		System.out.print("* o\n");
	}
	public static void lineTwo(){
		spaces();
		System.out.print("*/|\\\n");
	}
	public static void lineThree(){
		spaces();
		System.out.print("*/ \\\n");
	}
}