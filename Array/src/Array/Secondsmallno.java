package Array;

public class Secondsmallno {
	public static void main(String[] args) {
		int a[]={14,35,9,8,24};
		int first=a[1],second=0;
		for(int i=0;i<a.length;i++)
		{
		if(a[i]<first)
		{
		second=first;
		first=a[i];
		}
		else if(a[i]<second && first!=a[i])
		{
		second=a[i];
		}
		}
		System.out.println(second);
		}
	}

