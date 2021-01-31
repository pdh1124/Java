package a;

import b.Test3;

public class Test2 extends Test1 { // extends Test1은 부모를 Test1로 상속사킨다.
	
	public static void main(String[] args) {
		
		Test1 test1 = new Test1();
		Test3 test3 = new Test3();
		
		System.out.println(test1.a); //Test.java1에 있는 a라는 변수를 가져올수 있다.
		//같은 패키지 안에 있는 변수값을 사용 가능함.
		
		//System.out.println(test3.b); //b패키지 안에 있는 Test3.java에 b라는 변수는 가져 올수 없다. 다른 패키지 이기 때문
		System.out.println(test3.c);
		
		//System.out.println(test1.d); //Test1.java안에 있는 private이 선언된 변수를 가져올 수 없다.
		
		System.out.println(test1.e); //5줄에 public class Test2 extends Test1 중 extends Test1없다면 실행 안됨
	}
}
