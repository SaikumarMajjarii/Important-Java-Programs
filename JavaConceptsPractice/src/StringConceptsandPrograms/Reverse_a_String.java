package StringConceptsandPrograms;

import java.util.Scanner;

public class Reverse_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner SC = new Scanner(System.in);

		System.out.print("Enter the Word to Reverse : ");

		String Name = SC.nextLine();

		String Reverse = "";

		for (int i = Name.length() - 1; i >= 0; i--)

		{

			Reverse = Reverse + Name.charAt(i);

		}

		System.out.println("The Reverse of " + Name + " is " + Reverse);

		SC.close();

		
		
		//Another Way of Dng
		String originalStr = "Hello";
		String reversedStr = "";
		System.out.println("Original string: " + originalStr);

		for (int i = 0; i < originalStr.length(); i++) {
			reversedStr = originalStr.charAt(i) + reversedStr;
		}

		System.out.println("Reversed string: " + reversedStr);

		
		// we can also do with the help of String Builder
		
		
		
		StringBuilder SB = new StringBuilder();
		
		
		SB.append("Saikumar Majjari");
		
		System.out.println(SB.reverse());
		
		
//int k = i++ + ++i + --i - i--;
//		System.out.println(i++);
//		System.out.println(++i);
//		System.out.println(--i);
//		System.out.println(i--);

	}

}
