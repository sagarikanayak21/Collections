package com.sn;
 
@FunctionalInterface
interface AddI {
	public void add(int a, int b);
	default void printName(String name) {
		System.out.println("The Name is: " + name);
	}
	default void sal(Double salary) {
		System.out.println("The salary is: " +salary);
	}
	
	public static void printEmpNo(int empNo) {
		System.out.println("The Employee No is: " + empNo);
	}
}

public class TestCase /*implements AddI*/{
	public static void main(String[] args) {
		System.out.println("Hello");
		TestCase test = new TestCase();
//		AddI aI = (int a, int b ) -> System.out.println(a+b);
//		aI.add(29, 19);
		
		AddI aI = (a,b) -> System.out.println(a+b);
		aI.add(28, 19);
		
		aI.printName("Sagarika");
		aI.sal(100.0);
		
		AddI.printEmpNo(101);
		
	}
	
//	@Override
//	public void add(int a, int b) {
//		System.out.println(a+b);
//	}
}
