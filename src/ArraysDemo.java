
public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//If I want to store multiple value in a single container then I use array
		//but it store multiple values of same data type
		
		//new keyword allocates memory for value
		//allocate 5 integer values space into this array a
		int a[] = new int[5]; //declares an array and allocates memory for the values.
		                      // in this array first we allocating the memory and then passing the value
		a[0]=1;
		a[1]=3;
		a[2]=5;
		a[3]=7;
		a[4]=9; //initialized values into that array
//		for(int i=0;i<=a.length;i++)
//		{
//			System.out.println(a[i]); //retreive values present in the array
//		}
		
		int b[]= {1,2,3,4,5}; //here we are direct passing the value in array, here memory is dynamically allocated
		for(int j=0;j<=b.length;j++)
		{
			System.out.println(b[j]); //retreive values present in the array
		}
  }

}
