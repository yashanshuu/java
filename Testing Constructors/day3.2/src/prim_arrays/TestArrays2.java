package prim_arrays;
import java.util.Scanner;
public class TestArrays2 {

	public static void main(String[] args) {
		// create scanner class instance to wrap stdin
		Scanner sc=new Scanner(System.in);
		//print the name of the class
		System.out.println("Name of the class "+sc.getClass());//java.util.Scanner
		System.out.println("Enter array size");
		double[] data=new double[sc.nextInt()];
		//mem pic : data : stack ---> array object in the heap : CP , 
		//length=..., array elements , CP ---> loaded array class in Method area
		//data : array type of ref var.
		//attach for-each loop to display def array contents
		System.out.println("default contents of the array");
		for(double d : data) //d=data[0],d=data[1].....d=data[data.length-1]
			System.out.print(d+" ");
		System.out.println();
		//accept data from user , fill up the array n display
		for(int i=0;i<data.length;i++)
		{
			System.out.println("Enter array data");
			data[i]=sc.nextDouble();
		} //10 20 30
//		for(double d : data)//d=data[0]
//		{
//			System.out.println("Enter array data");
//			d=sc.nextDouble();
//		}
		for(double d : data)
			d *= 2;
		System.out.println("populated contents of the array");
		for(double d : data)
			System.out.println(d+" ");
		//print name of the class for array
		System.out.println("Name "+data.getClass()); // [D		
		sc.close();

	}

}
