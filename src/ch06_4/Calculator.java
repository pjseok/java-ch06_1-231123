package ch06_4;

public class Calculator {
	
	int a, b;
	
	public int divide(int a, int b) {
		a = a;
		b = b;
		return a / b;
	}
	
	
	
	public int sum(int x, int y){ // return 값이 있을 때 -> return 값이 자료타입
		int sum = x + y;
		return sum;
	}
	
	public int sum() { //메소드 오버로딩(매개변수의 종류와 개수를 다르게 같은 이름의 메소드를 여러개 만드는 것)
		return 10+20;
	}
	
	public void print() { // return 값이 없을 때 -> void
		System.out.println("저는 사칙연선 계산기입니다");
	}
	
	public int mul(int x) {
		int a = x;
		int result = sum(a, 10); // 같은 클래스내에 있으므로 다른 매서드를 호출 가능
		return result;
	}
	
	public void abc(int x) {
		System.out.println("정수 매개변수");
	}
	
	public void abc(double x) {
		System.out.println("실수 매개변수");
	}
	
	public void abc(String x) {
		System.out.println("문자 매개변수");
	}
	
	
}	
