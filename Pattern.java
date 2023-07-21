import java.io.*;
import java.util.*;
class Pattern{
public static void main(String args[]){


Scanner sc =new Scanner(System.in);
System.out.println("enter a no: ");
int a=sc.nextInt();
int i,j;
for(i=0;i<a;i++)
	
	{
for(j=a-i;j>1;j--)
{
System.out.print(" ");
}
for(j=0;j<=i;j++ )
{
System.out.print(j+1);

System.out.print(" ");
}
System.out.println();
}}}