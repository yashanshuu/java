//class : keyword , Java is fully encapsulated language
//data members n functionality will be added within the //class
class HelloWorld
{
//public : access modifiers => accessible from anywhere
//static : accessible w/o creating the object
//void : doesn't ret anything to the caller
//args : cmd line args 
//String : Java lib class from the default available pkg 
//java.lang
  public static void main(String[] args)
  {
  //System : name of the class : from java.lang
  //out : represents stdout(i.e console)
  //println : method(function) -prints data + new line
     System.out.println("Welcome 2 Java !");
	 System.out.println("Hello , "+args[0]);
  }
}