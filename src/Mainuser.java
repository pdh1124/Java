
public class Mainuser {

	public static void main(String[] args) {
		//������ �Ķ����(�Ű�����)�� �°� ���ڸ� �������ش�.
		User user = new User("park", 27, "����"); //Ŭ���� ����
//		User user1 = new User("kim", 25, "�߱�"); //Ŭ���� ����
//		User user2 = new User("lee", 24, "�౸"); //Ŭ���� ����
//		User user3 = new User("choi", 23, "�豸"); //Ŭ���� ����
//		User user4 = new User("kil", 22, "����"); //Ŭ���� ����
//		User user5 = new User("ro", 21, "����"); //Ŭ���� ����
		User user_getset = new User();
		user_getset.setName("������");
		user_getset.setAge(32);
		user_getset.setHobby("��Ű");
		
		System.out.println(user.name);
		System.out.println(user.age);
		System.out.println(user.hobby);
		
		System.out.println(user_getset.getName());
		System.out.println(user_getset.getAge());
		System.out.println(user_getset.getHobby());
		
	}
}