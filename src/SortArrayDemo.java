
public class SortArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sort the array 1,3,5,2,1,0,8
		
		int a[] = {1,3,5,2,1,0,8};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
