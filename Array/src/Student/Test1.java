package Student;

import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
	System.out.println("enter any no.");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    Student s[]=new Student[3];
	for(int i=0;i<=n;i++){
		Student s1=new Student();
		System.out.println("enter your rollno");
		s1.setRollno(sc.nextInt());
		System.out.println("enter your name");
	    s1.setName(sc.next());
	    s[i]=s1;
	}
	for(int i=0;i<=n;i++){
		System.out.println("Roll no:"+s[i].getRollno());
		System.out.println("Name:"+s[i].getName());
	}
	
}

}
