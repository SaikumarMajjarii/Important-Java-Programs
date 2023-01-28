package MostAsked_Java_Programs;

public class PairOfElementsEqualtoSum {

	public static void GetPairs(int[] Arrayinput, int sum) {

		for (int i = 0; i < Arrayinput.length; i++) {

			for (int j = i + 1; j < Arrayinput.length; j++) {
				if (Arrayinput[i] + Arrayinput[j] == sum) {

					System.out.println(Arrayinput[i] + " + " + Arrayinput[j] + " = " + sum);

				}

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] PairArray = { 5, 10, 9, 6, 2, 8, 7 };

		GetPairs(PairArray, 15);
		GetPairs(PairArray, 5);

	}

}
