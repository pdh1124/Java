package a;

import b.Test3;

public class Test2 extends Test1 { // extends Test1�� �θ� Test1�� ��ӻ�Ų��.
	
	public static void main(String[] args) {
		
		Test1 test1 = new Test1();
		Test3 test3 = new Test3();
		
		System.out.println(test1.a); //Test.java1�� �ִ� a��� ������ �����ü� �ִ�.
		//���� ��Ű�� �ȿ� �ִ� �������� ��� ������.
		
		//System.out.println(test3.b); //b��Ű�� �ȿ� �ִ� Test3.java�� b��� ������ ���� �ü� ����. �ٸ� ��Ű�� �̱� ����
		System.out.println(test3.c);
		
		//System.out.println(test1.d); //Test1.java�ȿ� �ִ� private�� ����� ������ ������ �� ����.
		
		System.out.println(test1.e); //5�ٿ� public class Test2 extends Test1 �� extends Test1���ٸ� ���� �ȵ�
	}
}
