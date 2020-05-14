package sub1;


/*
 * 
 *  예외처리
 * 
 */
public class ExceptionTest {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		
		int r1 = 0, r2=0,r3=0,r4 = 0;
			
		
		try {
		r1 = num1 + num2;
		r2 = num1 - num2;
		r3 = num1 * num2;
		
		// r4를 일단 0으로 설정 왜냐하면 무조건 출력을 해줘야하기 때문에
		r4 = num1 / num2;
		
		// 그리고 나서 r4 연산식으로 들어감 
		// 계산 때려보고 안되면 그냥 r4=0으로 나타냄
		
			//에러가 발생할 가능성이 있는 코드로직
			
		} catch (Exception e) {
			// 에러가 발생햇을때 처리할 로직
			e.printStackTrace();
		}
		
		
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		
		
		
		
		System.out.println("프로그램 종료");
	}

}
