import java.util.Scanner;
public class ElseIfDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age;
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your age");
	      age = in.nextInt();
	     
	      if(age>=18)
	      {
	      	System.out.println("You are eligible for voting");
	      }
	      else
	      {System.out.println("You are not eligible for voting");
	      	}
	}

}
