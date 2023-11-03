package com.acts.tester;
import com.acts.Box;
public class TestBox2 {

	public static void main(String[] args) {
		Box b1=new Box(10, 20, 30);
		Box b2=new Box(1,2,3);
		Box b3=b1;
		b1=null;
		System.out.println(b3.getBoxDetails());
		b3=null;
		//Are there any objects marked for garbage collection ? YES
		//1st object : since no of refs referring to the 1st object is 0

	}

}
