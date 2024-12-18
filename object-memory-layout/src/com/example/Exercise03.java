package com.example;

import java.util.List;

public class Exercise03 {

	@SuppressWarnings({ "removal", "unused" })
	public static void main(String[] args) {
		var points = List.of(new Point(1,2),new Point(2,3));
        // 1 | 2 | 2 | 3 | ....
		Integer i = new Integer(42);
	}

}

// immutable
record Point(int x,int y) {}