package com.kitri.thread;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		Thread t1 = new ThreadExt("퐁");
		Thread t2 = new ThreadExt("당");
		Thread t3 = new ThreadExt("!!!");
//		일반적인 순서로 실행됨.
//		t1.run();
//		t2.run();
//		t3.run();
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("프로그램 종료!!!");
	}
	
	
}
