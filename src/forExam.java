
public class forExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3번 쓴다");
		System.out.println("3번 쓴다");
		System.out.println("3번 쓴다");
		
		String str[] = {"하나", "둘", "셋", "넷", "다섯"}; //배열
		
		for (int i = 0; i < 3; i++) {
			System.out.println("3번 반복한다");
		}
		System.out.println("반복이 끝났다.");
		
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i] + " 다음");
		}
	}

}
