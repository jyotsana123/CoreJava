import java.util.*;
public class StringAllCharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "ProgrammingP";
		HashMap<Character, Integer> hm = new HashMap<>();
		for(Character c : a.toCharArray())
		{
			System.out.println(c);
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		
		System.out.println(hm);
	}

}
