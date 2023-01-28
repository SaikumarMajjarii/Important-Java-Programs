package MostAsked_Java_Programs;

public class Count_SumOfDigits {

	
	
	public static void SumOfDigits(int Number)	
	{
		
		int DigitsSum = 0;
		int LastNum =0;
		
		while(Number>0)		
		{	
			LastNum = Number%10;			
			DigitsSum+=LastNum;			
			Number = Number/10;	
		}		
		System.out.println(DigitsSum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigits(121);
	}

}
