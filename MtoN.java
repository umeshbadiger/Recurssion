package Recurssion;

public class MtoN 
{
	public static void main(String[] args)
	{
		print(5,10);
	}
	static void print(int x,int y)
	{
		System.out.println(2*x);
		x= x+1;
		if(x>y)
			return;
		print(x,y);
		
	}
}
