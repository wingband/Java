package sub4;


/*
 * 
 * ����Ŭ���� �ǽ�
 */
//import java.lang.Math;

public class MathTest {
	//Math�� ��ü�� ������ �� ���� Ŭ����(SingleTon)
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
		
		//�̷����ϸ� 0�� ����
		int num2 = (int) (Math.random()*10);
		System.out.println(+num2);
		
		//1~10���� ����
		double num3 = Math.ceil(num2);
		System.out.println(+num3);

		// 1 ~ n����
		double num4 = num1* 45;
		System.out.println((int)(num4));
		
		
	}
	
	
	
	
	
	
}
