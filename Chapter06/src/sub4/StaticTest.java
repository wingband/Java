package sub4;

/*
 * 
 * Ŭ��������(��������), Ŭ�����żҵ�(�����޼ҵ�), �ǽ��ϱ� ���� p236
 */

public class StaticTest {
	
	public static void main(String[] args) {
		
		// ��ü�������� �ٷ� ȣ�� ���� 
//		Increment.add();
		
//		Increment inc1 = new Increment();
//		Increment inc2 = new Increment();
//		Increment inc3 = new Increment();
		
		
		
		//�Ǽ� ������ ����
//		Increment inc1 = new Increment(1,2);
		
		//�̱��� ��ü ����
		// static�� �߱⶧���� heap�� �ִ� �޼ҵ带 �ҷ����ʿ� ����
//		Calc c = new Calc();   �̷��� ���ʿ����
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
		
		
		//static�� ��� ������ �޼ҵ带 ������ �����ҋ� �ʹ� ���ſ�
		//�׷��� �����ϰ� heap�ȿ� �޼ҵ带 �����ϹǷν� �ʿ��Ѱ͸� �����Ű�� �����Ű�� ��� 
		
		
		
		
	}
}
