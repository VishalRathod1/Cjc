package Array;

public class Swap {
	/*public static void main(String[] args) {
		int temp=0,temp1=0;
		int a[]={10,20,30,40,50,60,70,80};
		for(int i=0;i<=7;i=i+4){
			temp=a[i];
			a[i]=a[i+2];
			a[i+2]=temp;
			
			temp1=a[i+1];
			a[i+1]=a[i+3];
			a[i+3]=temp1;
		}
		for(int i=0;i<=7;i++){
			System.out.println(a[i]);
		}
	}*/


	public static void main(String[] args) {
		int temp=0;
		int a[]={10,20,30,40,50,60,70,80};
		for(int i=0;i<=7;i=i+4){
			if(i%10==0 || i/10==0){
			temp=a[i];
			a[i]=a[i+2];
			a[i+2]=temp;
			}
		}
		for(int i=0;i<=7;i++){
			System.out.println(a[i]);
		}
	}
}
