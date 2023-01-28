package MostAsked_Java_Programs;

import java.util.Arrays;

public class Arrays_Bubble_Sort {

	public static void BubbleSort(int[] ArrayInput) {

		for (int i = 0; i < ArrayInput.length - 1; i++) {

			int Flag = 0;
			for (int j = 0; j < ArrayInput.length - 1 - i; j++) {
				if (ArrayInput[j] > ArrayInput[j + 1]) {

					int temp = ArrayInput[j + 1];

					ArrayInput[j + 1] = ArrayInput[j];

					ArrayInput[j] = temp;
					Flag = 1;

				}

			}
			//Second Largest
			if(i==1)
			{
				
				System.out.println(ArrayInput[ArrayInput.length-2]);
			}

			if (Flag == 0) {

				break;
			}

		}

		System.out.println(Arrays.toString(ArrayInput));
	}

	public static void BubbleSortDesc(int[] ArrayInput) {

		for (int i = 0; i < ArrayInput.length - 1; i++) {

			int Flag = 0;
			for (int j = 0; j < ArrayInput.length - 1 - i; j++) {
				if (ArrayInput[j] < ArrayInput[j + 1]) {

					int temp = ArrayInput[j + 1];

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

		int[] Arrayinput = { 36,36,20,20, 19, 29, 12, 5 ,5};
		BubbleSort(Arrayinput);
		int[] ArrayinputDesc = { 5, 12, 19, 29, 36 };
		BubbleSortDesc(ArrayinputDesc);

	}

}
