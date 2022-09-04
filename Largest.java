import java.util.*;
class Largest{
public static void main (String[]args){

int num1,num2,num3;
Scanner input=new Scanner(System.in);
System.out.println("Enter the two numbers");

num1=input.nextInt();
num2=input.nextInt();
num3=input.nextInt();

if (num1>num2 && num1>num3){

System.out.println("Largest is" +num1);
}
else if (num2>num1 && num2>num3)
{

System.out.println("Largest is" +num2);
}
else
{
System.out.println("Largest is" +num3);
}
}
}

