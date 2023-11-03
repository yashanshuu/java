package ref_array;
import java.util.Scanner;
import com.acts.Box;

public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of boxes");
		Box[] boxes=new Box[sc.nextInt()];//how many objs ? : 1 => array object
		System.out.println("Name of array class "+boxes.getClass());
		System.out.println("Def contents : ");
		for(Box b : boxes)
			System.out.println(b);
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter box dims");
			boxes[i]=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		//display box details
		System.out.println("populated  contents : ");
		for(Box b : boxes)
			System.out.println(b);
		//display actual box dims
				System.out.println("populated  contents again: ");
				for(Box b : boxes)
					System.out.println(b.getBoxDetails());
		
		sc.close();

	}

}
