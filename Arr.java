import java.io.*;
import java.util.*;
class Arr{
public static void main(String args[]){
int n,i;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
for(i=0;i<=n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<=n;i++)
{
System.out.println(a[i]);
}}}