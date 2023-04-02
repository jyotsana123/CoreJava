
public class FirstClass {

	static int a=4;
	int e=5;
	
	public int getData()
	{
		System.out.println("I am in method");
		return 2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

         System.out.println(a);
         FirstClass fc = new FirstClass();
         fc.getData();
         System.out.println(fc.e);
         System.out.println(FirstClass.a);
         
	}
	
	

}
