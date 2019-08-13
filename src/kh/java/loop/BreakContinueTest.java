package kh.java.loop;

import java.util.Scanner;

/*
 * break : break 키워드를 만나며 반복문을 중지한다 -> 반복문이 종료되는 곳으로 이동
 * continue : continue 키워드를 만나면 continue 이후 코드는 실행하지 않고, 반복문의 처음(조건식)으로 이동한다.
 * 			: "for문의 경우 증감식으로 이동한다"
 */

public class BreakContinueTest {
	public static void main(String[] args) {
		BreakContinueTest b = new BreakContinueTest();
//		b.test1();
//		b.test2();
//		b.test3();
//		b.test4();
//		b.test5();
		b.test6();
	}
	
	/*
	 * break 예제
	 */
	public void test1() {
//		for(int i=0; i<1000; i++) {
//			
//			System.out.println(i);
//			
//			if(i==50) {
//				break;
//			}
//			
//			System.out.println(i);
//			
//		}
		
		int j=0;
		while(true) {
			System.out.println(j);
			if(j==50) {
				break;
			}
			j++;
		}
		
		System.out.println("=====종료=====");
	}
	
	/*
	 * 1부터 사용자 입력값까지의 합을 구하시오
	 * while(true) 사용
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int inputNum = sc.nextInt();
		int sum=0;
		
		//while문
		while(true) {
			sum += inputNum;

			System.out.println(inputNum);
			if(inputNum==0) {
				break;
			}
			inputNum--;
		}
		
		//for문
		for(int i = inputNum;true;i--) { // 조건식 -> true 또는 생략  => while(true)와 같다.
			sum += inputNum;
			if(inputNum==0) {
				break;
			}
		}
		
		System.out.println(sum);
	}
	
	/*
	 * 1부터 100까지 짝수만 출력 for문 이용
	 */
	public void test3() {
		for(int i=1;i<=100;i++) {
			//홀수일 경우 continue
			if(i%2!=0) {
				continue;//반복문의 이하 코드를 실행하지 않고
						 //반복문의 처음으로 돌아간다.
						 //for문의 경우 증감식으로 돌아간다.
			}
			System.out.println(i+" ");
		}
	}
	
	public void test4() {
		int i=0;
		while(i<=100) {			
			i++;//증감식이 continue 아래 있으면 증감식이 돌아가질 않는다.
			
			if(i%2!=0) {
				continue;//반복문의 처음, 조건식으로 돌아간다.
			}

			System.out.println(i+" ");
			
		}
	}
	
	/*
	 * @실습문제 : 1부터 사용자 입력값까지 홀수의 곱은?
	 * for문 사용
	 */
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int inputNum = sc.nextInt();
		int multiSum = 1;
		
		for(int i=1;i<=inputNum;i++) {
			if(i%2 == 0) {
				continue;
			}
			multiSum *= i;
		}
		System.out.println("totla = "+multiSum);
	}
	
	/*
	 * @실습문제 : 1부터 사용자 입력값까지 홀수의 곱은?
	 * while문 사용
	 */
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int inputNum = sc.nextInt();
		int multiSum = 1;
		int i =1;
		
		while(i < inputNum) {
			i++;
			if(i%2==0) {
				continue;
			}
			multiSum *= i;
		}
		
//		for(i=1;i<=inputNum;i++) {
//			if(i%2==0) {
//				continue;
//			}
//			multiSum *= i;
//		}
		
//		while(true) {
//			i++;
//			if(i%2==0) {
//				continue;
//			}
//			
//			
//			if(i>inputNum) {break;}
//			
//			multiSum *= i;
//		}
		System.out.println(multiSum);
	}
}
