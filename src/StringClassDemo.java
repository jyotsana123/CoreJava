
public class StringClassDemo {

	//String is a class in java
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "javatraining";
		String b = "point";
		String c = "point";
		System.out.println(a.charAt(0));
		System.out.println(a.indexOf("e")); //if no index with this value it prints -1
		System.out.println(a.substring(4));
		System.out.println(a.substring(4,6));
		System.out.println(a.length());
		System.out.println(a.startsWith("a"));
		System.out.println(a.toUpperCase());
		System.out.println(a.contains("ing"));
		System.out.println(a.concat(b));
		System.out.println(b.concat(c));
		System.out.println(b.concat("start"));
		System.out.println(b.equals(c));
		System.out.println(a.equals(c));
		System.out.println(a.compareTo(b));
		System.out.println(c.compareTo(b));
		String arr[] = a.split("v");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "d"));
		
	}

}
