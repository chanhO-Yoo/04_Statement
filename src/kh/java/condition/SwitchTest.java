package kh.java.condition;

import java.util.Scanner;

/*
 * switch문
 * switch문의 괄호 안에는 변수나 계산식만 들어갈 수 있다.
 * (범위로 표현할 수 없다)
 * 괄호 안에 허용하는 데이터타입
 *  - byte, short char, int, String(jdk 1.7이상)
 *  - long double float 불가능
 */
public class SwitchTest {
	public static void main(String[] args) {
		SwitchTest s = new SwitchTest();
//		s.test1();
		s.test2();
		
	}
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 과일 번호를 선택하세요.");
		System.out.println("1.사과 2.바나나 3.오렌지");
		System.out.print(">> ");
		
		int num = sc.nextInt();
		String color = "";
		
		switch(num) {
		case 1: 
			color = "빨간색"; 
			break;//현재 속한 블록을 벗어난다.
		case 2: 
			color = "노란색"; 
			break;
//			break;//break를 사용하지 않으면 다음 case도 작동하고 처음 만나는 break에서 탈출
		case 3:
			color = "주황색";
			break;
		default:
			System.out.println("잘못 입력했습니다.");
			return;//잘못 입력된 경우 과일 색상을 알려주지 않고 종료한다.
		}
		
		System.out.println("선택한 과일의 컬러는 [" + color + "]입니다");
		
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		String menu = "===========\n"
					+ "메뉴\n"
					+ "-----------\n"
					+ "1.순대국 : 7000원\n"
					+ "2.김치찌개 : 6500원\n"
					+ "3.엄마표도시락 : 8000원\n"
					+ "-----------\n"
					+ ">> ";
		
		System.out.println(menu);
		
		int choice = sc.nextInt();
		int price = 0;
		
		//@실습문제 : 사용자가 선택한 메뉴의 가격을 출력하세요
		switch(choice) {
		case 1:
			price = 7000;
			break;
		case 2:
			price = 6500;
			break;
		case 3:
			price = 8000;
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			return;
		}
		System.out.println("선택한 메뉴의 가격은 " + price + "입니다.");
	}
}
