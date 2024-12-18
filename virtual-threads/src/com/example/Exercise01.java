package com.example;

public class Exercise01 {

	public static void main(String[] args) {
		// Kernel Thread, -Xss8m -> static/constant -> virtual memory
		// 1024 Platform Thread -> 4g
		// vcs -> throughput
		// use-case: cpu-bound -> platform thread, parallel programming
		var pt1 = Thread.ofPlatform(); 
		// Carrier Thread -> Platform Thread
		// JVM/Developer Thread, Initial Page Size (4K)		
		// 1024 Virtual Thread -> 4M -> scalable
		// vcs -> virtual thread continuation
		// use-case: io-bound (disk io, network io -> kafka/relational/no-sql)
		//           asynchronous/event-driven/non-blocking networking
		//           since java 1.4: nio -> selector/channel -> asynchronous/event-driven/non-blocking
		//           since java 7: nio2 
		//           since java 9: reactive programming -> flow api -> Concurrency API
		var vt1 = Thread.ofVirtual();

	}

}
