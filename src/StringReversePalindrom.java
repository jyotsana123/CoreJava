
public class StringReversePalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Check given string is palindrome or not
		String s = "madam";
		String t = "";
		
		//for(int i=s.length()-1;i>=0;i--)
			for(int i=0;i<s.length();i++)
		{
			t = t + s.charAt(i);
			//System.out.println(t);
			
		}
		System.out.println(t);
		if(s.equals(t))
		{
		System.out.println("given string is palindrome");
		}
	}

}


//String : it is one of the prebuilt class in java /* 1.String literal 2.by creating object of string*/  String a= " javatraining";//string   System.out.println(a.charAt(2)); System.out.println(a.indexOf("e")); System.out.println(a.substring(3, 6)); System.out.println(a.substring(5)); System.out.println(a.concat("rahul teaches")); //a.length() System.out.println(a.trim()); a.toUpperCase(); a.toLowerCase(); //split String arr[]=a.split("t"); System.out.println(arr[0]); System.out.println(arr[1]); System.out.println(a.replace("t", "s"));       