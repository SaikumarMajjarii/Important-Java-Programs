import java.util.ArrayList;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object[][]> Name = new ArrayList<Object[][]>();

		// Object [] Data1 = {"Sai","Kumar","Priya"};

		Name.add(new Object[][] { { "Sai", "Kumar", "Priya" },

				{ "Sai", "Kumar", "kumar" } });

		for (Object[][] Array : Name) {

			for (Object[] Data : Array) {

				for (Object Value : Data)

				{

					System.out.println(Value);
				}

			}

		}

	}

}
//String name = "Sai";
//
//String NewName = new String("Sai");
//
//
//if(name.equals(NewName))
//{
//	System.out.println("Equal");
//	
//}
//
//else
//{
//	System.out.println("Not Equal");
//}
