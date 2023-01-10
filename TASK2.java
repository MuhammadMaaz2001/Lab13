package lab12;
import java.util.Scanner;
public class TASK2 {
public static void main(String[] args) {
try {
Scanner Sc = new Scanner(System.in);
System.out.println("ENTER 1st NUMBER: ");
int number1= Sc.nextInt ();
System.out.println("ENTER 2nd NUMBER: ");
int number2 = Sc.nextInt ();
int result = number1/number2;
System.out.println("THE RESULT OF DIVION IS = "+result);}
catch(ArithmeticException e) {

System.out.println("NUMBER IS NOT DIVIDED BY 0");
}
catch (Exception ex) {
System.out.println("INVALID NUMBERS ENTERED BY USER");
}
}
}