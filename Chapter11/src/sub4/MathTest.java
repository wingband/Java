package sub4;


/*
 * 
 * 수학클래스 실습
 */
//import java.lang.Math;

public class MathTest {
	//Math는 객체를 생성할 수 없는 클래스(SingleTon)
//	Math m = new Math();

	public static void main(String[] args) {
	
		System.out.println(Math.PI);
		System.out.println(Math.abs(-5));
		System.out.println(Math.abs(3.14));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.ceil(1.2));
		System.out.println(Math.ceil(1.8));
		System.out.println(Math.floor(1.8));
		System.out.println(Math.floor(1.2));
		System.out.println(Math.round(1.2));
		System.out.println(Math.round(1.2));
		
		double num1 = Math.random();
		System.out.println((int)(+num1));
		
		//이렇게하면 0이 나옴
		int num2 = (int) (Math.random()*10);
		System.out.println(+num2);
		
		//1~10사이 정수
		double num3 = Math.ceil(num2);
		System.out.println(+num3);

		// 1 ~ n까지
		double num4 = num1* 45;
		System.out.println((int)(num4));
		
		
	}
	
	
	
	
	
	
}
