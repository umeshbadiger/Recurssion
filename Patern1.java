package Recurssion;

public class Patern1
{
	public static int m1()
	{
		int n=100; int res=0; boolean flag=true;
		for(int i=2; i<n; i++)
		{
			if(n%i == 0)
			{
				for(int j=2; j<n; j++)
				{
					if(n%j==0)
					{
						flag = false;
					return   res = j;
					}
				}
			 
			}
		}
		if(flag==true)
		{
			res=1;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		int result = m1();
		System.out.println(result);
	}
	

}
