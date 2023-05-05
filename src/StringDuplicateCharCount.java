import java.util.*;
import java.util.Map.Entry;
public class StringDuplicateCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "javatutorial";
		
		char arr[] = a.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		for(Character ch :arr)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
		
		for(Map.Entry<Character,Integer> duplicateChar:hm.entrySet())
		{
			if(duplicateChar.getValue()>1)
			{
			  System.out.println(duplicateChar.getKey()+" : " +duplicateChar.getValue());
			}
		}
	}

}
