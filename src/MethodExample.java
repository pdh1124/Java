
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
		
		MethodExample main1 = new MethodExample(); //Ŭ���� ����
		main1.StrCombine("hello", " world"); //�޼ҵ� ���� (String Ÿ���� 2���� �Ѱ� ��.)
		
		main1.StrCombine("hi,", "park");
		
		
		System.out.println(main1.StrCombine2("good", "bye"));
		
		String bbb = main1.StrCombine2("GOOD,", " BYE");
		System.out.println(bbb);
	}
	
	
	//�޼ҵ带 ���� ��
	//����� ����
	//1. ���������� ���ؼ�
	//2. �������� �������ϱ�
	//3. ĸ��ȭ �ϰ� �Ǹ� ���������� �ߺ��� �ڵ带 �ۼ��� �ʿ䰡 ������
	public void StrCombine (String a, String b) { //void�� ������ �޼ҵ�
		String result = a + b;
		
		System.out.println(result);
	}
	
	
	public String StrCombine2 (String good, String bye) { //return ������ �޼�Ʈ
		String result = good + bye;
		return result; 
		
	}
}
