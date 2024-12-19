package com.example;

import java.util.LinkedList;

public class Exercise07 {

	public static void main(String[] args) {
		var start = System.currentTimeMillis();
		var s = new LinkedList<Integer>();
		for (var i = 0; i < 10_000_000; ++i) {
			s.add(Integer.valueOf(i%128));
		}
		var stop = System.currentTimeMillis();
		System.out.println("Duration: %d ms. length: %d".formatted(stop - start,s.size()));

	}

}
