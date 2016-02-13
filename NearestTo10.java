class NearestTo10{
	public static void main(String[] args){
		System.out.println("The closer number is: " + close10(7, 13));
	}
	public static int close10(int a, int b) {
  if(a == b){
  return 0;
  }
  int x = Math.abs(a);
  int y = Math.abs(b);
  
  x -= 10;
  y -= 10;
  x = Math.abs(a);
  y = Math.abs(b);
  if(x < y){
  return a;
  }
  if(y < x){
  return b;
  }
  else
  return 0;
}
}