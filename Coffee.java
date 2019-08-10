import java.util.*;
class Cofee
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int p=sc.nextInt();
while(x)
{
p=x-90;
x=p;
if(x==0)
{
System.out.print("Free"); 
}
}

}
}
