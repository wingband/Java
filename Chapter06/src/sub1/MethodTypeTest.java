package sub1;


/*
 * 
 * Method Type �ǽ��ϱ�
 * 
 */
public class MethodTypeTest {
	
	// �̰� ���� �Լ�
	public static void main(String[] args) {
	
		System.out.println("====type1====");
		double y1 = type1(2.33);
		System.out.println(y1);
		
		System.out.println("====type2====");
		// a �� ������ true�� false�� ����
		type2(false);
				
		System.out.println("====type3====");
		boolean y3 = type3();
		System.out.println(y3);
		
		
		System.out.println("====type4====");
		type4();
		
		System.out.println("====������====");
//		int gugudan_result = gugudan(2);
		gugudan2(4);
		
		
	}
	// main end
	
	// type 1 : �Ű����� o , ���ϰ� o
	public static double type1(double a) {
		
		double result = a +3.14;
		return result;
	}
		
	// type 2 : �Ű����� o , ���ϰ� x
	public static void type2(boolean a) {
		
		if(a) {
			System.out.println("���Դϴ�.");
			
		}else
		{
			System.out.println("�����Դϴ�");
		}
		
	}
	
	// type 3 : �Ű����� x , ���ϰ� o
	public static boolean type3( ) {
		int num1 = 1, num2 =2;
		if(num1>num2) {
			return true;
			
		}else {
			return false;
			
		}
		
	}
	
	
	// type 4 : �Ű����� x , ���ϰ� x
	public static void type4() {
		double y = type1(0.1);
		System.out.println("type1(0.1) : "+y);
	}
	
	
//	
//	public static int gugudan(int a) {
//		
//		int sum = 0;
//		for(int i=1; i<10; i++) {
//			sum = i * a;
//		}
//		return sum;
//	}
//	
	
	public static void gugudan2(int a) {
		
		for(int i=1; i<10; i++) {
			System.out.println(a+"x"+i+" = "+a*i);	
		}
		
		
	}
	

}



