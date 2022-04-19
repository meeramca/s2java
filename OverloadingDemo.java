
package overloading.demo;
import java.util.*;
class Demo2
{
int addition(int a,int b)
{
int res;
res=a+b;
return res;
}
int addition(int a,int b,int c)
{
int res;
res=a+b+c;
return res;
}
int addition(int c)
{
int res;
res=c+1;
return res;
}
}
public class OverloadingDemo {

    public static void main(String[] args) {
     Demo2 obj=new Demo2();
System.out.println("Method Overloading Demo");
Scanner scr=new Scanner(System.in);
System.out.println("Enter Three Integer values for a,b,c:");
int a=scr.nextInt();
int b=scr.nextInt();
int c=scr.nextInt();
System.out.println("Addition Method with two parameters:"+obj.addition(a, b));
System.out.println("Addition Method with Three Parameters:"+obj.addition(a, b, c));
System.out.println("Addition Method with one parameter:"+a+"+1:"+obj.addition(a));  
    }
    
}
