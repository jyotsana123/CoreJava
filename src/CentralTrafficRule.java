
public interface CentralTrafficRule {
	
	 void redStop();
	 void flashYellow();
	 void greenGo();
	 
 }

//All the methods of an interface are by default public and abstract, So we need not to declare them explicitly as public abstract.
	//Interface methods are public since they should be available to third party vendors to provide implementation.
	//They are abstract because their implementation is left for third party vendors

//We can not create object to the interface
//We can use interface in other class by implements keyword
//We can implement more than one interface in a class
//The class is forced to implement all methods of interface
//An interface can have 0 or more abstract methods which are public and abstract by default
//An interface can have variable which are public, static and final by default. This means all the variables of the interface are constant.
//Method is only public by default
//Interface don't have constructor
//An interface can extend to another interface
//It is possible to write a class within an interface
//An interface can not implemet another interface
//

