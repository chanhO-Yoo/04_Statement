package kh.java.basic.method;

import java.util.Scanner;

/**
 * 자바에서 메소드가 호출되면
 * 메소드 몸통을 실행하고, 실행이 끝난 뒤
 * 메소드 호출코드로 돌아간다.
 * 이를 리턴(return)이라고 한다.
 * 
 * 이때, return 값을 가질 수도 있고,
 * 없을 수도 있다.(void)
 *
 */

public class MethodWithReturnValue {
	public static void main(String[] args) {
		MethodWithReturnValue m = new MethodWithReturnValue();
		m.test();
	}
	
	/*
	 * 사용자가 입력한 두 수의 합을 구하는 메소드
	 * 
	 */
	public void test() {
		int num1 = inputNumber();
		int num2 = inputNumber();
		
		int sum = num1 + num2;
		System.out.println(">> 입력한 두 수의 합은 ["+sum+"]입니다.");
		
//		return; //test()를 호출한 곳으로 돌아간다.
	}
	
	/**
	 * 사용자로부터 입력받은 정수를 리턴하는 메소드
	 * @return
	 */
	public int inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 > ");
		int num = sc.nextInt();
		return num;
	}
}
