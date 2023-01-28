package MostAsked_Java_Programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MaxLengthofSubstringNonRepeated {

	public static int ReturnMaxLength(Set<Character> HS, String InputString)

	{

		int Start = 0;
		int End = 0;
		int MaxCount = 0;
		while(End<InputString.length())
		{
			
			char L = InputString.charAt(End);
			if(!HS.contains(L))
			{
				HS.add(L);
				End++;
				MaxCount = Math.max(MaxCount, End-Start);
				
			}
			else
			{
				HS.remove(L);
				Start++;
			}
		}	
		return MaxCount;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Character> HS = new HashSet<Character>();

		int MaxCount = ReturnMaxLength(HS, "abcabcbb");

		System.out.println(HS.toString());
		System.out.println(MaxCount);

	}

}
