	
	class PascalTriangle
	{
		Scanner consule = new Scanner (System.in);
		public static void main(String[] args)
		{
			
			System.out.println ("Select number from 1-12, inclusively:");
			int numOfRows = consule.nextInt();
			// function call
			displayPascalTriangle(numOfRows);
		}
		//function definition
		public static void displayPascalTriangle(int numFromUser)
		{
			//declare valuables
			 
			int prime = 0;
			int secondPrime = 0;
			int thirdPrime = 0;
			 prime = Prime(numFromUser);
			 secondPrime = prime;
			 thirdPrime = Prime(0);
			 
			//rows
			for(int i = 0; i <= numFromUser; i++);
			{ 
			 
				//cols
				for (int column = 0; column<= numFromUser; column++)
				{
					position = (numFromUser*p) / (k*p) * (( numFromUser -k)*p);
					//System.out.printf("%4d", k,n,p);

					prime*=i;
			 
				}
		  }
		}
		
		public static int Prime(int n) 
		{
		  for (int i =n ; i >0 ; i--)
		  {
			prime *= i;
		  }
		}
	}
		 
		  
	}
