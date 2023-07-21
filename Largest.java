import java.io.*;
import java.util.*;

class Largest{
public static void main(String args[]){
int a[]={1,2,3,4,5};
int n,i;
n=a.length;
int max=a[0];
int min=a[0];
for(i=0;i<n;i++)
{
if (a[i]>max)
max=a[i];

else if(a[i]<min)
{
min=a[i];}
System.out.print(max);
System.out.print(min);
}}}
