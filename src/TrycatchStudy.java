
public class TrycatchStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[5]; // intArray��� �������ٰ� 5�� ������ŭ�� �迭�� ����(0, 1, 2, 3, ,4, 5)
		
		//try-catch��
		try //try�ȿ� ������ ���� �ϴٰ�
		{
			intArray[3] = 10;
			intArray[6] = 1; //�ش� �ڵ�� 6�̶�� ������ ���� ������ ����
		}
		catch (Exception e) //������ ����ų� ������ ����� �Ǹ� catch���� ������ �����ش޶�.
		//Exception�� ���ܶ�� ��, e�� ������ ������ �������
		{	
			e.printStackTrace(); //���� �������� ���.
			System.out.println("�迭 ���� �ʰ�");
			System.exit(0); //������ ���α׷� ����
		}
		
		//try-catch���� ������ ���� �ڵ尡 ������ ���� �˼� ����
		System.out.println("���α׷��� �������.");
	}
		

//  �⺻ ����
//	try
//	{
//		
//	}
//	catch (Exception e)
//	{	
//		e.printStackTrace();
//	}
}
