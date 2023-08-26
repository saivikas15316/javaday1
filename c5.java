import java.util.Scanner;
public class c5
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter first number");
int num1=in.nextInt();
System.out.println("enter second value");
int num2=in.nextInt();
System.out.println(num1+"+"+num2+"="+(num1=num2));
System.out.println(num1+"-"+num2+"="+(num1-num2));
System.out.println(num1+"*"+num2+"="+(num1*num2));
System.out.println(num1+"/"+num2+"="+(num1/num2));
}
}
