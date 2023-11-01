import java.util.Scanner;

class PrintSeason2
{
  public static void main(String[] args)
  {  
  	 Scanner sc=new Scanner(System.in);
	boolean exit=false;
	while(!exit){
		 System.out.println("Enter month no");
		 switch(sc.nextInt()) {
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
			  default : System.out.println("Invalid month no!!!!!!");
			  exit=true;
			  
		 }
	}
	  System.out.println("Terminating the app");
	 sc.close();
	
  }
}