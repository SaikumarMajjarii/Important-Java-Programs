package MostAsked_Java_Programs;

import java.util.Arrays;

public class ShiftZerostoRightinArray {

	
	
	
	
	public static int[] ShiftZerostoRight(int[] Elements) {
		
		
		
		int Count=0;
		int[] NewArray = new int[Elements.length];
		for(int A : Elements)
		{
			
			if(A!=0)
			{
				NewArray[Count]=A;
				Count++;
			}
			
		}
		
		 Arrays.sort(NewArray);
		return NewArray ;
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] Array = new int[] {1,0,2,0,3,0,0,0};
		
		int[] NewArray = ShiftZerostoRight(Array);
		
		System.out.println(Arrays.toString(NewArray));
		

	}

}
