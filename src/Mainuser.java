
public class Mainuser {

	public static void main(String[] args) {
		//생성자 파라미터(매개변수)에 맞게 인자를 삽입해준다.
		User user = new User("park", 27, "볼링"); //클래스 생성
//		User user1 = new User("kim", 25, "야구"); //클래스 생성
//		User user2 = new User("lee", 24, "축구"); //클래스 생성
//		User user3 = new User("choi", 23, "배구"); //클래스 생성
//		User user4 = new User("kil", 22, "게임"); //클래스 생성
//		User user5 = new User("ro", 21, "독서"); //클래스 생성
		User user_getset = new User();
		user_getset.setName("차주현");
		user_getset.setAge(32);
		user_getset.setHobby("스키");
		
		System.out.println(user.name);
		System.out.println(user.age);
		System.out.println(user.hobby);
		
		System.out.println(user_getset.getName());
		System.out.println(user_getset.getAge());
		System.out.println(user_getset.getHobby());
		
	}
}
