import java.util.*;
class Coffee
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int p=sc.nextInt();
  int v;
while(x)
{
v=x-p;
x=v;
if(x==0)
{
System.out.print("Free"); 
}
}

}
}
