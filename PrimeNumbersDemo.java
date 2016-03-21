
public class PrimeNumbersDemo {
	public static void main(String[] args) {
		int i,j,m=0,flag=0;
		
		for(i=1;i<=100;i++)
		{flag=0;
		m=i/2;
		
		for(j=2;j<=m;j++)
		{
			if(i%j==0){
				flag=1;
				break;
			}
		}
		if (flag==0){
		System.out.println(i);}
		}
	}
}
