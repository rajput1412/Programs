package hello;
//import Util.Scanner;
import java.util.*;
public class helo {
	public static void main(String[] args) {
	//System.out.println("java");
		int i,j;
		boolean flag;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{  flag=true;
		for(j=2;j<=i/2;j++) 
		{
			
			if(i%j==0)
			{
				flag=false;
				break;
			}
			
		}
		  if(flag)
			  System.out.println(i);
		}
		
		}
	
	
	
}