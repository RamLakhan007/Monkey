package com.app;

public class MyClass {
     void calculate(double x){
    	 System.out.println("square="+(x*x));
     }
}
class Common{
	public static void main(String[] args) {
		MyClass obj1=new MyClass();
		MyClass obj2=new MyClass();
		MyClass obj3=new MyClass();
		MyClass obj4=new MyClass();
		
		obj1.calculate(3);
		obj1.calculate(4);
		obj1.calculate(5);
		obj1.calculate(6);
	}
}