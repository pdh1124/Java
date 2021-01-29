
public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "에이";
		int b = 100;
		
		//배열선언을 하려면 []를 붙여주면 된다.
		int arrayInt[] = new int[10]; //0 부터 9까지의 수를 담고 있음. 순서대로 나열할때 사용함
		
		for (int i = 0;i < arrayInt.length;i++) {
			System.out.println(i);
		}
		
		//배열의 갯수 찾기
		int arrayInt2[] = {1,3,6,7,8,9};
		
		for (int i = 0;i < arrayInt2.length;i++) {
			System.out.println(i);
		}
		
		//배열을 차례대로 나열하기
		int arrayInt3[] = {1,3,6,7,8,9};
		
		for(int i=0; i<arrayInt3.length ;i++) {
			System.out.println(arrayInt3[i]);
		}
		
		
		//문자열도 가능
		String arrayStr[] = {"a", "b", "c", "d", "e"};
		
		for(int i=0; i<arrayStr.length ;i++) {
			System.out.println(arrayStr[i]);
		}
	}

}
