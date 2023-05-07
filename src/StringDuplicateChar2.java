
public class StringDuplicateChar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://www.youtube.com/watch?v=N_kIhbeZxeg
		
		String a = "nishu pp";
		char arr[] = a.toCharArray();
		int count;
		for(int i=0;i<arr.length;i++)	
		{
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && arr[i]!=' ')
				{
					count++;
					arr[j]='0';
				}
			}
			if(count>1 && arr[i] !='0')
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
