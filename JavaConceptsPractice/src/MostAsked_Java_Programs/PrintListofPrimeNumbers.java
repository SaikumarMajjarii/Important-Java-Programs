package MostAsked_Java_Programs;

public class PrintListofPrimeNumbers {

	
	
	
	public static void PrintPrimeNumbers(int Start,int End)
	
	{		
		for(int i=Start; i<=End; i++)
		{			
			int Count =0;
			
			for(int j=2;j<i/2;j++)
			{
				
				if(i%j==0)
				{
					Count++;
	
				}			
			}
			
			if(Count==0)
			{				
				System.out.println(i);				
			}		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintPrimeNumbers(2,100);

	}

}
