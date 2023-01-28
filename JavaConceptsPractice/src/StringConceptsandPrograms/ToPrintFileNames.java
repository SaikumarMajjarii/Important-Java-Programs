package StringConceptsandPrograms;

public class ToPrintFileNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String FileName = "Saikumar.png";
		
		
		String Extension ;
		
		Extension = FileName.substring(FileName.lastIndexOf(".")+1, FileName.length());
		
		System.out.println(Extension);
		
	}

}
