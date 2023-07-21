import java.io.*;
import java.util.*;
class Reverse{
public static void main(String args[]){
int n;
System.out.println("enter a no");
Scanner s =new Scanner(System.in);
n=s.nextInt();
while(n!=0)
{
int b=n%10;
System.out.print(b);
n=n/10;
}}}