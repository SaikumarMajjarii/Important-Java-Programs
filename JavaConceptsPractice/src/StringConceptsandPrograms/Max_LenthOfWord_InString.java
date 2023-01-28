package StringConceptsandPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class Max_LenthOfWord_InString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 MaxLenthofWord("Hello how are you Mommmmmy");
		MaxLenthofWord("Saikum Hello how are you reddy Mommmy priyaa");
	}

	public static void MaxLenthofWord(String Input) {

		int count = 0;
		String[] SplitString = Input.split(" ");

		int[] MaxText = new int[SplitString.length];
		for (int i = 0; i < SplitString.length; i++) {

			MaxText[i] = SplitString[i].length();

		}
		
		
		int Count = 0;
		for (int i = 0; i <SplitString.length; i++) {
			
			int Max = GetMax(MaxText);
			if (Max == SplitString[i].length()) {
				
				Count++;
				if(Count == 1 )
				{
				System.out.println(SplitString[i]);
				}
				else if(Count == 2)
				{
					
					break;
				}
					

			}

		}

	}

	// Get Max Value

	public static int GetMax(int[] MaxValue) {

		int MaxNo = MaxValue[0];
		for (int i = 0; i < MaxValue.length; i++) {

			if (MaxValue[i] > MaxNo) {

				MaxNo = MaxValue[i];

			}
		}

		return MaxNo;

	}

}
