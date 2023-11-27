package ch06_1;

public class MainClass { // main 메소드를 가지고 있는 실행클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student(); //Student 클래스로 객체가 선언, 인스턴스화
		
		stu1.name = "홍길동";
		stu1.age = 10;
		System.out.println(stu1.age);
		System.out.println(stu1.name);
		
		Student stu2 = new Student(); //Student 클래스로 객체가 선언, 인스턴스화
		
		stu2.name = "김유신";
		stu2.age = 20;
		
		Car car1 = new Car();
		System.out.println(car1.speed); // 0
		car1.printSpeed();              // 10
		System.out.println(car1.speed); // 10
		
	}

}
