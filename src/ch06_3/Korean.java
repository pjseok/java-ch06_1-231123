package ch06_3;

public class Korean {
	
	String nation ="대한민국";
	String name;
	String ssn;
	
	public Korean(String name, String ssn) {
		super();
		this.name = name; // 생성자의 매개변수 이름과 필드의 이름이 완전히 동일할 때는 필드 앞에 this. 추가하여야 한다
		this.ssn = ssn;
	} 
	
	
}
