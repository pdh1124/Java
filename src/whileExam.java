import java.util.Scanner;

public class whileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스캐너 구문 (입력받은 숫자나 문자를 만들어줌) 콘솔창에 숫자를 입력
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		while(i < 10) { //조건이 부합되는 동안은 계속 안의 내용문을 실행해주는 함수 
			System.out.println(i+1);
			i++;
		}
		//조건이 맞지 않게 되면 다음 코드로 넘어감
		
	}

}
