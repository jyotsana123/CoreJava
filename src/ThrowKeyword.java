import java.util.Scanner;

public class ThrowKeyword {  //we can throw exception explicitly using throw keyword.  this is also called user defined exception
	
	public static void printGrades(int marks) {
	    if(marks>100) {
	      //since total marks cannot exceed 100, we are throwing an exception
	      //to show user that he has done a mistake while entering data
	      throw new ArithmeticException("Total Marks cannot be more than 100");
	    }
	    else if(marks>=60){
	      System.out.println("Grade A");
	    }
	    else if(marks>33 && marks<60){
	      System.out.println("Grade B");
	    }
	    else{
	      System.out.println("Grade C");
	    }
	  }

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//asking the user to enter total marks
	    System.out.print("Enter total marks: ");
	    Scanner scan = new Scanner(System.in);
	    int totalMarks = scan.nextInt();

	    //calling the method to print grades
	    printGrades(totalMarks);
	  }

		
	}

//Throw Keyword - It is like, you have written a condition and when that condition occurs, you would want an error message to be shown to user, 
//you can do this by throwing an exception on that particular condition.

//For example: You have written a program where you are showing grades of the student based on the input total marks. The total marks is out of 100, 
//let’s say a user enters the total marks as 200, this will not cause any exception to be thrown automatically. 
//However you can set a condition in the program to throw an exception when user enters total marks more than 100. Let’s write a java program for this example:

