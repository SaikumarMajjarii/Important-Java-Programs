package MostAsked_Java_Programs;

import java.util.ArrayList;

public class Remove_Duplicates_FromSorted_Array {

	public static void RemoveDuplicateInteger(int[] UnsortedArray) {

		ArrayList<Integer> List = new ArrayList<Integer>();
		
		int Count =0;
		for (int i = 0; i < UnsortedArray.length; i++) {

			for (int j = i + 1; j < UnsortedArray.length; j++) {

				if (UnsortedArray[i] != UnsortedArray[j]) {

					UnsortedArray[++Count] = UnsortedArray[i];
				}
				


			}
//
//			if (UnsortedArray[i] != -1) {
//
//				//List.add(UnsortedArray[i]);
//				
//				System.out.println(UnsortedArray[i]);
//
//			}

		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] UnsortedArray = {0,1,1,1,2,3,4,5,6,6 };

		RemoveDuplicateInteger(UnsortedArray);

	}

}
