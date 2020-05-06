package sub1;

/*
 * 
 * 자바 Method 함수 실습
 */
public class MethodTest {
	public static void main(String[] args) {
		
		//Method 실행 (호출)
//		int y;
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		int y4 = f(4);
		System.out.println(+y1);
		System.out.println(+y2);
		System.out.println(+y3);
		System.out.println(+y4);
//		for (y=1; y<5; y++) {
//		System.out.println(+zy);
//		}
		
		System.out.println("===============");
		
		int z1 = add(1,2);
		int z2 = add(3,4);
		int z3 = add(5,6);
		
		System.out.println(+z1);
		System.out.println(+z2);
		System.out.println(+z3);
		
		
}
	// f Method 정의 
	public static int f(int x) {
		int y = 2*x+3;
		return y;
	}
	
//	add Method 정의
	public static int add(int x, int y) {
		int z = x + y;
		return z;
		}
	
	public static int sum(int start, int end)
	{
		int sum = 0;
		for (int a=start; sum<end; a++) {
			sum += a;
		}
		return sum;
	}

		
	
}
