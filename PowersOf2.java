package Recurssion;

public class PowersOf2
{
	static int i=0;
	public static void main(String[] args) 
	{
		power(5);
		
	}
	static void power(int n)
	{
		int j=i;
		System.out.println(2*j);
		i=i+1;
		if(n==0)
			return ;
		power(n-1);
	}
}
