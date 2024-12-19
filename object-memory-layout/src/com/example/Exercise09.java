package com.example;

public class Exercise09 {

	public static void main(String[] args) {
		double money = 2.0;
		money = money - 1.10;
		System.out.println("money=%16.16f".formatted(money));
		float f = 1_000_000_000f;
		f = f + 50;
		System.out.println("f=%16.16f".formatted(f));
	}

}
