package sub1;

public class OperatorTest {

	public static void main(String[] args) {
		// 산술연산자
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num1 * num2;
		int rs4 = num1 / num2;
		int rs5 = num1 % num2;
		int rs6 = 7 % num2;		
		
		System.out.println("re1 : "+rs1);
		System.out.println("re2 : "+rs2);
		System.out.println("re3 : "+rs3);
		System.out.println("re4 : "+rs4);
		System.out.println("re5 : "+rs5);
		System.out.println("re6 : "+rs6);
		
		//증감, 감소 연산자
		int n1 = 1;
		int n2 = 2;
		
		n1++;
		n2--;
		
		++n1;
		--n2;
		System.out.println("n1의 값 : " +n1);
		System.out.println("n2의 값 : " +n2);
		
		//복합대입연산자
		int no1 = 1;
		int no2 = 2;
		int no3 = 3;
		int no4 = 4;
		
		no1 += 1;
		no2 -= 2;
		no3 *= 3;
		no4 /= 4;
		
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		System.out.println(no4);
		
		no1 = no1 + 1;
		no2 = no2 - 2;
		no3 = no3 * 3;
		no4 = no4 / 4;
		
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		System.out.println(no4);
	}
}
