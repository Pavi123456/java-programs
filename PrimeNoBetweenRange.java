import java.util.Scanner;
public class PrimeNoBetweenRange {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Input :");
		int s=in.nextInt();
		int e=in.nextInt();
		int co=0;
		for(int j=s;j<=e;j++)
		{
			int c=0;
			int i=1;
			while(i<=j)
			{
				if(j%i==0)
				{
					c++;
				}
				i++;
			}
			if(c==2)
			{
				co++;
			}
				
		}
		System.out.println(co);
	}
}
