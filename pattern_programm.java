import java.util.*;
public class pattern_programm {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,k,r=0;
		for(i=0;i<n;i+=2)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<n-i;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
			r=r+1;
		}
	}

}
