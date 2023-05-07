
public class InstanceVariable {

	//https://www.youtube.com/watch?v=CG92aa0pOz0&list=PLd3UqWTnYXOkIbQ-9MfOK4HOGo0Hdtuti&index=8
		
	int a = 5;  //Instance variable
	int b=1;
	public static void main(String[] args)   //Static methos
	{
		// TODO Auto-generated method stub

			//System.out.println("b is " +b);   //Static area, You can not access instance variable in static area
			//if you are trying to access instance variable in static area then you can use by creating the object
		
		InstanceVariable iv = new InstanceVariable();
		System.out.println(iv.a);
		System.out.println(iv.b);
	    iv.m1();
		}
	
	
	void m1()   //Instance method
	{
		System.out.println(a);  //instance area
		//In instance area you can directly access the instance variabls
		System.out.println(b);
		
		//you you execute this code your output should be 5, 1 of main block only not m1 block
		//if you want to execute user defined methods then you need to call that method inside the main method
		//because JVM is responsible to execute only main method
	}
	
	
}


