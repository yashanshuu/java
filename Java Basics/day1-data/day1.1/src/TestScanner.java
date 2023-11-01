/*
 Accept 2 double values from user , div the nums n show the result
*/
import java.util.Scanner;
class TestScanner
{
   public static void main(String[] ss) 
   {
     //create scanner class instance , to wrap stdin(i.e to read data from stdin)
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter 1st no");
	 double num1=sc.nextDouble();
	 System.out.println("Enter 2nd no");
	 double num2=sc.nextDouble();
	 System.out.println("Res of div "+"  "+(num1/num2));
	 //close scanner
	 sc.close();
   }
}