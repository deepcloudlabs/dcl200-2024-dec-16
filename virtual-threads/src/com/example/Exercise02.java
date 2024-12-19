package com.example;

public class Exercise02 {
	public static void main(String[] args) throws InterruptedException {
		var begin = System.currentTimeMillis();
        for (int i = 0; i < 2_000; ++i) {
            Thread.sleep(2); // Main Thread -> vcs
        }
        var end = System.currentTimeMillis();
        System.out.println("Millis elapsed: " + (end - begin));
        System.out.println("Overhead      : %" + (end - begin - 4000) / 40.0);
	}
}
