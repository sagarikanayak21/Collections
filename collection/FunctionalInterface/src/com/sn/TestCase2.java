package com.sn;

@FunctionalInterface
interface AddI2 {
	public void add(int a, int b);
	default void printName() {
		System.out.println("Sagarika");
	}
}

public class TestCase2 implements AddI2 {
	public static void main(String[] args) {
		
	}

	@Override
	public void add(int a, int b) {
		
	}
}
