package hello;
import java.util.*;

public class freq {
	//Scanner sc= new Scanner(System.in);
	//String st1=sc.nextLine();
	//String st2=sc.nextLine();
	
	public static void main(String [] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter Your Fisrt String");
		String st1=sc.nextLine();
		System.out.println("Enter Your Second String");
		String st2=sc.nextLine();
		if(st1.length()!=st2.length())
		{
			System.out.println("Not Anagram");
		}
		st1=st1.toLowerCase();
		st2=st2.toLowerCase();
		char []fs=st1.toCharArray();
		char [] fs2=st2.toCharArray();
		Arrays.sort(fs);
		Arrays.sort(fs2);
		if(Arrays.equals(fs, fs2))
		{
			
			System.out.println("Anagram");
		}
		else
		{
			
			System.out.println("Not Anagram");
		}
		
		
		
		
		
	}
	

}
