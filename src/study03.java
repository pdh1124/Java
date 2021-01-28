
public class study03 {
	
	//실행함수 (메인함수)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String donghoon = "공부를 합니다.";
		int a = 1;
		
		if(donghoon == "공부한다") { //만약에 () 라면 {}내부를 실행함
			System.out.println("정답입니다.");
		} 
		else if (donghoon == "공부를 합니다.") { 
			System.out.println("또 정답입니다.");
		}
		else { //if문에서 제외된 모든 상황을 가져온다.
			System.out.println("틀렸습니다.");
		}
		
		
		if(a == 0) {
			System.out.println("a는 0입니다.");
		}
		else if(a == 1) {
			System.out.println("a는 1입니다.");
		}
		else {
			System.out.println("a는 2이상입니다.");
		}
		
		
		// and 연산자, or 연산자
		if (a == 0 && a == 1) { //a는 0이고 a는 1이여야 실행한다.
			System.out.println("a는 0이고 a는 1이다.");
		} else {
			System.out.println("a는 0이지만 1이 아니다.");
		}
		
		if (a == 0 || a ==1) { //a는 0이거나 1이면 실행한다.
			System.out.println("a는 0이거나 1이다.");
		}	
	}	

}
