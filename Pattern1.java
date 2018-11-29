package Recurssion;

public class Pattern1
{
	public static void main(String[] args) 
	{
		print(5);
	}
	static void print(int n)
	{
		System.out.print(n+" ");
		if(n==0) 
		{
			System.out.print(n+" ");
			return;
		}
		
		print(n-1);
	
		System.out.print(n+" ");
	}
}
