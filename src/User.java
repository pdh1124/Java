
public class User {
	
	
	String name; //이름
	int age; //나이
	String hobby; //취미
	
	
	//클래스의 생성자
	public User (String _name, int _age, String _hobby) {
		this.name = _name; //this.는 5줄의 name을 말한다.
		this.age = _age;
		this.hobby = _hobby;
	} 
	
	// 디폴트 생성자 (생성자를 하나이상 넣을때는 만들어 줘야함)
	public User() {}
	
	//getter & setter 영역 (따로따로 넣어주고 싶을때)
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
