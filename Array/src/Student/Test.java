package Student;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Student s[]=new Student[3];
	System.out.println("How many students you want to add?");
	int n=sc.nextInt();
	int i;
	for(i=0;i<n;i++)
	{
		Student s1=new Student();
		System.out.println("Enter Roll No:-");
		int rollno=sc.nextInt();
		s1.setRollno(rollno);
		
		System.out.println("Enter Name:-");
		String name=sc.nextLine();
		s1.setName(name);
		//s[i]=s1;
	}
}
}
