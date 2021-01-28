
public class data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자형
		char var1 = '박'; //한글자 한글 or 영문 사용 가능, ''로 작업해주어야 함
		String var2 = "박동훈의 자바 공부"; //String은 char를 제외한 여러 글자의 문자를 입력할때 사용,""로 작업해주어야 함
		
		//정수형
		byte var3 = -128;// 1byte로 -128 ~ +127까지 숫자가 가능하다.
		short var4 = -32768; //2byte로 -32768 ~ +32767까지 숫자가 가능하다.
		int var5 = 999999999; // -21억 ~ +21까지 숫자가 가능하다. int가 통용적으로 많이 사용한다.
		long var6 = 999999999; // 8byte를 사용 가능하다. String이랑 비슷하다. 여러숫자의 입력가능
		
		//실수형(소수)
		float var7 = 0.5f; //4byte를 사용해서 소수열로 표현할 때 씀, 사용할때 숫자 뒤에 f를 넣어주어야 함
		double var8 = 0.000000005;//float를 비슷한데 8byte를 사용해서 더 많은 소수열을 표현함.
		
		//boolean형
		boolean isStart = false; //true or false를 입력하여 조건식에서 많이 사용함..
		
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(isStart);
		
		
	}

}
