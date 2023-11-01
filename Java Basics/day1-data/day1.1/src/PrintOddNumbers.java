
import java.util.Scanner;
class PrintOddNumbers
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
	 {
		 System.out.println("Printing odd nos in the range : "+num1+"-"+num2);
		  for (int i=num1;i<=num2;i++)
			  if(i % 2 !=0)
				  System.out.println("Odd No "+i);
			  
	 }		
	 else
		 System.out.println("ERROR : num1 must be < num2 , try again !");
	 //close scanner
	 sc.close();
   }
}