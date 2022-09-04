
import java.util.*;
public class Month {
  public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Enter the month");
    int Month=input.nextInt();
    switch (Month) {
      case 1:
        System.out.println("Jan");
        break;
      case 2:
        System.out.println("Feb");
        break;
      case 3:
        System.out.println("march");
        break;
      case 4:
        System.out.println("April");
        break;
      case 5:
        System.out.println("May");
        break;
      case 6:
        System.out.println("Jun");
        break;
      case 7:
        System.out.println("July");
        break;
      case 8:
        System.out.println("Aug");
        break;
      case 9:
        System.out.println("Set");
        break;
      case 10:
        System.out.println("October");
        break;
     case 11:
        System.out.println("Nov");
        break;
     case 12:
        System.out.println("Dec");
        break;
      default:
        System.out.println("Sorry ");
        

    }
  }
}
