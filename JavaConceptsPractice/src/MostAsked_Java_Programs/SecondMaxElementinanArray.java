package MostAsked_Java_Programs;

import java.util.Arrays;

public class SecondMaxElementinanArray {

	
	
	
	public static void FindSecondMax(int[] ArrayInput) {
		
		
		for(int i =0;i<ArrayInput.length;i++)
		
		{
			
			for(int j=i+1;j<ArrayInput.length;j++)
			{
				
				
				if(ArrayInput[i]<ArrayInput[j])
				{
					
					int temp = ArrayInput[j];
					
					ArrayInput[j] = ArrayInput[i];
					
					ArrayInput[i]= temp;
				}
				
			}
			
			
			if(i==0)
			{
				
				System.out.println(ArrayInput[i]);
			}
		}
		
//		System.out.println(Arrays.toString(ArrayInput));
	
//		for(int k = ArrayInput.length-2;k>=0;k--)
//		{
//			
//			if(ArrayInput[k]!=ArrayInput[ArrayInput.length-1])
//			{
//				
//				System.out.println(ArrayInput[k]);
//				return;
//			}
//			
//			
//		}
//		
//		System.out.println("No Second largest Element");
		
		
		for(int k =1;k<ArrayInput.length;k++)
		{
			
			if(ArrayInput[k]!=ArrayInput[k-1])
			{
				
				System.out.println(ArrayInput[k]);
				return;
			}
			
			
		}
		
		System.out.println("No Second largest Element");
		
	//System.out.println(Arrays.toString(ArrayInput));
//	System.out.println("SortedOrder");
//		
	
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] AI = {756,756,756};
		
		FindSecondMax(AI);
	}

}
