import java.io.*;
import java.util.*;
class Multable{
public static void main(String args[]){
int n;
System.out.println("enter a no");
Scanner s =new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(n+"*" +i+"="+n*i);
}}}