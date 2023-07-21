import java.io.*;
import java.util.*;
class Summ{
public static void main(String args[]){
int n,sum=0;
System.out.println("enter a no");
Scanner s =new Scanner(System.in);
n=s.nextInt();
int i=0;
for(i=0;i<=n;i=i+2)
{
	sum=sum+i;
}
System.out.println(sum);
}}
