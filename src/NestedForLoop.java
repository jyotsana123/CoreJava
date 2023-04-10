
public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=1;
		for (int i=1;i<=4;i++)
		{
			//System.out.println("Outer for loop started");
			for(int j =i;j<=4;j++)
			{
				System.out.print(k+" ");
				k++;
			
			}
			System.out.println(" ");
		}
	
		System.out.println("================= ");
	
	
	int m=10;
	for (int i=1;i<=4;i++)
	{
		//System.out.println("Outer for loop started");
		for(int j =1;j<=i;j++)
		{
			System.out.print(m+" ");
			m--;
		
		}
		System.out.println(" ");
	}
	
	
	System.out.println("================= ");
	
	int n=1;
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(n+" ");
		}
		System.out.println(" ");
	}
	
	
System.out.println("================= ");
	
	//int o=1;
	for(int i=0;i<=4;i++)
	{
		for(int j=1;j<=4-i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println(" ");
	}
	
	
System.out.println("================= ");
	
	//int o=1;
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println(" ");
	}
	
System.out.println("================= ");
	
	//int o=1;
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println(" ");
	}
	
	
System.out.println("================= ");
	
	int P=1;
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(P+" ");
			P++;
		}
		System.out.println(" ");
	}
	
	
System.out.println("================= ");
	
	int Q=1;
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(Q+" ");
			
		}
		System.out.println(" ");
		Q++;
	}
	
	
System.out.println("================= ");
	
	//int R=10;
	for(int i=8;i>=1;i--)
	{
		for(int j=8;j>=i;j--)
		{
			System.out.print(j+" ");
			//R--;
			
		}
		System.out.println(" ");
	}
	
	
System.out.println("================= ");
	
	int R=3;
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(R+" ");
			R = R+3;
			
		}
		System.out.println(" ");
	}
	
	/* 2
	 * 2 4
	 * 2 4 6
	 * 2 4 6 8 
	 */
	System.out.println("================= ");
	for(int i=1;i<=4;i++)
	{
		for(int j =1;j<=i;j++)
		{
			System.out.print(j*2+" ");
		}
		System.out.println("");
	}
}


}
