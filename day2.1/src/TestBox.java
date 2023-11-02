import java.util.Scanner;

public class TestBox {

	public static void main(String[] args) {
		// create scanner class instance
		Scanner sc = new Scanner(System.in);
		// Accept box dims from user , to create a new box
		System.out.println("Enter box dims : width depth height");
		int data;
		Box b1;// no obj created yer , memory is allocated
		// in stack to store the ref type of variable
		b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println("1st Box address " + b1.hashCode());
		// Accept box dims from user for another box.
		System.out.println("Enter box dims for 2nd box : width depth height");
		Box b2 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println("2nd Box address " + b2.hashCode());

		// display box dims n it's volume : 1st box
		System.out.println(b1.getBoxDetails());
		System.out.println("1st box vol " + b1.getBoxVolume());
		// display box dims n it's volume : 2nd box
		System.out.println(b2.getBoxDetails());
		System.out.println("2nd  box vol " + b2.getBoxVolume());
		// accept offsets for updating 1st box dims n update it
		// display new box dims

		System.out.println("Enter the offsets for w d h");
		b1.updateBoxDims(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		// how to display bix with updated dims ?
		System.out.println("updated 1st box" + b1.getBoxDetails());
		// double width of the 2nd box if it's vol < 100 , n display mesg suitably
//		boolean updated=b2.doubleBoxWidth();
//		if(updated) equivalent to if(updated==true)
//			System.out.println("Box width updated....");
//		else
//			System.out.println("Box width NOT updated....");
		System.out.println(b2.doubleBoxWidth() ? "Box width updated...." : "Box width not updated....");
		// compare box volumes , display the suitable mesg
		if (b1.getBoxVolume() < b2.getBoxVolume())
			System.out.println("1st box smaller than 2nd box");
		else if (b1.getBoxVolume() > b2.getBoxVolume())
			System.out.println("1st box bigger than 2nd box");
		else
			System.out.println("Both boxes have same volume!");

		sc.close();

	}

}
