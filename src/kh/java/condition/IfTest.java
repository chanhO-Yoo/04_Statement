package kh.java.condition;

import java.util.Scanner;

public class IfTest {
	
	public static void main(String[] args) {
		IfTest it = new IfTest();
//		it.test1();
//		it.test2();
//		it.test3();
//		it.test4();
//		it.test5();
		it.test6();
		
	}
	
	/*
	 * if
	 * 조건식이 true인 경우 if 조건절이 실행된다.
	 * 조건식이 false라면, 조건절을 실행되지 않고 넘어간다.
	 * 
	 */
	public void test1() {
		int a = 10;
//		if(a==10) {
//		if(a>0) {
//		if(a<100) {
//		if(a!=100) {
//			System.out.println("조건절 실행!");
//		}
		
		//사용자 입력값에 따른 철
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 >> ");
		int age = sc.nextInt();
		
		if(age>=20) {
			System.out.println("성인인증되었습니다.");
		}
		
		System.out.println("===test1종료===");
	}
	
	/*
	 * if ... else ...
	 * 
	 * 참 또는 거짓일 경우,
	 * if 또는 else문 중 하나는 반드시 실행된다.
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 >> ");
		int age = sc.nextInt();
		
		//조건식이 참일 경우
		if(age >= 20) {
			System.out.println("성인인증되었습니다.");
		}
		else {
			System.out.println("성인이 아닙니다.");
		}	
	}
	
	/*
	 * if ... else if ...
	 * 조건식이 여러개인 경우에 사용함.
	 * 여러개의 조건식을 직렬화 할 수 있다.
	 * 
	 */
	public void test3() {
		//사용자로부터 점수를 입력받고,
		//점수에 따라 등급을 부여한다
		//100~90 : A
		//89~80 : B
		//79~70 : C
		//69~60 : D
		//60미만 : F
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		char grade = ' '; //char 타입의 기본값 : 공백
		
		//유효성 검사
		if(score > 100 || score < 0) {
			System.out.println("잘못된 입력입니다.");
			return;//메소드 호출부로 즉시 돌아감. 조기리턴
		}
		
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else if(score >= 60) {
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		System.out.println("당신의 등급은 "+grade+"입니다.");
	}

	/*
	 * 여러개의 if절
	 */
	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = sc.nextInt();
		char grade = ' ';
		
		//A
		if(score >= 90) {
			grade = 'A';
		}
		//B
		if(score < 90 && score >= 80) {
			grade = 'B';
		}
		//C
		if(score < 80 && score >= 70) {
			grade = 'C';
		}
		//D
		if(score < 70 && score >= 60) {
			grade = 'D';
		}
		//E
		if(score < 60) {
			grade = 'F';
		}
		System.out.println("당신의 등급은 ["+grade+"]입니다.");
				
	}
	
	/*
	 * 중첩된 if문
	 */
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력:");
		int score = sc.nextInt();
		String grade = "";//A+
		
		if(score >= 90) {
			grade = "A";
			if(score >= 95) {
				grade += "+";
				//grade = grade + "+";
			}
		}
		else if(score >= 80) {
			grade = "B";
			if(score >= 85) {
				grade += "+";
			}
		}
		else if(score >= 70) {
			grade = "C";
			if(score >= 75) {
				grade += "+";
			}
		}
		else if(score >= 60) {
			grade = "D";
			if(score >= 65) {
				grade += "+";
			}
		}
		else{
			grade = "F";
		}
		System.out.println("당신의 등급은 ["+grade+"]입니다.");
	}
	
	/*
	 * 로그인 체크
	 */
	public void test6() {
		//임의 회원정보(DB)
		final String USER_ID = "honggd";
		final String USER_PASSWORD = "1234!";
		
		//사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String userId = sc.next();
		System.out.print("비밀번호 : ");
		String userPwd = sc.next();
		System.out.println("-------------");
		
		//1.로그인 성공(id, pw 모두 일치한 경우)
		//2.로그인 실패
		//  - 비밀번호가 틀린 경우
		//  - 아이디가 없는 경우
		
		//값 비교 ==
		//문자열의 값 비교 equals: str1.equals(str2)
		
		//아이디 일치 여부
		if(USER_ID.equals(userId)) {
			
			//비밀번호 일치 여부
			if(USER_PASSWORD.equals(userPwd)) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("로그인 실패 : 비밀번호가 틀립니다.");
			}
		}
		else {
			System.out.println("로그인 실패 : 아이디가  틀립니다.");
		}
	}
}
