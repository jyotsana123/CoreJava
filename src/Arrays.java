
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 2 4   find minimum value, coloumn of minimum value, maximum value of that coloumn
		 * 1 0
		 */
		int a[][] = {{2,4},{1,0}};
		int min = a[0][0];
		int mincol = 0;
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				if(a[i][j]<min)
				{
					min = a[i][j];
					mincol = j;
					
				}
			}
		}
		
		int max = a[0][mincol];
		int k=0;
		while(k<2)
		{
			if(a[k][mincol]>max)
			{
				max = a[k][mincol];
			}
			k++;
		}
		System.out.println(max);
		
	}

}
