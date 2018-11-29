package Recurssion;

public class Nofrom10to0 
{
	public static void main(String[] args) 
	{
		
	print(5);
		
	}
	static void print(int n)
	{
		System.out.println(n);
		if(n==0)
		{
			return ;
		}
	  print(n-1);
	}
}
