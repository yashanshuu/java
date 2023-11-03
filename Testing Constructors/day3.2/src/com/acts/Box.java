package com.acts;
public class Box {
	// state : private non static data members (fields) => tight encapsulation
	private double width, depth, height;// instance variables
	// add a parameterized constructor , to create n init complete state of the Box

	public Box(double w, double d, double height) {
		this.width = w;// initing the instance var, width : instance var , w : local var
		this.depth = d;
		this.height = height;// height : local var, this : keyword in java
		// => curnt object reference(pointer) , this.height : instance var
	}
	// Behavior or functionality or actions upon data
	// 1. Write a method , to return String representation of curnt Box's
	// dimentions
	public String getBoxDetails()
	{
		System.out.println("this : "+this.hashCode());
		//Can instance method(=non static) access "this" : YES
	//	System.out.println(this.depth);
		return "Box Dims "+this.width+" "+this.depth+" "+this.height;
		//using "this" keyword : optional
	}
	//2. Write a method , to return computed box volume
	double getBoxVolume() 
	{
		return this.depth*this.width*this.height;
	}
	//3. Write a method , to get the width of the box : a getter for width
	double getWidth()
	{
		return this.width;
	}
	//4. Write a method , to set the width of the box : a setter for width
	void setWidth(double width)
	{
		this.width=width;
	}
	//5 . Write a method , to update all 3 dims 
	//i/p : width offset , depth offset , height offset
	//Result : original box dims should be modified with the offset values
	//eg : Box : 10 , 20 , 30
	//offsets : 5, -2 , 3
	//Box dims : 15 , 18 ,33
	void updateBoxDims(double widthOffset,
			double depthOffset,double heightOffset)
	{
		this.width=this.width+widthOffset;
		this.depth=this.depth+depthOffset;
		this.height=this.height+heightOffset;
	}
	//6. Write a method , to double width of a box , if the box volume < 100
	//It should return true , if doubled , otherwise return false.
	boolean doubleBoxWidth() {
		if(this.getBoxVolume()<100)
		{
			this.setWidth(this.getWidth()*2);
			return true;
		}
		return false;
	}
	
	

}
