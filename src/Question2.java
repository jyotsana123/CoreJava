
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =-1;
		int count = 0;

		if(num>1){

		for(int i=1;i<=num;i++){
		if(num%i==0)
		count++;
		}
		if(count == 2){
		System.out.println(num + "Number is Prime Number");

		}
		else{
		System.out.println(num + "This is not Prime Number");
		}
		}
		else{
		System.out.println(num + "This is not Prime Number");
		}
		}
		}

	


