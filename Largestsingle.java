import java.util.*;
public class Largestsingle {

    public static void main(String[] args) {
     
Scanner input=new Scanner(System.in);
System.out.println("Enter the Three numbers");

int a=input.nextInt();
int b=input.nextInt();
int c=input.nextInt();      
         
        int largest =(a>b)?(a>c?a:c):(b>c?b:c);
         
        System.out.print(largest + " is the largest.");
    }
}