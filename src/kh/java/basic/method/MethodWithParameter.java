package kh.java.basic.method;

/**
 * 파라미터(매개변수)가 없는 메소드
 * 파라미터(매개변수)가 있는 메소드
 *
 */

public class MethodWithParameter {
	public static void main(String[] args) {
		
		MethodWithParameter m = new MethodWithParameter();
		m.test1();
		m.test2();
		m.test3();
	}
	
	public void test1() {
		//1.데이터 할당부
		String name = "홍길동";
		int age = 30;
		//2.데이터 출력부
		printPerson(name,age);
	}
	
	public void test2() {
		//1.데이터 할당부
		String name = "홍길순";
		int age = 20;
		//2.데이터 출력부
		printPerson(name,age);
	}
	
	public void test3() {
		//1.데이터 할당부
		String name = "홍길현";
		int age = 50;
		//2.데이터 출력부
		printPerson(name,age);
	}
	
	/**
	 * 매개변수는 지역변수를 선언한 것과 동일하다.
	 * 메소드 호출시에 전달한 값이 자동으로 대입된다.
	 * @param name
	 * @param age
	 * 
	 */
	public void printPerson(String name, int age) {
		System.out.println("이름 : "+name+"\n나이 : "+age+"살");
	}
}
