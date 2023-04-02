public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "hello";
		String b = "hello"; //both a and b object referring the same memory space because of the same content
		String s1 = new String("hello"); //this os referring the new memory space whether content is same or not
		//String class creates new object every time in memory
		
		//Strings are immutable - you can not change or alter the string
		s1.concat("world");
		System.out.println(s1);
		
		//There is two classes which makes string mutable - String buffer and string builder classes
		StringBuffer sb = new StringBuffer("hi");
		sb.append("jyotsana");
		System.out.println(sb);
		sb.insert(2, "miss");
		System.out.println(sb);
		sb.replace(0, 2, "hello");
		System.out.println(sb);
		sb.append("pandey");
		System.out.println(sb);
		sb.delete(17, 23);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//only difference b/w string builder and string buffer is - string builder is not thread safe or it is non synchronized, string buffer is thread safe
		//string buffer class is slower than string builder class because it has some thread synchronozation machenism.
		
		//When to use == and equals() methods to compare Strings
		System.out.println(a.equals(b));    //this method is compare the content which is "hello" and it's return true or false based upon the content of string.
		System.out.println(a==b); //this operator compares the reference, whether it's reffering the same object
		System.out.println(a==s1);
		System.out.println(a.equals(s1));
	}

}
