//import java.lang.*; => all classes from java.lang package are available implicitly
class Sum
{
  public static void main(String[] args)
  {  
  //java.lang.Integer : class from the pkg
  //Method of Integer class
  //public static int parseInt(String s)
  //string --> int
  int num1=Integer.parseInt(args[0]);
  int num2=Integer.parseInt(args[1]);
     System.out.println("Sum="+(num1+num2));	 
  }
}