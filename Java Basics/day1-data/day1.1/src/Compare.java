/*
 Accept 2 double values from user , div the nums n show the result
*/
import java.util.Scanner;
class Compare
{
   public static void main(String[] ss) 
   {
     //create scanner class instance , to wrap stdin(i.e to read data from stdin)
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter 1st no");
	 int num1=sc.nextInt();
	 System.out.println("Enter 2nd no");
	 int num2=sc.nextInt();
	 if(num1 < num2)
		 System.out.println(num1 +" < "+num2");
	 else if(num1 > num2)
		 System.out.println("num1 > num2");
	 else
		 System.out.println("num1 = num2");
	 //close scanner
	 sc.close();
   }
}