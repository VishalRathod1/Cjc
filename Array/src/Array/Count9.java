package Array;

public class Count9 {
public static void main(String[] args) {
	int i,no,no1,count=0;
	for(i=59;i<=99;i++)
	{
		no=i%10;
		no1=i/10;
		if(no==9 || no1==9)
		{
			System.out.println(i);
			
			count++;
		}
		if(no==9 && no1==9)
		{
			count++;
		}
	}
	System.out.println(count);

}
}
