package kh.java.api.random.number;

import java.util.Random;
import java.util.Scanner;

/**
 * 자바에서 난수 생성하기
 * 
 * 1.java.util.Random;
 * 2.java.lang.Math.random;
 * 
 *
 */
public class RandomNumberTest {
	public static void main(String[] args) {
		RandomNumberTest r = new RandomNumberTest();
//		r.test1();
//		r.test2();
		r.coinTest();
	}
	
	/*
	 * Random 객체 이용하기
	 */
	public void test1() {
		Random rnd = new Random();
		
		//매개인자 없는 nextInt : int 범위에서 난수 생성한다.
//		int rndNum = rnd.nextInt();
		//매개인자(값의 범위)를 받는 nextInt();
		//1부터 10까지 난수발생
		//nextInt(경우의수)+시작값
		int rndNum = rnd.nextInt(10)+1;
		System.out.println("rndNum = "+rndNum);
		
		//@실습문제 : 5부터 10까지의 난수 발생
		//경우의 수 : 6
		//시작값 : 5
		int num = rnd.nextInt(6)+5;
		System.out.println("num = "+num);
		
		//@실습문제
		//경우의 수 : 최대값 - 최소값 + 1
		int rnd1 = rnd.nextInt(10);//0~9까지 난수
		int rnd2 = rnd.nextInt(10)+1;//1~10까지 난수
		int rnd3 = rnd.nextInt(35-20+1)+20;//20~35까지 난수
		int rnd4 = rnd.nextInt(2);//0~1까지 난수
		
		System.out.println("============");
		System.out.println("rnd1="+rnd1);
		System.out.println("rnd2="+rnd2);
		System.out.println("rnd3="+rnd3);
		System.out.println("rnd4="+rnd4);
		
		System.out.println("---------------");
		System.out.println(rnd.nextBoolean());//boolean(불린) type의 난수 출력
		System.out.println(rnd.nextDouble());//double(실수) type의 난수 출력
	}
	
	/*
	 * Math.random() 사용
	 * 0.0(inclusive) ~ 1.0(exclusive)
	 * 사이의 난수(실수)를 발생
	 */
	public void test2() {
		double rndNum = Math.random();
		System.out.println("rndNum = "+rndNum);
		
		//1~10사이의 난수 
		//(int)(Math.random()*경위의 수) + 시작값
		int iNum = (int)(rndNum*10)+1;
		System.out.println("iNum = "+iNum);
	}
	
	public void coinTest() {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int comCoin = rnd.nextInt(2)+1;
		int userCoin;
		
		System.out.println("==========================");
		System.out.println("\t동전게임");
		System.out.println("==========================");
		System.out.println("앞뒤면을 선택하세요(1.앞면 2.뒷면)");
		userCoin = sc.nextInt();
		
		System.out.printf("comCoin=%d, userCoin=%d\n",comCoin, userCoin);
		
		if(userCoin == comCoin) {
			System.out.println("맞췄습니다.");
		}
		else {
			System.out.println("틀렸습니다.");
		}
		
		System.out.println("--- 게임 종료 ---");
	}
}
