class StartOz{
	public static void main(String[] args){
		
	}
	public static String startOz(String str){
		if(str.length() == 1){
			if(str.substring(0,1).equals("o")){
				return "o";
			}
			if(str.substring(0,1).equals("z")){
				return "z";
			}
		}
		if(str.length() >= 2){
			String result = "";
			if(str.substring(0,1).equals("o")){
				result += "o";
			}
			if(str.substring(1,2).equals("z")){
				result += "z";
			}
			if(result.length() >= 1){
				return result;
			}
		}
		return "";
	}
}