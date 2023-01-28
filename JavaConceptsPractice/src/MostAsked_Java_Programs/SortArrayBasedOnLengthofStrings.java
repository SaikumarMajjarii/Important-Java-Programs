package MostAsked_Java_Programs;

import java.util.Arrays;

public class SortArrayBasedOnLengthofStrings {

	
	public static void BubbleSortStringsByLengthDesc(String[] ArrayInput) {

		for (int i = 0; i < ArrayInput.length; i++) {

			int Flag = 0;
			for (int j = 0; j < ArrayInput.length - 1 - i; j++) {
				if (ArrayInput[j].length() < ArrayInput[j + 1].length()) {

					String temp = ArrayInput[j + 1];

					ArrayInput[j + 1] = ArrayInput[j];

					ArrayInput[j] = temp;
					Flag = 1;

				}

			}

			if (Flag == 0) {

				break;
			}

		}

		System.out.println(Arrays.toString(ArrayInput));
	}
	
	
	
	public static void BubbleSortStringsByLength(String[] ArrayInput) {

		for (int i = 0; i < ArrayInput.length ; i++) {

			int Flag = 0;
			for (int j = 0; j < ArrayInput.length - 1 - i; j++) {
				if (ArrayInput[j].length() > ArrayInput[j + 1].length()) {

					String temp = ArrayInput[j + 1];

					ArrayInput[j + 1] = ArrayInput[j];

					ArrayInput[j] = temp;
					Flag = 1;

				}

			}

			if (Flag == 0) {

				break;
			}

		}

		System.out.println(Arrays.toString(ArrayInput));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] InputArray = {"Sai","Saiku","Priya","S","kumarS","Priyass"};
		BubbleSortStringsByLength(InputArray);
		
		
		String[] InputArrayDesc = {"Sai","Priya","Sa","S","kumarS","Priyass"};
		
		BubbleSortStringsByLengthDesc(InputArrayDesc);

	}

}
