
public class ArraysInterview3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1. Find the minimum number
		 * 2. Identify the coloumn of minimum no.
		 * 3. Find maximum no. in identified coloumn
		 * 2 5 7
		 * 7 8 0
		 * 5 3 2  
		 */
		
		int a[][] = {{2,5,7},{7,8,0},{5,3,2}};
		int min = a[0][0];
		int minimumcolumn = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min = a[i][j];
					minimumcolumn = j;
					
				}
			}
		}
		System.out.println(min);
		int k=0;
		int max = a[k][minimumcolumn];
		while(k<3)
		{
			if(a[k][minimumcolumn]>max)
			{
				max=a[k][minimumcolumn];
			}
			k++;
		}
		
		System.out.println(max);
	}

}
