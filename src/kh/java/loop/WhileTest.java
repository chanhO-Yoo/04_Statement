package kh.java.loop;

import java.util.Scanner;

/*
 * While문
 * 
 * [초기식]
 * while([조건식]){
 * 	.... 반복 실행 로직
 * 	[증감식]
 * }
 */

public class WhileTest {

	public static void main(String[] args) {
		WhileTest w = new WhileTest();
//		w.test();
//		w.test2();
//		w.test3();
//		w.test4();
//		w.test5();
//		w.test6();
		w.test7();
	}
	
	public void test() {
		//초기식
		int i=0;
		//조건식 : true이면 실행, false이면 반복문 탈출
		while(i<3) {
			System.out.println("Hello World"+i);
			i++;
		}
		
	}
	
	//1부터 20까지 홀수만 출력하기
	public void test2() {
		int i = 1;
		String odd = "";
		while(i<=20) {
			if(i%2==1) {
				odd+=i+" ";
			}
			i++;
		}
		System.out.println(odd);
	}

	//20부터 0까지 짝수만 출력하기
	public void test3() {
		int i = 20;
		String even = "";
		while(i>0) {
			if(i%2==0) {
				even +=i+" ";
			}
			i--;
		}
		System.out.println(even);
	}
	//사용자 이름과 출력 회수를 입력받아 해당 횟수만큼 출력하기
	public void test4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("횟수를 입력하세요 : ");
		int count = sc.nextInt();
		
		while(count>0) {
			System.out.println(name);
			count--;
		}
	}
	
	/*
	 * while : 조건식 -> 실행
	 * do .. while : 실행 -> 조건식
	 *   - 사용자 메뉴 제공
	 */
	public void test5() {
		//임의의 게임 후 계속 할지 여부에 따라
		//반복 혹은 중지 결정
		Scanner sc = new Scanner(System.in);
		char wannaContinue = 'y';
		
		do {
			System.out.println("======게임시작======");
			System.out.println("얍빡쿵~");
			System.out.println("======게임종료======");
			
			System.out.print("게임을 계속 하시겠습니까?(y/n) => ");
			wannaContinue = sc.next().charAt(0);
		}while(wannaContinue == 'y');
		
		System.out.println("프로그램 종료");
	}
	
	public void test6() {
		Scanner sc = new Scanner(System.in);
		String menu = "===============\n"
				+ "1.입금\n"
				+ "2.출금\n"
				+ "3.계좌이체\n"
				+ "4.상담원연결\n"
				+ "9.종료\n"
				+ "===============\n"
				+ "선택 : ";
		
		int choice;
		do {
			System.out.print(menu);
			choice = sc.nextInt();
			System.out.println("["+choice+"]를 선택하셨습니다.");
			
		}while(choice != 9);
		System.out.println("<<< 이용해 주셔서 감사합니다.");
	}
	
	//사용자에게 2~9사이의 단수를 입력받아 구구단을 출력하세요.
	//2~9사이의 수가 아니라면 잘못 입력하셨습니다 출력
	//출력후 사용자에게 계속 할지 여부를 입력받아(y/n)반복 처리(do..while문 사용)
	public void test7() {
		
		Scanner sc = new Scanner(System.in);
		char continueChar = 'y';

		//반복문(정수 입력받기)
		do {
			System.out.print("정수를 입력하세요 : ");	
			int dan = sc.nextInt();
			//조건문(입력받은 정수가 2~9사이 값인지를 확인)
			if(dan>=2 && dan<=9) {
				//반복문(조건문에 만족하면 구구단 실행)
				for(int i=1;i<=9;i++) {
					System.out.println(dan+" X "+i+" = "+dan*i);
				}
			}
			//조건문(입력받은 정수가 2~9사이가 아닐 때 실행)
			else {
				System.out.println("잘못입력하셨습니다.");
			}
			
//			//조건문2
//			if(dan<2 || dan>9) {
//				//반복문(조건문에 만족하면 구구단 실행)
//				System.out.println("잘못입력하셨습니다.");
//				return; //메소드를 호출한 곳으로 돌아간다 => 여기서는 메인 메소드로 돌아간다.
//			}
//			//조건문(입력받은 정수가 2~9사이가 아닐 때 실행)
//			else {
//				for(int i=1;i<=9;i++) {
//					System.out.println(dan+" X "+i+" = "+dan*i);
//				}
//			}
			//계속 할지 입력
			System.out.print("계속 하시겠습니까?(y/n) : ");
			continueChar = sc.next().charAt(0); // 소문자만 입력가능
//			continueChar = sc.next().toLowerCase().charAt(0); // 대소문자 구분없이 입력가능
			}while(continueChar == 'y');
		
		System.out.println("종료되었습니다.");
	}
}
