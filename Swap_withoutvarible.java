import java.util.*;
class Swap_withoutvarible{
public static void main (String[]args){

int num1,num2;
Scanner input=new Scanner(System.in);
System.out.println("Enter the two numbers");

num1=input.nextInt();
num2=input.nextInt();

num1= num1+num2;
num2=num1-num2;
num1=num1-num2;


System.out.print("After Swaping "  +num1+" "+num2);
}
}