package com.sn;

interface AddI1 {
	public int add(int a, int b);
}

public class TestCase1 {
	public static void main(String[] args) {
//		AddI1 aI = (int a, int b) -> { return a+b; };

		AddI1 aI = (a, b) -> {
			System.out.println("Adding Two Numbers : " + a + " " + b);
			return a + b;
		};
		int add = aI.add(27, 17);
		System.out.println(add);
	}
}
