package MostAsked_Java_Programs;

import java.util.Arrays;

public class Reverse_An_Array_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String[] BReverse = {"Sai","kumar","Priya"};
		
		String[] AReverse = new String[BReverse.length];
	
		int P =0;
		for(int i=BReverse.length-1;i>=0;i--)
			
		{
			AReverse[P] = BReverse[i];
			P++;
		}
		
		
		System.out.println(Arrays.toString(AReverse));
	}

}
