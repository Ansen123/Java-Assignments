import java.util.*;
class Swap_withvarible{
public static void main (String[]args){

int num1,num2,temp;
Scanner input=new Scanner(System.in);
System.out.println("Enter the two numbers");

num1=input.nextInt();
num2=input.nextInt();



temp=num1;
num1=num2;
num2=temp;

System.out.println("After Swaping  " +num1+" "+num2);
}
}