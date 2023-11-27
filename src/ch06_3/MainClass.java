package ch06_3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car(); // 생성자가 없을 때
		
		Car car2 = new Car(80, 1000); // speed, rpm을 초기화하는 생성자 호출
		
		Car car3 = new Car("소나타","검정",200); //Car 클래스로 car1 객체 선언
		
//		System.out.println(car3.model);
//		System.out.println(car3.color);
//		System.out.println(car3.maxSpeed);
		
		Korean kor1 = new Korean("홍길동", "123456-4567890");
//		System.out.println(kor1.nation);
//		System.out.println(kor1.ssn);
		
		
				
		
		
		
	}

}
