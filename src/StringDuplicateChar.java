
public class StringDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "javajavajavajava";
		char duplicate[] = name.toCharArray(); //convert string to a character array.
		
		for(int i=0;i<name.length(); i++)
		{
			for (int j=i+1;j<name.length();j++)
			{
				if(duplicate[i]==duplicate[j])
				{
					System.out.println(duplicate[j]);
					break;
				}
			}
		}

	}

}
