import java.util.Scanner;
public class Armstrong {
   public static void main(String args[]){
 
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the first number ::");
     int  num1 = input.nextInt();
      System.out.println("Enter the second number ::");
     int  num2 = input.nextInt();

for(int i=num1;i<num2;i++){
int check,reminder,sum=0;
check=i;
while(check!=0){

reminder=check%10;

sum=sum+(reminder*reminder*reminder);
check=check/10;
}

if(sum==i){
System.out.println("Amstrong number is" +sum);
}
}
}
}
