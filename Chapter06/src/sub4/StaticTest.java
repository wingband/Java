package sub4;

/*
 * 
 * 클래스변수(정적변수), 클래스매소드(정적메소드), 실습하기 교재 p236
 */

public class StaticTest {
	
	public static void main(String[] args) {
		
		// 객체생성없이 바로 호출 가능 
//		Increment.add();
		
//		Increment inc1 = new Increment();
//		Increment inc2 = new Increment();
//		Increment inc3 = new Increment();
		
		
		
		//실수 생성자 생성
//		Increment inc1 = new Increment(1,2);
		
		//싱글톤 객체 생성
		// static을 했기때문에 heap에 있는 메소드를 불러올필요 없음
//		Calc c = new Calc();   이렇게 할필요없이
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		
		int r1 = c1.plus(1, 2);
		int r2 = c1.minus(1, 2);
		int r3 = c1.multi(1, 2);
		int r4 = c1.div(1, 2);
		
		System.out.println("r1 = " +r1);
		System.out.println("r2 = " +r2);
		System.out.println("r3 = " +r3);
		System.out.println("r4 = " +r4);
		
		
		//static에 모든 변수와 메소드를 넣으면 시작할떄 너무 무거움
		//그래서 적절하게 heap안에 메소드를 생성하므로써 필요한것만 실행시키고 종료시키는 방식 
		
		
		
		
	}
}
