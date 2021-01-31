package a;

public class Test1 { //클래스의 첫글자는 대문자가 관례이다.
	
	//default, public, private, protected
	//사용 목적: 1.보안상의 문제, 2.협업을 할때 무분별하게 사용하지 않도록
	String f = "테스트";
	public String a = "테스트1"; //접근 제한자 중 디폴트제한자 라고 함
	private String d = "테스트4";  //자신 클래스에서만 사용가능(같은 패키지도 적용 불가)
	protected String e = "테스트5"; //디폴트처럼 같은 패키지 내에서는 사용가능함 (클래스의 부모를 상속시키면 사용 할 수 있음)
	
	public static void main(String[] args) {
		
	}
}
