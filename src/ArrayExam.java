
public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "����";
		int b = 100;
		
		//�迭������ �Ϸ��� []�� �ٿ��ָ� �ȴ�.
		int arrayInt[] = new int[10]; //0 ���� 9������ ���� ��� ����. ������� �����Ҷ� �����
		
		for (int i = 0;i < arrayInt.length;i++) {
			System.out.println(i);
		}
		
		//�迭�� ���� ã��
		int arrayInt2[] = {1,3,6,7,8,9};
		
		for (int i = 0;i < arrayInt2.length;i++) {
			System.out.println(i);
		}
		
		//�迭�� ���ʴ�� �����ϱ�
		int arrayInt3[] = {1,3,6,7,8,9};
		
		for(int i=0; i<arrayInt3.length ;i++) {
			System.out.println(arrayInt3[i]);
		}
		
		
		//���ڿ��� ����
		String arrayStr[] = {"a", "b", "c", "d", "e"};
		
		for(int i=0; i<arrayStr.length ;i++) {
			System.out.println(arrayStr[i]);
		}
	}

}
