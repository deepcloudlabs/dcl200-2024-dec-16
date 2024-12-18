package com.example;

import java.util.HashSet;

public class Exercise08 {

	public static void main(String[] args) {
		var set = new HashSet<>(20_000_000,0.5f);
		var start = System.currentTimeMillis();
		for (var i = 0; i < 10_000_000; ++i) {
			set.add(new ABC(i));
		}
//		while (!set.isEmpty())
//			set.remove(new ABC(42));
		var stop = System.currentTimeMillis();
		System.out.println("Duration: %d ms. length: %d".formatted(stop - start,set.size()));
		
	}

}

record ABC(int i) {}