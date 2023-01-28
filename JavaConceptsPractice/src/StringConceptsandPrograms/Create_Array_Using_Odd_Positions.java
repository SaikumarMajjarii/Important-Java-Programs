package StringConceptsandPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Create_Array_Using_Odd_Positions {

	
	
	
	public static void CreateArrayatOddPostion(String Input)
	{
	
		int  count = 0;
		String[] SplitString = Input.split(" ");		
		//ArrayList<String>AModify = new ArrayList<String>();
		String[]  AModify = new String[SplitString.length/2];
		for(int i =0;i<SplitString.length;i++)
		{		
			if(i%2!=0)
			{			
				//AModify.add(SplitString[i]);				
				AModify[count]  = SplitString[i];
				count++;			
			}
		}
				
		//System.out.println(AModify);
		System.out.println(Arrays.toString(AModify));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		CreateArrayatOddPostion("Saikumar is a bad boy");
	}

}
