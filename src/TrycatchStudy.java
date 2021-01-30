
public class TrycatchStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[5]; // intArray라는 변수에다가 5의 공간만큼을 배열로 선언(0, 1, 2, 3, ,4, 5)
		
		//try-catch문
		try //try안에 구문을 실행 하다가
		{
			intArray[3] = 10;
			intArray[6] = 1; //해당 코드는 6이라는 공간이 없어 오류가 생김
		}
		catch (Exception e) //문제가 생기거나 오류가 생기게 되면 catch안의 문구를 실행해달라.
		//Exception은 예외라는 뜻, e는 에러의 내용을 담고있음
		{	
			e.printStackTrace(); //실제 에러문을 출력.
			System.out.println("배열 범위 초과");
			System.exit(0); //강제로 프로그램 종료
		}
		
		//try-catch문을 끝나면 이후 코드가 진행이 됨을 알수 있음
		System.out.println("프로그램이 끝났어요.");
	}
		

//  기본 구문
//	try
//	{
//		
//	}
//	catch (Exception e)
//	{	
//		e.printStackTrace();
//	}
}
