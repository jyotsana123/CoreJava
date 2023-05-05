
public class Array2ndLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {22,11,10,22,9,22,8,7,12,12};
		//Sort array in descending order
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=a[i+1])
			{
				System.out.println("Second largest no. is: "+a[i+1]);
				break;
			}
		}
		
	}

}
