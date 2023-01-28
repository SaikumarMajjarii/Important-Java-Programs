package MostAsked_Java_Programs;

public class Reverse_a_Number {

	
	
	
	public static void ReverseNum(int Number)	
	{
		int Reverse =0;
		while(Number !=0)
		{	
			Reverse = Reverse*10 + Number%10;		
			Number = Number/10;	
		}
		
		
		
		System.out.println(Reverse);
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseNum(142);
	}

}
