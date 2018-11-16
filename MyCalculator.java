import java.util.Scanner;
public class MyCalculator {
  public static void main(String[] args) {

    int a, b, res;
       char ch;
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter First Number : ");
       a = scan.nextInt();
       System.out.print("Enter Second Number : ");
       b = scan.nextInt();
       System.out.print("Enter Operator (+, -, *, /) : ");
       ch = scan.next().charAt(0);
       while(b == 0) {
         System.out.println("Try again, enter another number");
         System.out.println("Enter second number: ");
         b = scan.nextInt();
       }

       if(ch == '+')
       {
            res = a + b;
            System.out.print("Result = " +res);
       }
       else if(ch == '-')
       {
            res = a - b;
            System.out.print("Result = " +res);
       }
       else if(ch == '*')
       {
            res = a * b;
            System.out.print("Result = " +res);
       }
       else if(ch == '/')
       {
            res = a / b;
            System.out.print("Result = " +res);
       }
       else
       {
            System.out.print("Wrong Operator !!!");
       }

    }
}
