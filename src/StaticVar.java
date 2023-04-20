
public class StaticVar {
	//This is sensus report for the people in Delhi

	String name;  //Instance variable, because these variable are depends on objects and it's different for every objects
	String address;
	static String city = "Delhi";  //Class or static variable
	static int i = 0; //this variable sharing by every object, So value of i is every time incremented91,2,3) on every object creatioon
	//int i = 0; //every time value of i will be 1, because this is instance variable.
	
	//public StaticVar(String name, String address, String city) 
	public StaticVar(String name, String address) 
	{
		this.name = name;
		this.address = address;
		//this.city = city;
		i++;
		System.out.println(i); 
	}
	
	public void getAddress()
	{
		System.out.println(address);
	}
	
	public void getCity()
	{
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//StaticVar obj1 = new StaticVar("Nishu","Badarpur","Delhi"); //if delhi is common variable in every objects so we need to declare at one time so that every object can refer this,for this we can declare city as static variable
		//StaticVar obj2 = new StaticVar("Neelu","PitamPura","Delhi"); //if you declare any variable it will take new space in memory, So to save the memory you can declare common variable among every object as static
		StaticVar obj1 = new StaticVar("Nishu","Badarpur");
		StaticVar obj2 = new StaticVar("Neelu","PitamPura");
		obj1.getAddress();
		obj2.getAddress();
		obj1.getCity();
		obj2.getCity();
		
		
	}

}
