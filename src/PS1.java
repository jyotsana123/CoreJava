import org.testng.annotations.Test;

public class PS1 extends PS {
	
	@Test
	public void testRun()
	{
		doThis(); //by the inheritance you can directly call the method of parent class without creating the object
                 //If you don't use inheritance then you need to create the object of that class to calling the method
                //PS ps = new PS();
               //ps.doThis();

		int a=10;  //need to perform some generic operation on this variable which is applicable for any variable
		PS2 ps2 = new PS2(a);
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		//PS3 ps3 = new PS3(a);
		System.out.println(ps2.multiplyTwo());
		System.out.println(ps2.multiplyThree());
	}

}
