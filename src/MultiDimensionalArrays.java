
public class MultiDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 2 3 4
		 * 5 6 7
		 */
		int a[][] = new int [2][3];
		a[0][0] = 2;
		a[0][1] = 3;
		a[0][2] = 4;
		a[1][0] = 5;
		a[1][1] = 6;
		a[1][2] = 7;
		//System.out.println(a[1][1]);
		
		//int b[][] = {{2,3,4},{5,6,7}};
		for(int i=0;i<2;i++) //this loop is for row
		{
			for(int j=0;j<3;j++)  //this loop is for coloumn
			{
				System.out.println(a[i][j]);
			}
			
		}
	}

}
