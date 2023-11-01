import java.util.Scanner;

class PrintSeason
{
  public static void main(String[] args)
  {  
  	 Scanner sc=new Scanner(System.in);
	 int input;
	// System.out.println("input="+input);
	 do {
		 System.out.println("Enter month no");
		 switch(input=sc.nextInt()) {
			  case 1 :
			  case 2 :
			  case 11:
			  case 12 : System.out.println("Season : Winter");
			  break;
			  case 3 :
			  case 4 :
			  case 5 :System.out.println("Season : Summer");
			  break;
			   case 6 :
			  case 7 :
			  case 8 :
			  case 9 :
			  case 10 : System.out.println("Season : Monsoon");
			  break;
			  
		 }
	 } while (input !=0);
	 System.out.println("Terminating the app");
	 sc.close();
	
  }
}