import java.util.Scanner;

public class whileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ĳ�� ���� (�Է¹��� ���ڳ� ���ڸ� �������) �ܼ�â�� ���ڸ� �Է�
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		while(i < 10) { //������ ���յǴ� ������ ��� ���� ���빮�� �������ִ� �Լ� 
			System.out.println(i+1);
			i++;
		}
		//������ ���� �ʰ� �Ǹ� ���� �ڵ�� �Ѿ
		
	}

}