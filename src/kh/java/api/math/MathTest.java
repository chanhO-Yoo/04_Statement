package kh.java.api.math;

public class MathTest {

	public static void main(String[] args) {
		MathTest m = new MathTest();
//		m.test();
		m.test2();
	}
	public void test() {
		double result = 0.0;
		//1.올림 ceiling : 7.8보다 큰 최소 실수
		//double java.lang.Math.ceil(double a)
		result = Math.ceil(7.8);
		result = Math.ceil(7.2);
		System.out.println("올림 result="+result);
		//2.내림 floor : 7.8보다 작은 최대 실수
		//double java.lang.Math.floor(double a)
		result = Math.floor(7.8);
		result = Math.floor(-7.8);
		System.out.println("내림 result="+result);
		//3.반올림 round
		//long java.lang.Math.round(double a)
		//소수점이하 자리를 지정할 수 없다.
		long result2 = Math.round(94.527);
		System.out.println("반올림 result="+result2);
		
		//반올림해서 소수점이하 두번쨰자리까지 표현
		//94.527 -> 94.53
		//9452.7 -> 9453
		//94.53
		double result3 = Math.round(94.527*100)/100.0; // Math.round() -> 정수, 100 -> 정수 ==> 정수/정수 => 정수
		System.out.println("반올림 소수점 두번째자리="+result3);
	}
	
	//홍길동의 과목점수는 다음과 같다.
	//국어:87
	//영어:67
	//수학:55
	//과목별 평균점수는 소수점이하 첫번째자리 까지 반올림해서 출력
	public void test2() {
		int kScore = 87;
		int eScore = 67;
		int mScore = 55;
		
		int sum = kScore + eScore + mScore;
		double avg1 = sum / 3.0;
		double avg2 = Math.round(avg1 * 10) / 10.0;
		
		System.out.println("홍길동의 평균 점수는 "+avg1+"입니다");
		System.out.println("홍길동의 평균 점수는 "+avg2+"입니다");
		
		
	}
}
