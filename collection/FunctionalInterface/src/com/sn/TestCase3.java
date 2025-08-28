package com.sn;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestCase3 {	
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i % 2 == 0 ;
		System.out.println(p.test(5));
		
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Sagarika");
		
		Function<Integer, Integer> f = i -> i*i;
		System.out.println(f.apply(20));
		
		Function<String, Integer> sLength = s -> s.length();
		System.out.println(sLength.apply("Sagarika"));
		
		BiFunction<Integer, Integer, Integer> bif = (a,b) -> a+b;
		System.out.println(bif.apply(20, 30));
		
		Supplier<Integer> s = () -> 5;
		System.out.println(s.get());
		
		Supplier<String> s1 = () -> "Hello Sagarika";
		System.out.println(s1.get());
	}
}
