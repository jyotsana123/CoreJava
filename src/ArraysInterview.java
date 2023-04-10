
public class ArraysInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 3 2 5
		 * 4 6 7
		 * 8 9 1
		 * print minimum value from this matrics
		 */
		
		int a[][] = {{3,2,5},{4,6,7},{8,9,1}};
		int min = a[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
		}
		System.out.println(min);
		
	}

}
