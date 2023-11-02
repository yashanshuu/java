
public class TestPrimitiveTypes {

	public static void main(String[] args) {
		// byte b1=128;
		byte b1 = 10;
		byte b2 = 20;
		// byte b3=b1+b2;
		int b3 = b1 + b2;
		short s1 = 100;
		int s2 = b1 + s1;
		int data;
		// System.out.println(data);//un initialized var.
		// b1 , b2, ...data : method local variables : by default un initialized!
		data = 123456;
		long l1 = data;// int ---> long : automatic conversion (widening)
		float f = l1;// long --> float
		l1 = (long) f;
		f = 23.4567f;
		double d1 = f;// float --> double
		boolean flag = false;
		System.out.println(flag);
		char ch1 = 'a';
		ch1 = 65;
		System.out.println(ch1);
		System.out.println("Byte range " 
		+ Byte.MIN_VALUE + "---" + Byte.MAX_VALUE);
		System.out.println("int range " 
		+ Integer.MIN_VALUE + "---" + Integer.MAX_VALUE);
		int a=100;
		int b=0;
		System.out.println(a/b);
		System.out.println("main continues....");
	}

}
