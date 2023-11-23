package ch06_1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student(); //Student 클래스로 객체가 선언
		
		stu1.name = "홍길동";
		stu1.age = 10;
		
		Student stu2 = new Student(); //Student 클래스로 객체가 선언
		
		stu2.name = "김유신";
		stu2.age = 20;
		
		Car car1 = new Car();
		System.out.println(car1.speed); // 0
		car1.printSpeed();              // 10
		System.out.println(car1.speed); // 10
		
	}

}
