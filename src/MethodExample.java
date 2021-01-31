
public class MethodExample {

	public static void main(String[] args) {
		
//		String a = "hello";
//		String b = " world";
//		
//		System.out.println(a + b);
		
//		String c = "hi,";
//		String d = " park";
//		
//		System.out.println(c + d);
		
		MethodExample main1 = new MethodExample(); //클래스 생성
		main1.StrCombine("hello", " world"); //메소드 실행 (String 타입을 2개를 넘겨 줌.)
		
		main1.StrCombine("hi,", "park");
		
		
		System.out.println(main1.StrCombine2("good", "bye"));
		
		String bbb = main1.StrCombine2("GOOD,", " BYE");
		System.out.println(bbb);
	}
	
	
	//메소드를 만든 것
	//만드는 이유
	//1. 유지보수를 위해서
	//2. 가독성이 좋아지니까
	//3. 캡슐화 하게 되면 여러곳에서 중복된 코드를 작성할 필요가 없어짐
	public void StrCombine (String a, String b) { //void는 실행형 메소드
		String result = a + b;
		
		System.out.println(result);
	}
	
	
	public String StrCombine2 (String good, String bye) { //return 리턴형 메소트
		String result = good + bye;
		return result; 
		
	}
}
