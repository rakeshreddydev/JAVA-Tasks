import java.util.Scanner;
public class Character_count {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		//System.out.println(str1);
		int arr[]=new int[26];
		int t=str1.length();
		//System.out.println(t);
		for(int i=0;i<t;i++)
		{
			if(str1.charAt(i)==' ')
			{
				
			}
			else
			{
				arr[str1.charAt(i)-'a']++;
			}
		}
		for(int i=0;i<26;i++)
		{
			if(arr[i]%2==0&&arr[i]!=0)
			{
			System.out.println((char)('a'+i)+":"+arr[i]);
			}
		}
		
	}

}
