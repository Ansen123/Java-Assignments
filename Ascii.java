import java.util.*;
class Ascii{
public static void main(String[]args)

{
char a;
Scanner input=new Scanner(System.in);
System.out.println("enter character");
a=input.next().charAt(0);
int b=a;
System.out.println("Ascii value" +a+" is "+b);
}
}