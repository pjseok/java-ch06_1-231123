package ch06_4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator call = new Calculator();
		
		int result = call.sum(10, 20); // sum은 return값이 있는 메소드
		
		System.out.println(result);
		
		call.print(); // print는 return값이 없는 메소드
		int result2 = call.sum();
		
		call.abc(100);
		
	}

}
