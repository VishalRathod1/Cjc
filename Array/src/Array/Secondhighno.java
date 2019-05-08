package Array;

public class Secondhighno {
	public static void main(String[] args) {
		int a[]={10,5,20,15,32};
		int first=0,second=0;
		for(int i=0;i<a.length;i++)
		{
		if(a[i]>first)
		{
		second=first;
		first=a[i];
		}
		else if(a[i]>second && first!=a[i])
		{
		second=a[i];
		}
		System.out.println(second);
		}
	}
}
