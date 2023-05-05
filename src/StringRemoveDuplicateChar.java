import java.util.*;
public class StringRemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello";
		HashSet<Character> hs = new HashSet<>();
		for(char a : s.toCharArray())
		{
			hs.add(a);
		}
		System.out.println(hs);
		
		for(char a : hs)
		{
			System.out.println(a);
		}
	}

}
