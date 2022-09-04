import java.util.*;
public class Reverse{
        public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       
          int num, reversed = 0;
          System.out.print("Enter a Number");

           num=input.nextInt();
   
          while(num != 0) {
          
            int digit = num % 10;
            reversed = reversed * 10 + digit;
      
            num /= 10;
          }
      
          System.out.println("Reversed Number: " + reversed);
        }
      }



