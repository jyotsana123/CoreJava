//import CoreJava.src.CentralTrafficRule.java;

public class AustralianTraffic implements CentralTrafficRule, ContinentalTraffic {  //one class can implement more than one interface by writing comma


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//AustralianTraffic a = new AustralianTraffic(); //this line means, I have created object of AustralianTraffic class to implement the methods present in AustralianTraffic class itself. 
				CentralTrafficRule a = new AustralianTraffic();  //this line means, I have created object of AustralianTraffic class to implement the methods present in CentralTrafficRule interface. 
				a.redStop();
				a.flashYellow();
				a.greenGo();
				
				AustralianTraffic at = new AustralianTraffic();//to use this class method we need to create object of this class and implement the method
				at.walkonSymbol();
				at.greenGo();
				
				ContinentalTraffic ct = new AustralianTraffic();
				ct.trainSymbol();
				
				
			}

			//All these interface methods showing outside the public static void main, Now create object under main and call these methods
			@Override
			public void greenGo() {
				// TODO Auto-generated method stub
				System.out.println("I am printing greenGo");
			}

			@Override
			public void redStop() {
				// TODO Auto-generated method stub
				System.out.println("I am printing redStop");
			}

			@Override
			public void flashYellow() {
				// TODO Auto-generated method stub
				System.out.println("I am printing flashYellow");
			}
			
			public void walkonSymbol()
			{
				System.out.println("I am printing walkonSymbol");
			}

			@Override
			public void trainSymbol() {
				// TODO Auto-generated method stub
				System.out.println("I am printing trainSymbol");
			}

		
	}

	

