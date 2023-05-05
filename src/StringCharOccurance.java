
public class StringCharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Print any of the character occurance count in given string
		String a = "Java programming oops concept";  //define string
		int String_length = a.length();              //find length of string
		int newStringLength = a.replace("o", "").length();  //Replce char with blank input and find length
		int occurance = String_length-newStringLength;   //Subtract original with new length
		System.out.println("Occurance count of o is: "+occurance);  //print
	}

}
