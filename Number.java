import java.io.*;
import java.util.*;
class Number{
public static void main(String args[]){
	{ 
	int b,i,rem;
	int a;
	
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the no of input");
	a=sc.nextInt();
	for(i=1;i<=a;i++)
	{
		System.out.println("enter a no");
		b=sc.nextInt();
		if(b==0)
		{
			System.out.println("neither odd nor even");
		}
			else if(b<0)
			{
				System.out.println("not possible");
			}
			else{
				while(b>0)
				{
					rem=b%10;
					b=b/10;
					if(rem%2==0)
					{
						System.out.println("even");
					}
					else
					{
						System.out.println("odd");
}}}}}}}