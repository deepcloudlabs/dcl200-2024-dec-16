package com.example;

public class Exercise04 {

	public static void main(String[] args) {
		String name1 = new String("Jack Bauer"); // Heap
		String name2 = "Jack Bauer"; // Constant Pool
		String name3 = "Jack Bauer"; // Constant Pool
		// G1GC is default since Java SE 9
		// -XX:+UseStringDeduplication -> G1GC -> Full GC
		name1 = name1.intern(); // internalize
		System.out.println("name1 == name2: "+(name1==name2));
		System.out.println("name3 == name2: "+(name3==name2));
	}

}
