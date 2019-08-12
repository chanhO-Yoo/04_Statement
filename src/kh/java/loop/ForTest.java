package kh.java.loop;

import java.util.Scanner;

public class ForTest {
	public static void main(String[] args) {
		ForTest f = new ForTest();
		f.test();
		
	}
	
	/*
	 * 반복문
	 *  - 몇번 반복해야 되는가?
	 *  - 증감변수는 어떻게 사용할 것인가?
	 */
	public void test() {
		//1. int i = 0 : 증감변수 초기화
		//반복문 최초 1회만 실행
		//2. i<100 : 조건식(논리값을 리턴)
		// - 반복하는 매 턴마다 실행
		// - true면 for문 실행
		// - false이면 for문 탈출
		//3. i++ : 증감식(증감변수를 증가/감소 값 결정)
		for(int i=0; i<10; i++) {
			System.out.println(i + "hello world");
		}
		
		//1~3-까지 짝수만 출력하기
		//2 4 6 8 10 ... 28 30
		//case 1
		for(int i=2; i<=30; i=i+2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//case 2
		for(int i=1; i<=15; i++) {
			System.out.print(i*2+" ");
		}
		System.out.println();
		
		//case 3
		for(int i=1; i<=30; i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.println();		
		
		
		//20부터 2씩 감소해서 2까지 출력하기
		//20 18 16 ... 4 2
		//case1
		for(int i=20;i>1;i=i-2) {
			System.out.print(i+" ");
		}
		System.out.println();		

		//case2
		for(int i=20;i>0;i=i-2) {
			System.out.print(i+" ");
		}
		System.out.println();		

		//case3
		for(int i=19;i>0;i=i-2) {
			System.out.print(i+1+" ");
		}
		System.out.println();
		
		//@사용자로부터 2~9사이의 수를 입력받고 해당 단수의 구구단 출력하기
		//2 입력시 2단 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9사이의 숫자를 입력하세요 : ");
		int dan = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
	}
	
}
