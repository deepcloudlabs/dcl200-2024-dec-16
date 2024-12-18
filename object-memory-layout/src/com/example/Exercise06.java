package com.example;

public class Exercise06 {

	public static void main(String[] args) {
		var start = System.currentTimeMillis();
		var s = new StringBuffer(68888890);
		for (var i = 0; i < 10_000_000; ++i) {
			s = s.append(i);
		}
		var stop = System.currentTimeMillis();
		System.out.println("Duration: %d ms. length: %d".formatted(stop - start,s.length()));
	}

}
