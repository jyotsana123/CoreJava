
public class StringReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "my name is jyotsana";
		String arr[] = a.split(" ");
		for(int i=0;i<arr.length;i++)
		{
		  System.out.print(arr[i]+ " ");
		}
		System.out.println(" ");
		for(int i=(arr.length)-1;i>=0;i--)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
