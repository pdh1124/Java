
public class study03 {
	
	//�����Լ� (�����Լ�)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String donghoon = "���θ� �մϴ�.";
		int a = 1;
		
		if(donghoon == "�����Ѵ�") { //���࿡ () ��� {}���θ� ������
			System.out.println("�����Դϴ�.");
		} 
		else if (donghoon == "���θ� �մϴ�.") { 
			System.out.println("�� �����Դϴ�.");
		}
		else { //if������ ���ܵ� ��� ��Ȳ�� �����´�.
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
		
		
		if(a == 0) {
			System.out.println("a�� 0�Դϴ�.");
		}
		else if(a == 1) {
			System.out.println("a�� 1�Դϴ�.");
		}
		else {
			System.out.println("a�� 2�̻��Դϴ�.");
		}
		
		
		// and ������, or ������
		if (a == 0 && a == 1) { //a�� 0�̰� a�� 1�̿��� �����Ѵ�.
			System.out.println("a�� 0�̰� a�� 1�̴�.");
		} else {
			System.out.println("a�� 0������ 1�� �ƴϴ�.");
		}
		
		if (a == 0 || a ==1) { //a�� 0�̰ų� 1�̸� �����Ѵ�.
			System.out.println("a�� 0�̰ų� 1�̴�.");
		}	
	}	

}
