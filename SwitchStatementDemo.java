import java.util.Scanner;
public class SwitchStatementDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Month Number");
	      month = in.nextInt();
	      String monthname="";
	      int days=0;
	      switch (month){
	      case 1: monthname="January";days=31;break;
	      case 2: monthname="February";days=29;break;
	      case 3: monthname="March";days=31;break;
	      case 4: monthname="April";days=30;break;
	      case 5: monthname="May";days=31;break;
	      case 6: monthname="June";days=30;break;
	      case 7: monthname="July";days=31;break;
	      case 8: monthname="August";days=31;break;
	      case 9: monthname="September";days=30;break;
	      case 10: monthname="October";days=31;break;
	      case 11: monthname="November";days=30;break;
	      case 12: monthname="December";days=31;break;
	      default: monthname="January";days=31;break;
	      }
	      System.out.println("Month name is:"+monthname+" and No of days are:"+days);
	}

}
