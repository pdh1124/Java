
public class User {
	
	
	String name; //�̸�
	int age; //����
	String hobby; //���
	
	
	//Ŭ������ ������
	public User (String _name, int _age, String _hobby) {
		this.name = _name; //this.�� 5���� name�� ���Ѵ�.
		this.age = _age;
		this.hobby = _hobby;
	} 
	
	// ����Ʈ ������ (�����ڸ� �ϳ��̻� �������� ����� �����)
	public User() {}
	
	//getter & setter ���� (���ε��� �־��ְ� ������)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}